package com.moringaschool.divaapp.UI;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.moringaschool.divaapp.R;
import com.moringaschool.divaapp.models.Business;
import com.moringaschool.divaapp.models.Category;
import com.squareup.picasso.Picasso;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class MediaDetailFragment extends Fragment {
    @BindView(R.id.mediaImageView) ImageView mImageLabel;
    @BindView(R.id.mediaImageView) TextView mNameLabel;
    @BindView(R.id.cuisineTextView) TextView mCategoriesLabel;
    @BindView(R.id.ratingTextView) TextView mRatingLabel;
    @BindView(R.id.websiteTextView) TextView mWebsiteLabel;
    @BindView(R.id.phoneTextView) TextView mPhoneLabel;
    @BindView(R.id.addressTextView) TextView mAddressLabel;
    @BindView(R.id.saveMediaButton) TextView mSaveMediaButton;

    private Business mMedia;

    public MediaDetailFragment() {
        // Required empty public constructor
    }

    public static MediaDetailFragment newInstance(Business media){
        MediaDetailFragment mediaDetailFragment =  new MediaDetailFragment();
        Bundle args = new Bundle();
        args.putParcelable("media", Parcels.wrap(media));
        mediaDetailFragment.setArguments(args);
        return mediaDetailFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mMedia =  Parcels.unwrap(getArguments().getParcelable("media"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_media_detail, container, false);
        View view = inflater.inflate(R.layout.activity_media_detail, container, false);
        ButterKnife.bind(this, view);

        Picasso.get().load(mMedia.getImageUrl()).into(mImageLabel);

        List<String> categories = new ArrayList<>();

        for (Category category: mMedia.getCategories()) {
            categories.add(category.getTitle());
        }

        mNameLabel.setText(mMedia.getName());
        mCategoriesLabel.setText(android.text.TextUtils.join(", ", categories));
        mRatingLabel.setText(Double.toString(mMedia.getRating()) + "/5");
        mPhoneLabel.setText(mMedia.getPhone());
        mAddressLabel.setText(mMedia.getLocation().toString());

        return view;
    }

}
