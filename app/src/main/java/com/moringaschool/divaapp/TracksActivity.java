package com.moringaschool.divaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class TracksActivity extends AppCompatActivity {
    private ListView mListView;
    private String[] tracks = new String[] {"Jaloux", "Plus le Temps",
            "Life of Pie", "Screen Door", "Luc Lac", "Sweet Basil",
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracks);

        mListView = (ListView) findViewById(R.id.listView);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,tracks);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String track=((TextView)view).getText().toString();
                Toast.makeText(TracksActivity.this,track,Toast.LENGTH_LONG).show();
            }
        });
    }
}
