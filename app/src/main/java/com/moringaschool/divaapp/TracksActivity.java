package com.moringaschool.divaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Body;

public class TracksActivity extends AppCompatActivity {

    @BindView(R.id.errorTextView) TextView mErrorTextView;
    @BindView(R.id.progressBar) ProgressBar mProgressBar;
    @BindView(R.id.listView) ListView mListView;

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

//        mListView = (ListView) findViewById(R.id.listView);


//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,tracks);
//        MusicArrayAdapter adapter = new MusicArrayAdapter(this, android.R.layout.simple_list_item_1, tracks, genres);
//        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String track=((TextView)view).getText().toString();
                Toast.makeText(TracksActivity.this,track,Toast.LENGTH_LONG).show();
            }
        });

        YelpApi client = YelpClient.getClient();

        Call<TrackSearchResponse> call = client.getTracks("track_name","artist_name","json","callback","api");

        call.enqueue(new Callback<TrackSearchResponse>() {
            @Override
            public void onResponse(Call<TrackSearchResponse> call, Response<TrackSearchResponse> response) {
                if (response.isSuccessful()) {
                    List<Track> trackList = (List<Track>) response.body().getMessage();
//                    List<TrackList> trackList= response.body().getMessage();
//                    List<TrackList> trackList=response.body().getMessage();

                    String[] tracks =new String [trackList.size()];
                    String[] artists = new String[trackList.size()];

                    for (int i = 0; i< tracks.length; i++){
                        tracks[i]=trackList.get(i).getTrackName();
//                        tracks[i]=trackList.get(i).getTrack();
                    }

                    for (int i =0; i<artists.length; i++){
//                        MusicGenre musicGenre = trackList.get(i).getArtistName().get(0);
//                        artists[i]=musicGenre.getMusicGenreName();
                        artists[i] = trackList.get(i).getArtistName();
                    }

                    ArrayAdapter adapter = new MusicArrayAdapter(TracksActivity.this, android.R.layout.simple_list_item_1, artists,tracks);
                    mListView.setAdapter(adapter);

                    showTracks();
                }else{
                    showUnsuccessfulMessage();
                }
            }

            @Override
            public void onFailure(Call<TrackSearchResponse> call, Throwable t) {
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

    private void showTracks() {
        mListView.setVisibility(View.VISIBLE);
//        mtrackTextView.setVisibility(View.VISIBLE);
    }

    private void hideProgressBar() {
        mProgressBar.setVisibility(View.GONE);
    }

}
