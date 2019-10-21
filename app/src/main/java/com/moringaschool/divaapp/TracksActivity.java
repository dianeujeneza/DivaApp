package com.moringaschool.divaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TracksActivity extends AppCompatActivity {

    private ListView mListView;
    private String[] tracks = new String[] {"Jaloux", "Plus le Temps",
            "Life of Pie", "Screen Door", "Sorry" +
            "Blanc Space", "Sweet Basil",
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracks);

        mListView = (ListView) findViewById(R.id.listView);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,tracks);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String track=((TextView)view).getText().toString();
                Toast.makeText(TracksActivity.this,track,Toast.LENGTH_LONG).show();
            }
        });

        YelpApi client = YelpClient.getClient();

        Call<TrackSearchResponse> call = client.getTrackName("track_name", "artist_name");

        call.enqueue(new Callback<TrackSearchResponse>() {
            @Override
            public void onResponse(Call<TrackSearchResponse> call, Response<TrackSearchResponse> response) {
                if (response.isSuccessful()) {
                    List<Track> trackList = (List<Track>) response.body().getMessage();
//                    List<Track> trackList= response.body().getMessage();

                    String[] tracks =new String [trackList.size()];
                    String[] artists = new String[trackList.size()];

                    for (int i = 0; i< tracks.length; i++){
                        tracks[i]=trackList.get(i).getTrackName();
                    }

                    for (int i =0; i<artists.length; i++){
                        MusicGenre musicGenre = trackList.get(i).getArtistName().get(0);
                        artists[i]=musicGenre.getMusicGenreName();
                    }

                    ArrayAdapter adapter=new ArrayAdapter(TracksActivity.this, android.R.layout.simple_list_item_1,tracks,artists);
                    mListView.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<TrackSearchResponse> call, Throwable t) {

            }
        });

    }
}
