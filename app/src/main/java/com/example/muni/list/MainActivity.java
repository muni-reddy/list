package com.example.muni.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<name> names = new ArrayList<name>();
        names.add(new name("Muni","9491359630"));
        names.add(new name("Muni","9491359630"));
        names.add(new name("Muni","9491359630"));
        names.add(new name("Muni","9491359630"));
        names.add(new name("Muni","9491359630"));
        names.add(new name("Muni","9491359630"));
        names.add(new name("Muni","9491359630"));

        nameadapter nameadap= new nameadapter(this,names);
        ListView list = (ListView) findViewById(R.id.listview_flavor);
        list.setAdapter(nameadap);
    }
}
