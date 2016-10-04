package com.example.junli.nav_drawer_example;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Event_Fragment extends Fragment {


    public Event_Fragment() {
        // Required empty public constructor

    }

//    ArrayList<Event> events = new ArrayList<>();
//
//    events.add(new Event("Apple", "001 Heaven Ave", "apple", "9-11-2016", 100));
//    events.add(new Event("MicroSoft", "002 Heaven Ave", "Rice", "9-11-2016", 100));
//    events.add(new Event("Google", "000 Heaven Ave", "Dessert", "9-11-2016", 100));
//    events.add(new Event("Apple", "001 Heaven Ave", "apple", "9-11-2016", 100));
//    events.add(new Event("MicroSoft", "002 Heaven Ave", "Rice", "9-11-2016", 100));
//    events.add(new Event("Google", "000 Heaven Ave", "Dessert", "9-11-2016", 100));
//    events.add(new Event("Apple", "001 Heaven Ave", "apple", "9-11-2016", 100));
//    events.add(new Event("MicroSoft", "002 Heaven Ave", "Rice", "9-11-2016", 100));
//    events.add(new Event("Google", "000 Heaven Ave", "Dessert", "9-11-2016", 100));
//    events.add(new Event("Apple", "001 Heaven Ave", "apple", "9-11-2016", 100));
//    events.add(new Event("MicroSoft", "002 Heaven Ave", "Rice", "9-11-2016", 100));
//    events.add(new Event("Google", "000 Heaven Ave", "Dessert", "9-11-2016", 100));
//    events.add(new Event("Apple", "001 Heaven Ave", "apple", "9-11-2016", 100));
//    events.add(new Event("MicroSoft", "002 Heaven Ave", "Rice", "9-11-2016", 100));
//    events.add(new Event("Google", "000 Heaven Ave", "Dessert", "9-11-2016", 100));
//    events.add(new Event("Apple", "001 Heaven Ave", "apple", "9-11-2016", 100));
//    events.add(new Event("MicroSoft", "002 Heaven Ave", "Rice", "9-11-2016", 100));
//    events.add(new Event("Google", "000 Heaven Ave", "Dessert", "9-11-2016", 100));
//
//
//    EventAdapter arrayAdapter = new EventAdapter(this, events);
//
//    ListView listView = (ListView) findViewById(R.id.list_item);
//    listView.setAdapter(arrayAdapter);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_event_, container, false);
    }

}
