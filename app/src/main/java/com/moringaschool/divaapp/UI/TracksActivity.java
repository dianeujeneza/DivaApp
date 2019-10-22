package com.moringaschool.divaapp.UI;

import androidx.appcompat.app.AppCompatActivity;

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

import com.moringaschool.divaapp.models.Business;
import com.moringaschool.divaapp.models.Category;
import com.moringaschool.divaapp.MusicArrayAdapter;
import com.moringaschool.divaapp.R;
import com.moringaschool.divaapp.network.YelpApi;
import com.moringaschool.divaapp.models.YelpBusinessSearchResponse;
import com.moringaschool.divaapp.network.YelpClient;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TracksActivity extends AppCompatActivity {

    @BindView(R.id.errorTextView) TextView mErrorTextView;
    @BindView(R.id.progressBar) ProgressBar mProgressBar;
    @BindView(R.id.listView) ListView mListView;
    @BindView(R.id.tracksTextView) TextView mTracksTextView;

//    private ListView mListView;

//    private String[] tracks = new String[] {"Jaloux", "Plus le Temps",
//            "Life of Pie", "Screen Door", "Sorry" ,
//            "Blanc Space", "Sweet Basil",
//    };
//
//    private String[] genres = new String[] {"rock", "slow",
//            "salsa", "pop", "hiphop" ,"pop", "hiphop",
//    };
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
                    List<Business> mediaList = response.body().getBusinesses();
                    String[] medias = new String[mediaList.size()];
                    String[] categories = new String[mediaList.size()];

                    for (int i = 0; i < medias.length; i++){
                        medias[i] = mediaList.get(i).getName();
                    }

                    for (int i = 0; i < categories.length; i++) {
                        Category category = mediaList.get(i).getCategories().get(0);
                        categories[i] = category.getTitle();
                    }

                    ArrayAdapter adapter
                            = new MusicArrayAdapter(TracksActivity.this, android.R.layout.simple_list_item_1, medias, categories);
                    mListView.setAdapter(adapter);
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

//        mListView = (ListView) findViewById(R.id.listView);


//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,tracks);
//        MusicArrayAdapter adapter = new MusicArrayAdapter(this, android.R.layout.simple_list_item_1, tracks, genres);
//        mListView.setAdapter(adapter);

//        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String track=((TextView)view).getText().toString();
//                Toast.makeText(TracksActivity.this,track,Toast.LENGTH_LONG).show();
//            }
//        });

//        Intent intent = getIntent();
//        String q_track = intent.getStringExtra("q_track");
//        YelpApi client = YelpClient.getClient();
//
//        Call<TrackList> call = client.getTracks(q_track);

//        call.enqueue(new Callback<TrackList>() {
//            @Override
//            public void onResponse(Call<TrackList> call, Response<TrackList> response) {
//                if (response.isSuccessful()) {
//                    List<Track> trackList = (List<Track>) response.body().getMessage();
//                    List<TrackList> trackList= response.body().getTrackList();
//                    List<TrackList> trackList=response.body().getMessage();
//                    Track trackList = response.body().getTrack();
//                    List<TrackList> trackList= response.body().getTrack();
//
//                    String[] tracks =new String [trackList.size()];
//                    String[] artists = new String[trackList.size()];

//                    for (int i = 0; i< tracks.length; i++){
//                        tracks[i]= (trackList.get(i).getTrack());
////                        tracks[i]=trackList.get(i).getTrack();
//                    }

//                    for (int i =0; i<artists.length; i++){
////                        MusicGenre musicGenre = trackList.get(i).getArtistName().get(0);
////                        artists[i]=musicGenre.getMusicGenreName();
//                        artists[i] = trackList.get(i).getArtistName();
//                    }

//                    ArrayAdapter adapter = new MusicArrayAdapter(TracksActivity.this, android.R.layout.simple_list_item_1, artists,tracks);
//                    mListView.setAdapter(adapter);
//
//                    showTracks();
//                }else{
//                    showUnsuccessfulMessage();
//                }
//            }

//            @Override
//            public void onFailure(Call<TrackList> call, Throwable t) {
//                hideProgressBar();
//                showFailureMessage();
//
//            }
//        });

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
