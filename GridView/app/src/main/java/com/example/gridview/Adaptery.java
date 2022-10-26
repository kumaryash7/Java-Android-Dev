package com.example.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

public class Adaptery extends BaseAdapter {
    private Context mContext;



    public Adaptery(Context c){
        mContext =c;

    }

    public int getCount(){
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position){
        return 0;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if(convertView == null){
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(500,500));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8,8,8,8);

        }

        else {
            imageView = (ImageView)  convertView;

        }
        imageView.setImageResource(mThumbIds[position]);
        return imageView;

    }

    public Integer[] mThumbIds ={R.drawable.image1,R.drawable.interstellar_poster,R.drawable.imageeee,R.drawable.skyyy};
}
