package com.example.junli.nav_drawer_example;

/**
 * Created by Jun Li on 10/04/16.
 */

public class Event {
    private String date;
    private String name;
    private int capacity;
    private String location;
    private String food;

    public Event(String name, String location, String food, String date, int capacity) {
        this.name = name;
        this.location = location;
        this.food = food;
        this.date = date;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getDate() {
        return date;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }
}
