package com.jalaj.firstapp.listclicker.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.jalaj.firstapp.listclicker.R;

import java.util.ArrayList;

/**
 * Created by jalajmehta on 7/9/16.
 */

public class NameViewAdapter extends BaseAdapter {
    LayoutInflater layoutInflater;
    ArrayList<String> nameList;
    @Override
    public int getCount() {
        return nameList.size();
    }

    @Override
    public Object getItem(int position) {
        return nameList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.layout_linear,parent,false);
        TextView tv1 = (TextView)convertView.findViewById(R.id.textView);
        tv1.setText(nameList.get(position));
        return convertView;
    }

    public NameViewAdapter(ArrayList nameList, Context ctx){
        this.nameList = nameList;
        layoutInflater = LayoutInflater.from(ctx);

    }
}
