package com.example.alc_challenge_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View aboutButton = findViewById(R.id.about);

        View profileButton = findViewById(R.id.profile);

        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showALCWebPage();

            }
        });

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showProfile();
            }
        });


    }

    private void showProfile() {
        Intent profileIntent = new Intent(this, ActivityC.class);
        startActivity(profileIntent);
    }

    private void showALCWebPage() {
        Intent aboutIntent = new Intent(this, ActivityB.class);
        startActivity(aboutIntent);
    }

}
