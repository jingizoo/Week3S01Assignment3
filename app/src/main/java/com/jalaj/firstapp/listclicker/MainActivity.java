package com.jalaj.firstapp.listclicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.internal.widget.AdapterViewCompat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.jalaj.firstapp.listclicker.adapter.NameViewAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
ArrayList <String> nameList;
    ListView lvName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvName = (ListView) findViewById(R.id.lvName);
        nameList = new ArrayList<>();
        nameList.add("Android");
        nameList.add("Scala");
        nameList.add("Data Science");

        lvName.setAdapter(new NameViewAdapter(nameList,this));
        lvName.setOnItemClickListener(this);


    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent i1 = new Intent(MainActivity.this,Main2Activity.class);
        i1.putExtra("Name",nameList.get(position));
        startActivity(i1);
    }
}
