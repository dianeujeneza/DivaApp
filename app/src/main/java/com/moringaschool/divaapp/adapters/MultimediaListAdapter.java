package com.moringaschool.divaapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.divaapp.R;
import com.moringaschool.divaapp.models.Business;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MultimediaListAdapter extends RecyclerView.Adapter<MultimediaListAdapter.MultimediaViewHolder> {
    private List<Business> mMedias;
    private Context mContext;

    public MultimediaListAdapter(Context context, List<Business>medias){
        mContext = context;
        mMedias = medias;
    }

    @Override
    public MultimediaListAdapter.MultimediaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.media_list_item, parent, false);
        MultimediaViewHolder viewHolder = new MultimediaViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MultimediaListAdapter.MultimediaViewHolder holder, int position) {
        holder.bindMedias(mMedias.get(position));
    }

    @Override
    public int getItemCount() {
        return mMedias.size();
    }

    public class MultimediaViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.mediaImageView) ImageView mMediaImageView;
        @BindView(R.id.mediaNameTextView) TextView mNameTextView;
        @BindView(R.id.categoryTextView) TextView mCategoryTextView;
        @BindView(R.id.ratingTextView) TextView mRatingTextView;

        private Context context;

        public MultimediaViewHolder(View itemView){
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
        }

        public void bindMedias(Business media){
            mNameTextView.setText(media.getName());
            mCategoryTextView.setText(media.getCategories().get(0).getTitle());
            mRatingTextView.setText("Rating: " + media.getRating() + "/5");

            Picasso.get().load(media.getImageUrl()).into(mMediaImageView);
        }

    }
}
