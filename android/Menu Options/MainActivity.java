
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.app.Activity;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static android.content.ClipDescription.MIMETYPE_TEXT_PLAIN;

public class MainActivity extends AppCompatActivity {

    EditText inputText;
    TextView outputText;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText=findViewById(R.id.editText);
        outputText=findViewById(R.id.textView4);
    }

    // Initiating Menu XML file (menu.xml)
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate your main_menu into the menu
        getMenuInflater().inflate(R.layout.menu, menu);

        // Find the menuItem to add your SubMenu
        MenuItem myMenuItem = menu.findItem(R.id.my_menu_item);

        // Inflating the sub_menu menu this way, will add its menu items
        // to the empty SubMenu you created in the xml
        getMenuInflater().inflate(R.layout.sub_menu, myMenuItem.getSubMenu());

        //MenuInflater menuInflater = getMenuInflater();
        //menuInflater.inflate(R.layout.menu, menu);
        return true;
    }

    /**
     * Event Handling for Individual menu item selected
     * Identify single menu item by it's id
     * */
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {

        switch (item.getItemId())
        {
            case R.id.clear:
                inputText.setText("");
                outputText.setText("");
                return true;

            case R.id.my_menu_item:
                Toast.makeText(this, "Save is Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.exit:

                System.exit(0);
                return true;

            case R.id.cut:
                ClipboardManager clipboard = (ClipboardManager)
                        getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("",inputText.getText().toString());
                clipboard.setPrimaryClip(clip);
                inputText.setText("");
                return true;

            case R.id.copy:
                ClipboardManager mclipboard = (ClipboardManager)
                        getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData mclip = ClipData.newPlainText("",inputText.getText().toString());
                mclipboard.setPrimaryClip(mclip);
                return true;
            case R.id.paste:
                ClipboardManager vclipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);

                String pasteData = "";

// If it does contain data, decide if you can handle the data.
                if (!(vclipboard.hasPrimaryClip())) {

                    Toast.makeText(this,"Empty",Toast.LENGTH_LONG).show();

                } else if (!(vclipboard.getPrimaryClipDescription().hasMimeType(MIMETYPE_TEXT_PLAIN))) {

                    // since the clipboard has data but it is not plain text
                    Toast.makeText(this,"Not a string",Toast.LENGTH_LONG).show();

                } else {

                    //since the clipboard contains plain text.
                    ClipData.Item mitem = vclipboard.getPrimaryClip().getItemAt(0);

                    // Gets the clipboard as text.
                    pasteData = mitem.getText().toString();
                    outputText.setText(pasteData);
                }

                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
