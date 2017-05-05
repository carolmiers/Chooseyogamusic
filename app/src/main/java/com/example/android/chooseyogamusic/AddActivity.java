package com.example.android.chooseyogamusic;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
// Go to a website to buy some more yoga music
        String url = "http://www.spiritvoyage.com";
        Intent intentweb = new Intent(Intent.ACTION_VIEW);
        intentweb.setData(Uri.parse(url));
        startActivity(intentweb);
        if (intentweb.resolveActivity(getPackageManager()) != null);{
            startActivity(intentweb);
        }
    }





    }

