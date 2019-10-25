package com.moringaschool.divaapp.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.moringaschool.divaapp.R;

public class ArtistActivity extends AppCompatActivity {
    private ListView mListView;
//    @BindView(R.id.ListView) TextView ListView mListView;
    private String[] artists = new String[] {"Dadju","Chris Brown","Justin Bieber","Ed Sheeran",
    "Beyonce","Taylor Swift"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        mListView = (ListView) findViewById(R.id.listView);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, artists);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent =  new Intent(ArtistActivity.this, TracksActivity.class);
                startActivity(intent);
            }
        });

    }
}
