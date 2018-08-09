package com.example.cse15u004.musicplay;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mySong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySong =MediaPlayer.create(MainActivity.this,R.raw.choosi);
        //Create a raw folder.In the raw folder add (choosi)music mp3 file
    }
    public void playIT(View v){
        mySong.start();
    }
    protected void onPause(){
        super.onPause();
        mySong.release();
    }
}