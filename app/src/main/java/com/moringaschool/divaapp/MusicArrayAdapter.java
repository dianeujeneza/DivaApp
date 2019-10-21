package com.moringaschool.divaapp;

import android.content.Context;
import android.widget.ArrayAdapter;

public class MusicArrayAdapter extends ArrayAdapter {

    private Context mContext;
    private String[] mTracks;
    private String[] mGenres;

    public MusicArrayAdapter(Context mContext, int resource, String[] mTracks, String[] mGenres){
        super(mContext, resource);
        this.mContext = mContext;
        this.mTracks = mTracks;
        this.mGenres = mGenres;
    }

    @Override
    public Object getItem(int position){
        String track = mTracks[position];
        String genre = mGenres[position];
        return String.format("%s \nSounds good:%s",track,genre);
    }

    @Override
    public int getCount(){
        return mTracks.length;
    }
}
