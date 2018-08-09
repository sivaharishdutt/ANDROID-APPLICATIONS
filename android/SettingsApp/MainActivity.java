import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openSetting(View view) {
        Intent intent = new Intent(this,SettingsActivity.class);
        startActivity(intent);

    }

    public void readSetting(View view) {
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        String msetting = pref.getString("example_text","xxx");

        Toast.makeText(this,msetting,Toast.LENGTH_LONG).show();
    }
}