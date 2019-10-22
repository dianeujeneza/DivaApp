package com.moringaschool.divaapp.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.moringaschool.divaapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.findTracksBtn) Button mFindTracksButton;
    @BindView(R.id.trackEditText)
    EditText mTrack_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mFindTracksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String track_name = mTrack_name.getText().toString();
                Intent intent = new Intent(MainActivity.this, TracksActivity.class);
                intent.putExtra("track_name", track_name);
                startActivity(intent);
            }
        });
    }
}
