package example.epic.test;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] someWords = new String[] { "DOPE", "doop", "boop"};

        ArrayAdapter <String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, someWords);
        setListAdapter(arrayAdapter);

    }
    // https://www.youtube.com/watch?v=mqpgEZ3VlhI
}
