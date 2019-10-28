package com.moringaschool.divaapp.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.moringaschool.divaapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.findTracksBtn) Button mFindTracksButton;
//    @BindView(R.id.trackEditText) EditText mTrack_name;
    @BindView(R.id.logoutButton) Button mLogoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mFindTracksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String location = mTrack_name.getText().toString();
                Intent intent = new Intent(MainActivity.this, TracksActivity.class);
//                intent.putExtra("location", location);
                startActivity(intent);
            }
        });

        mLogoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
