package com.example.gallery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class CustomGallery extends BaseAdapter {
    Context context;
    public int[] images;
    CustomGallery(Context c,int[] im)
    {
        context=c;
        images=im;
    }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView=new ImageView(context);
        imageView.setImageResource(images[position]);
        imageView.setLayoutParams(new Gallery.LayoutParams(100,100));
        return imageView;
    }
}
