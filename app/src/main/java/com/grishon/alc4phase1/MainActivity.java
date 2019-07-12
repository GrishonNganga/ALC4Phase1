package com.grishon.alc4phase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button aboutBtn, profileBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aboutBtn = findViewById(R.id.about_btn);
        profileBtn = findViewById(R.id.profile_btn);

        aboutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aboutLaunch();
            }
        });

        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profileLaunch();
            }
        });
    }

    private  void profileLaunch() {
        startActivity(new Intent(MainActivity.this, ProfileActivity.class));
    }

    private void aboutLaunch() {
        startActivity(new Intent(MainActivity.this, AboutActivity.class));
    }
}
