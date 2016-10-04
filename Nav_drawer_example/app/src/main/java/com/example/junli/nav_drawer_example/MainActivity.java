package com.example.junli.nav_drawer_example;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    FragmentTransaction fragmentTransaction;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();


        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.main_container,new Home_Fragement());
        fragmentTransaction.commit();
        getSupportActionBar().setTitle("Home Fragment");

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home){
            fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.main_container, new Home_Fragement());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Home Fragment");
            item.setChecked(true);
        } else if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        } else if (id == R.id.nav_event){
            ArrayList<Event> events = new ArrayList<>();

            events.add(new Event("Apple", "001 Heaven Ave", "apple", "9-11-2016", 100));
            events.add(new Event("MicroSoft", "002 Heaven Ave", "Rice", "9-11-2016", 100));
            events.add(new Event("Google", "000 Heaven Ave", "Dessert", "9-11-2016", 100));
            events.add(new Event("Apple", "001 Heaven Ave", "apple", "9-11-2016", 100));
            events.add(new Event("MicroSoft", "002 Heaven Ave", "Rice", "9-11-2016", 100));
            events.add(new Event("Google", "000 Heaven Ave", "Dessert", "9-11-2016", 100));
            events.add(new Event("Apple", "001 Heaven Ave", "apple", "9-11-2016", 100));
            events.add(new Event("MicroSoft", "002 Heaven Ave", "Rice", "9-11-2016", 100));
            events.add(new Event("Google", "000 Heaven Ave", "Dessert", "9-11-2016", 100));
            events.add(new Event("Apple", "001 Heaven Ave", "apple", "9-11-2016", 100));
            events.add(new Event("MicroSoft", "002 Heaven Ave", "Rice", "9-11-2016", 100));
            events.add(new Event("Google", "000 Heaven Ave", "Dessert", "9-11-2016", 100));
            events.add(new Event("Apple", "001 Heaven Ave", "apple", "9-11-2016", 100));
            events.add(new Event("MicroSoft", "002 Heaven Ave", "Rice", "9-11-2016", 100));
            events.add(new Event("Google", "000 Heaven Ave", "Dessert", "9-11-2016", 100));
            events.add(new Event("Apple", "001 Heaven Ave", "apple", "9-11-2016", 100));
            events.add(new Event("MicroSoft", "002 Heaven Ave", "Rice", "9-11-2016", 100));
            events.add(new Event("Google", "000 Heaven Ave", "Dessert", "9-11-2016", 100));
            EventAdapter arrayAdapter = new EventAdapter(this, events);
            ListView listView = (ListView) findViewById(R.id.list_item);
            //listView.setAdapter(arrayAdapter);
            fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.main_container, new Event_Fragment());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Event Fragment");
            item.setChecked(true);

        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
