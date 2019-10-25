package com.moringaschool.divaapp.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.moringaschool.divaapp.R;
import com.moringaschool.divaapp.adapters.MediaPagerAdapter;
import com.moringaschool.divaapp.models.Business;

import org.parceler.Parcels;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MediaDetailActivity extends AppCompatActivity {

    @BindView(R.id.viewPager) ViewPager mViewPager;
    private MediaPagerAdapter adapterViewPager;
    List<Business> mMedias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_detail);

        ButterKnife.bind(this);

        mMedias = Parcels.unwrap(getIntent().getParcelableExtra("medias"));
        int startingPosition = getIntent().getIntExtra("position", 0);

        adapterViewPager = new MediaPagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT, mMedias);
        mViewPager.setAdapter(adapterViewPager);
        mViewPager.setCurrentItem(startingPosition);
    }
}
