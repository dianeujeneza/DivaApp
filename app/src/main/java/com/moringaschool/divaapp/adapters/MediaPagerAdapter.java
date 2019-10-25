package com.moringaschool.divaapp.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.moringaschool.divaapp.UI.MediaDetailFragment;
import com.moringaschool.divaapp.models.Business;

import java.util.List;

public class MediaPagerAdapter extends FragmentPagerAdapter {
    private List<Business> mMedias;

    public MediaPagerAdapter(FragmentManager fm, int behavior, List<Business> medias) {
        super(fm, behavior);
        mMedias = medias;
    }

    @Override
    public Fragment getItem(int position) {
        return MediaDetailFragment.newInstance(mMedias.get(position));
    }

    @Override
    public int getCount() {
        return mMedias.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mMedias.get(position).getName();
    }
}
