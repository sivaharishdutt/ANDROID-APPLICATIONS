

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class FirstFragment extends Fragment {
    View view;
    Button b1;
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
      view =inflater.inflate(R.layout.fragment_first,container,false);
      b1=(Button)view.findViewById(R.id.button3);
      b1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Toast.makeText(getActivity(), "THIS IS FRAGMENT ONE", Toast.LENGTH_LONG).show();
              Intent i = new Intent(getActivity(),Main2Activity.class);
              startActivity(i);

          }
      });
      return view;
  }
}