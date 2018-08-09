package com.example.cse15u004.vedio;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    Button clk;
    VideoView videov;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clk =(Button) findViewById(R.id.btn);
        videov =(VideoView) findViewById(R.id.videoView);
    }
    public void videoplay(View v)
    {
        String videopath = "android.resource://com.example.cse15u004.vedio/"+R.raw.despa;

    //Create a raw folder and add vedio (despa) file
        Uri uri = Uri.parse(videopath);
        videov.setVideoURI(uri);
        videov.start();
    }





}