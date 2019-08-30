package com.example.playlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String artistList[];
    int photoList[];
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, String[] artistList, int[] photoList) {
        this.context = applicationContext;
        this.artistList = artistList;
        this.photoList = photoList;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return artistList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.activity_list_view, null);
        TextView artist = (TextView) view.findViewById(R.id.textView);
        ImageView photo = (ImageView) view.findViewById(R.id.icon);
        artist.setText(artistList[i]);
        photo.setImageResource(photoList[i]);
        return view;
    }
}