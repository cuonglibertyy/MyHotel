package com.example.acer.myhotel.model;

import java.io.Serializable;

public class Hotel implements Serializable {
    public int Total_floor;
    public int License_number;
    public String Address;
    public String Owner;
    public String City;
    public String Image;
    public String ID;
    public String Name;

    public Hotel(int total_floor, int license_number, String address, String owner, String city, String image, String ID, String name) {
        Total_floor = total_floor;
        License_number = license_number;
        Address = address;
        Owner = owner;
        City = city;
        Image = image;
        this.ID = ID;
        Name = name;
    }

    public int getTotal_floor() {
        return Total_floor;
    }

    public void setTotal_floor(int total_floor) {
        Total_floor = total_floor;
    }

    public int getLicense_number() {
        return License_number;
    }

    public void setLicense_number(int license_number) {
        License_number = license_number;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
