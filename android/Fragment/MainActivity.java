

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.app.Activity;
import android.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

    private Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new FirstFragment());
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment2(new SecondFragment());
            }
        });
    }

    public void loadFragment(Fragment fragment1){

        FragmentManager manager= getFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.add(R.id.frame1,fragment1);
        transaction.commit();
    }
    public void loadFragment2(Fragment fragment){

        FragmentManager manager= getFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.add(R.id.frame1,fragment);
        transaction.commit();
    }

}