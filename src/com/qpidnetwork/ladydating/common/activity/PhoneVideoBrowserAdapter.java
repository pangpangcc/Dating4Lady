package com.qpidnetwork.ladydating.common.activity;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.qpidnetwork.ladydating.R;
import com.qpidnetwork.ladydating.utility.Converter;
import com.qpidnetwork.ladydating.utility.DeviceUtil;
import com.qpidnetwork.ladydating.utility.ImageUtil;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class PhoneVideoBrowserAdapter extends BaseAdapter{

	private Context context;
	private ArrayList<VideoItem> photoList;
	
	/**
	 * Below SoftReference is responsible to keep the bitmap for further reuses which has been decoded. 
	 * At the same time, it can be recycled automatically by the system if necessary.
	 */
	private Map<String, SoftReference<Bitmap>> softReferenceMap = new HashMap<String, SoftReference<Bitmap>>();
	
	public PhoneVideoBrowserAdapter(Context context, ArrayList<VideoItem> photoList){
		this.context = context;
		this.photoList = photoList;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return photoList.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		ViewHolder holder;
		VideoItem item = photoList.get(position);
		
		if (convertView == null){
			convertView = LayoutInflater.from(context).inflate(R.layout.item_for_phone_video_browser, null);
			holder = new ViewHolder(convertView);
		}else{
			holder = (ViewHolder)convertView.getTag();
		}
		
		holder.thumbnailUri = item.thumbnailUri;
		holder.position = position;
		holder.duration.setText(item.duraion + " " + context.getString(R.string.seconds));
		
		final int viewSize = setItemLayoutSize(holder);
		
		if (Build.VERSION.SDK_INT >= 21) holder.touchPoint.setBackgroundResource(R.drawable.rectangle_ripple_holo_light);
		
		/**
		 * this trick will load image smoothly.
		 */
		new AsyncTask<ViewHolder, Void, SoftReference<Bitmap>>(){
			
			private ViewHolder holder;

			@Override
			protected SoftReference<Bitmap> doInBackground(ViewHolder... params) {
				// TODO Auto-generated method stub
				holder = params[0];
				if (softReferenceMap.containsKey(holder.thumbnailUri) &&
					softReferenceMap.get(holder.thumbnailUri).get() != null)
					return softReferenceMap.get(holder.thumbnailUri);
				
				Bitmap bmp = ImageUtil.decodeSampledBitmapFromFile(holder.thumbnailUri, viewSize, viewSize);
				softReferenceMap.put(holder.thumbnailUri,  new SoftReference<Bitmap>(bmp));
				return softReferenceMap.get(holder.thumbnailUri);
			}
			
			@Override
			protected void onPostExecute(SoftReference<Bitmap> softRefecence){
				super.onPostExecute(softRefecence);
				if (holder.position != position) return;
				holder.thumbnailPhoto.setImageBitmap(softRefecence.get());
			}
			
		}.execute(holder);
		
		return convertView;
	}
	
	private int setItemLayoutSize(ViewHolder holder){
		int size = (DeviceUtil.getScreenSize().x - Converter.dp2px(4)) / 2;
		RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams)holder.thumbnailPhoto.getLayoutParams();
		params.height = size;
		params.width = size;
		holder.thumbnailPhoto.setLayoutParams(params);
		holder.touchPoint.setLayoutParams(params);
		return size;
		
	}
	
	public static class VideoItem{
		public String videoUri;
		public String thumbnailUri;
		public long duraion;
		public VideoItem(String videoUri, String thumbnailUri, long duration){
			this.videoUri = videoUri;
			this.thumbnailUri = thumbnailUri;
			this.duraion = (long)(duration / 1000);
		}
	}
	
	private class ViewHolder{
		public TextView duration;
		public ImageView thumbnailPhoto;
		public View touchPoint;
		public int position;
		public String videoUri;
		public String thumbnailUri;
		public ViewHolder(View convertView){
			duration = (TextView) convertView.findViewById(R.id.duration);
			thumbnailPhoto = (ImageView) convertView.findViewById(R.id.image);
			touchPoint = convertView.findViewById(R.id.touchPoint);
			convertView.setTag(this);
		}
	}
	

}
