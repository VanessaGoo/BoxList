package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<ColourDisplay> boxList;
    CustomAdapter caBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.listView);

        boxList = new ArrayList<>();

        ColourDisplay box1 = new ColourDisplay("blue");
        ColourDisplay box2 = new ColourDisplay("orange");
        ColourDisplay box3 = new ColourDisplay("brown");

        boxList.add(box1);
        boxList.add(box2);
        boxList.add(box3);

        caBox = new CustomAdapter(this, R.layout.boxlist,boxList);

        lv.setAdapter(caBox);
    }
}