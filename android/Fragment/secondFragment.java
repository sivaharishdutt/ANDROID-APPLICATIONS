import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;



public class SecondFragment extends Fragment {
    View view;
    Button b2;
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        view = inflater.inflate(R.layout.fragment_second,container,false);
        b2=(Button)view.findViewById(R.id.button4);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "THIS IS SECOND FRAGMENT", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(),Main3Activity.class);
                startActivity(i);

            }
        });
        return view;
    }
}
