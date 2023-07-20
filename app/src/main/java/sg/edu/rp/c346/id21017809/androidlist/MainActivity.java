package sg.edu.rp.c346.id21017809.androidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<AndroidVersion> items = new ArrayList<AndroidVersion>();
    ArrayAdapter<AndroidVersion> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);
        AndroidVersion item1 = new AndroidVersion("Pie", "9.0");
        AndroidVersion item2 = new AndroidVersion("Oreo", "8.0 - 8.1");
        AndroidVersion item3 = new AndroidVersion("Nougat", "7.0 - 7.1.2");

        items.add(item1);
        items.add(item2);
        items.add(item3);


        adapter =  new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, items);

        lv.setAdapter(adapter);
    }
}