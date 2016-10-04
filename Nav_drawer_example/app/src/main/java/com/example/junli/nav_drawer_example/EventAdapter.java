package com.example.junli.nav_drawer_example;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Jun Li on 10/04/16.
 */

public class EventAdapter extends ArrayAdapter<Event> {

    public EventAdapter(Context context, List<Event> data) {
        super(context, 0, data);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Event event=getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.array_event_item, parent, false);
        }
        TextView name = (TextView) convertView.findViewById(R.id.name_event);
        TextView location = (TextView) convertView.findViewById(R.id.location_event);
        TextView date = (TextView) convertView.findViewById(R.id.date_event);
        name.setText(event.getName());
        location.setText(event.getLocation());
        date.setText(event.getDate());
        return convertView;
        //return super.getView(position, convertView, parent);
    }
}
