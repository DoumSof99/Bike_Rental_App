package com.example.bikerentalapp;

import java.util.ArrayList;

public class DataBikes {

    public  ArrayList<RentBikes> bikes=new ArrayList<>();

    public DataBikes(){
        data();
    }

    public void data(){

        bikes.add(new RentBikes("Beach Bike", "https://en.wikipedia.org/wiki/Bicycle", R.drawable.bike1));
        bikes.add(new RentBikes("Mountain Bike", "https://en.wikipedia.org/wiki/Bicycle", R.drawable.bike2));
        bikes.add(new RentBikes("Street Bike", "https://en.wikipedia.org/wiki/Bicycle", R.drawable.bike3));
        bikes.add(new RentBikes("Town Bike", "https://en.wikipedia.org/wiki/Bicycle", R.drawable.bike4));

    }

}
