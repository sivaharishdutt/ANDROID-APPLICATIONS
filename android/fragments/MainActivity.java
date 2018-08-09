package com.example.cse15u004.frag1;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void selectFrag(View view) {
        Fragment frg;
        if(view == findViewById(R.id.fg1))
        {
         frg = new fraggone();
        }
        else {
            frg = new fraggtwo();
        }
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        final FragmentTransaction replace = transaction.replace(R.id.basfrag,frg);
        transaction.commit();
    }
}






