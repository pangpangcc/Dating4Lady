package com.qpidnetwork.ladydating.chat.picture;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.qpidnetwork.ladydating.R;
import com.qpidnetwork.ladydating.chat.downloader.LivechatSelfPhotoDownloader;
import com.qpidnetwork.ladydating.customized.view.MaterialProgressBar;
import com.qpidnetwork.request.RequestJniLivechat.PhotoSizeType;

public class LivechatAlbumAdapter extends BaseAdapter{
	
	private Context mContext;
	private AlbumPhotoItem[] photoList;
	
	public LivechatAlbumAdapter(Context context, AlbumPhotoItem[] photoList){
		this.mContext = context;
		this.photoList = photoList;
	}

	@Override
	public int getCount() {
		int count = 0;
		if(photoList != null){
			count = photoList.length;
		}
		return count;
	}

	@Override
	public Object getItem(int position) {
		return position;
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@SuppressLint("NewApi")
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder = null;
		if(convertView == null){
			convertView = LayoutInflater.from(mContext).inflate(R.layout.item_album_adapter, null);
			holder = new ViewHolder(convertView);
		}else{
			holder = (ViewHolder)convertView.getTag();
		}
		
		AlbumPhotoItem item = photoList[position];
		
		float density = mContext.getResources().getDisplayMetrics().density;
		Display display = ((WindowManager)mContext.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
		Point size = new Point();
		
		if(Build.VERSION.SDK_INT > 12){
			display.getSize(size);
		}else{
			size.x = display.getWidth();
			size.y = display.getHeight();
		}
		
		int item_size = (int)(((float)size.x - (int)(1.0f * density)) / 3);
		convertView.setLayoutParams(new AbsListView.LayoutParams(item_size, item_size));
		
		/*头像处理*/
		if ( null != holder.downloader ) {
			// 停止回收旧Downloader
			holder.downloader.resetDownloader();
		}else{
			holder.downloader = new LivechatSelfPhotoDownloader(mContext);
		}
		
		holder.ivAlbum.setImageDrawable(new ColorDrawable(Color.parseColor("#16000000")));;
		holder.downloader.DisplayImage(holder.ivAlbum, item.photoItem.photoId, PhotoSizeType.Large, item_size, item_size);
		
		switch (item.photoStatus) {
		case NONE:{
			holder.progressBar.setVisibility(View.GONE);
			holder.ivError.setVisibility(View.GONE);
		}break;
		case CHECKING:{
			holder.progressBar.setVisibility(View.VISIBLE);
			holder.ivError.setVisibility(View.GONE);
		}break;
		case FAIL_SENDED:{
			holder.progressBar.setVisibility(View.GONE);
			holder.ivError.setVisibility(View.VISIBLE);
		}break;
		default:
			break;
		}

		
		return convertView;
	}
	
	private class ViewHolder{
		public ImageView ivAlbum;
		public View viewShadow;
		public MaterialProgressBar progressBar;
		public ImageView ivError;
		public LivechatSelfPhotoDownloader downloader;
		
		public ViewHolder(View v){
			this.ivAlbum = (ImageView)v.findViewById(R.id.ivAlbum);
			this.viewShadow = (View)v.findViewById(R.id.viewShadow);
			this.progressBar = (MaterialProgressBar)v.findViewById(R.id.progressBar);
			this.ivError = (ImageView)v.findViewById(R.id.ivError);
			this.downloader = null;
			v.setTag(this);
		}
	}
}
