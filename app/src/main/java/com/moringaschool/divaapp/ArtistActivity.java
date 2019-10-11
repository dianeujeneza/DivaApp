package com.moringaschool.divaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ArtistActivity extends AppCompatActivity {
    private ListView mListView;
    private String[] artists = new String[] {"Dadju","Chris Brown","Justin Bieber","Ed Sheeran",
    "Beyonce","Taylor Swift"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        mListView = (ListView) findViewById(R.id.listView);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, artists);
        mListView.setAdapter(adapter);
    }
}
