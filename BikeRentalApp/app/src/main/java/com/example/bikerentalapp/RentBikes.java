package com.example.bikerentalapp;

class RentBikes {

    String name;
    String info;
    int image;

    public RentBikes(String name, String info, int image){
        this.name=name;
        this.info=info;
        this.image=image;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public int getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return  name;
    }
}
