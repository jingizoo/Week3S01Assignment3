package com.jalaj.firstapp.listclicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Set;

public class Main2Activity extends AppCompatActivity {
HashMap cfm = new HashMap();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        fillMap();
        Intent i1 = getIntent();
        String name = i1.getExtras().getString("Name");
        TextView txtVw = (TextView)findViewById(R.id.textView3);

        txtVw.setText((String)cfm.get(name));


    }

    private void fillMap()
    {
        cfm.put("Android","Mr. Anurag Sharma");
        cfm.put("Scala","Mr. Goodlad");
        cfm.put("Nasty Course","Mr. Devil");
    }
}
