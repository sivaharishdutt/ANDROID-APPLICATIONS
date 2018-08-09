package com.example.cse15u004.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
    Button button;


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LIFECYCLE","ACTIVITY IS STARTED");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LIFECYCLE","ACTIVITY IS STOPPED");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LIFECYCLE","ACTIVITY IS DESTROYED");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LIFECYCLE","ACTIVITY IS PAUSED");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LIFECYCLE","ACTIVITY IS RESUMED");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LIFECYCLE","ACTIVITY IS RESTARTED");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        button = (Button) findViewById(R.id.bt2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}