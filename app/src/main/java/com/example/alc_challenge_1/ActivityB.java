package com.example.alc_challenge_1;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityB extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        WebView view = findViewById(R.id.about_page);

        view.loadUrl("https://andela.com/alc/");


    }
}
