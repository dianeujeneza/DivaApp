package com.moringaschool.divaapp.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

//import com.moringaschool.divaapp.models.Body;
//import com.moringaschool.divaapp.models.Track;
//import com.moringaschool.divaapp.models.TrackList;
//import com.moringaschool.divaapp.models.TrackSearchResponse;

import com.moringaschool.divaapp.adapters.MultimediaListAdapter;
import com.moringaschool.divaapp.models.Business;
import com.moringaschool.divaapp.models.Category;
import com.moringaschool.divaapp.MusicArrayAdapter;
import com.moringaschool.divaapp.R;
import com.moringaschool.divaapp.network.YelpApi;
import com.moringaschool.divaapp.models.YelpBusinessSearchResponse;
import com.moringaschool.divaapp.network.YelpClient;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TracksActivity extends AppCompatActivity {

    @BindView(R.id.recyclerView) RecyclerView mRecyclerView;
    @BindView(R.id.errorTextView) TextView mErrorTextView;
    @BindView(R.id.progressBar) ProgressBar mProgressBar;
    @BindView(R.id.listView) ListView mListView;
    @BindView(R.id.tracksTextView) TextView mTracksTextView;

    public List<Business> medias;

    private MultimediaListAdapter mAdapter;
    public ArrayList<Business> mMedias = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracks);

        ButterKnife.bind(this);

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");


        YelpApi client = YelpClient.getClient();

        Call<YelpBusinessSearchResponse> call = client.getMultimedia(location,"multimedia");

        call.enqueue(new Callback<YelpBusinessSearchResponse>() {
            @Override
            public void onResponse(Call<YelpBusinessSearchResponse> call, Response<YelpBusinessSearchResponse> response) {
                hideProgressBar();
                if (response.isSuccessful()) {
                    medias = response.body().getBusinesses();
                    mAdapter = new MultimediaListAdapter(TracksActivity.this,medias);
                    mRecyclerView.setAdapter(mAdapter);
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(TracksActivity.this);
                    mRecyclerView.setLayoutManager(layoutManager);
                    mRecyclerView.setHasFixedSize(true);

                    showMedias();

                } else {
                    showUnsuccessfulMessage();
                }
            }

            @Override
            public void onFailure(Call<YelpBusinessSearchResponse> call, Throwable t) {
                hideProgressBar();
                showFailureMessage();

            }

        });

    }

    private void showFailureMessage() {
        mErrorTextView.setText("Something went wrong. Please check your Internet connection and try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    private void showUnsuccessfulMessage() {
        mErrorTextView.setText("Something went wrong. Please try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    private void showMedias() {
        mListView.setVisibility(View.VISIBLE);
        mTracksTextView.setVisibility(View.VISIBLE);
    }

    private void hideProgressBar() {
        mProgressBar.setVisibility(View.GONE);
    }

}
