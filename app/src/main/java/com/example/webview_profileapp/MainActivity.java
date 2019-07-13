package com.example.webview_profileapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void aboutAlcBtn(View view) {
        startActivity( new Intent(this, AboutALC.class));


    }

    public void myProfile(View view) {

        startActivity( new Intent(this, MyProfile.class));
    }
}
