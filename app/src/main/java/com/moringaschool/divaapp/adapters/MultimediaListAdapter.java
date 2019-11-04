package com.moringaschool.divaapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.divaapp.R;
import com.moringaschool.divaapp.UI.MediaDetailActivity;
import com.moringaschool.divaapp.UI.MediaDetailFragment;
import com.moringaschool.divaapp.models.Business;
import com.squareup.picasso.Picasso;

import org.parceler.Parcels;

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
        holder.bindMultimedia(mMedias.get(position));
    }

    @Override
    public int getItemCount() {
        return mMedias.size();
    }

    public class MultimediaViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        @BindView(R.id.mediaImageView) ImageView mMediaImageView;
        @BindView(R.id.mediaNameTextView) TextView mNameTextView;
        @BindView(R.id.categoryTextView) TextView mCategoryTextView;
        @BindView(R.id.ratingTextView) TextView mRatingTextView;

        private Context mContext;

        public MultimediaViewHolder(View itemView){
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
            itemView.setOnClickListener(this);
        }

        public void bindMultimedia(Business media){
            Picasso.get().load(media.getImageUrl()).into(mMediaImageView);
            mNameTextView.setText(media.getName());
            mCategoryTextView.setText(media.getCategories().get(0).getTitle());
            mRatingTextView.setText("Rating: " + media.getRating() + "/5");
        }

        @Override
        public void onClick(View view){
            int itemPosition = getLayoutPosition();
            Intent intent = new Intent(mContext, MediaDetailActivity.class);
            intent.putExtra("position", itemPosition);
            intent.putExtra("medias", Parcels.wrap(mMedias));
            mContext.startActivity(intent);
        }

    }
}
