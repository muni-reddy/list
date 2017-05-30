package com.example.muni.list;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by muni on 29/05/17.
 */

public class nameadapter extends ArrayAdapter<name>{
    private static final String LOG_TAG = nameadapter.class.getSimpleName();

    public nameadapter(Activity context , ArrayList<name> names){
        super(context, 0, names);

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        name currentname = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        nameTextView.setText(currentname.getName());
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.phone);
        numberTextView.setText(currentname.getPhone());
        return listItemView;

    }
    }
