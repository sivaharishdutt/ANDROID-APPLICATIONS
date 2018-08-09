package com.example.cse15u004.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    Button button;

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LIFECYCLE","ACTIVITY1 IS RESUMED");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LIFECYCLE","ACTIVITY1 IS RESTARTED");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LIFECYCLE","ACTIVITY1 IS STARTED");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LIFECYCLE","ACTIVITY1 IS STOPPED");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LIFECYCLE","ACTIVITY1 IS DESTROYED");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button=(Button)findViewById(R.id.b1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                startActivity(intent);
            }


            });
    }
}