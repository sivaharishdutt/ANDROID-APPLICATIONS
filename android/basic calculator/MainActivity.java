package com.example.cse15u004.cal;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n1,et2;
    TextView result;
    Button add,sub,mul,div;

    int x,y,r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (EditText)findViewById(R.id.n1);
        et2 = (EditText)findViewById(R.id.et2);
        add = (Button)findViewById(R.id.b1);
        sub = (Button)findViewById(R.id.b2);
        mul = (Button)findViewById(R.id.b3);
        div = (Button)findViewById(R.id.b4);
        final TextView result = (TextView)findViewById(R.id.tv);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int x = Integer.parseInt(n1.getText().toString());
                int y = Integer.parseInt(et2.getText().toString());
                int r = x+y;
                result.setText("RESULT = "+Integer.toString(r));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int x = Integer.parseInt(n1.getText().toString());
                int y = Integer.parseInt(et2.getText().toString());
                int r = x-y;
                result.setText("RESULT = "+Integer.toString(r));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int x = Integer.parseInt(n1.getText().toString());
                int y = Integer.parseInt(et2.getText().toString());
                int r = x*y;
                result.setText("RESULT = "+Integer.toString(r));

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int x = Integer.parseInt(n1.getText().toString());
                int y = Integer.parseInt(et2.getText().toString());
                int r = x/y;
                result.setText("RESULT = "+Integer.toString(r));
            }
        });

    }






}