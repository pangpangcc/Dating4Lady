package com.qpidnetwork.ladydating.chat.noramlexp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;

import com.qpidnetwork.ladydating.R;
import com.qpidnetwork.ladydating.chat.ChatActivity;

/**
 * 
 * 表情说明： 接口表情定义：从[img:0]--[img:19]范围
 * 
 */
public class ExpressionGridAdapter extends BaseAdapter {

	private Context context;
	private TypedArray expressionsIcons;
	private int[] expressionsValues;

	private int startItem; // 当前页起始号
	private int itemCount; // 当前页数量

	public ExpressionGridAdapter(Context context, int pageIndex, int itemCount) {
		this.context = context;
		expressionsIcons = context.getResources().obtainTypedArray(R.array.expressions);
		expressionsValues = context.getResources().getIntArray(R.array.expressions_value);
		this.startItem = pageIndex * itemCount;
		this.itemCount = expressionsValues.length < (pageIndex + 1) * itemCount ? (expressionsValues.length - pageIndex * itemCount) : itemCount;
	}

	@Override
	public int getCount() {
		// return expressionsIcons.length();
		return itemCount;
	}

	@Override
	public Object getItem(int position) {
		return expressionsValues[startItem + position];
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@SuppressWarnings("deprecation")
	@SuppressLint("NewApi") @Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		float density = context.getResources().getDisplayMetrics().density;
		Display display = ((Activity) context).getWindowManager().getDefaultDisplay();
		Point size = new Point();
		
		if(Build.VERSION.SDK_INT > 12){
			display.getSize(size);
		}else{
			size.x = display.getWidth();
			size.y = display.getHeight();
		}
		
		int item_size = (int)(((float)size.x - (int)(5.0f * density)) / 6);

		
		LinearLayout holder = new LinearLayout(context);
		holder.setLayoutParams(new AbsListView.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		holder.setBackgroundColor(context.getResources().getColor(R.color.thin_grey));
		
		ImageView iv = new ImageView(context);
		iv.setLayoutParams(new LinearLayout.LayoutParams(item_size, item_size));
		iv.setScaleType(ScaleType.CENTER);
		iv.setClickable(true);

		iv.setBackgroundResource(R.drawable.touch_feedback_holo_light);
		Drawable drawable = expressionsIcons.getDrawable(startItem + position);
		if (drawable != null) {
			iv.setImageDrawable(drawable);
		}
		iv.setTag(R.id.item_position, position);
		iv.setOnClickListener(itemOnClick);
		holder.addView(iv);
		
		return holder;
	}

	private View.OnClickListener itemOnClick = new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			int position = (Integer) v.getTag(R.id.item_position);
			int eid = (Integer) getItem(position);
			ChatActivity activity = (ChatActivity) context;
			activity.selectEmotion(eid);
		}
	};

}
