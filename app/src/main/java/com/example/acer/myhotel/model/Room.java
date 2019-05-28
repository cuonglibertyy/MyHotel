package com.example.acer.myhotel.model;

import java.io.Serializable;

public class Room implements Serializable {
    public int Floor;
    public String Single_room;
    public int Price;
    public int Status;
    public String Image;
    public String Detail;
    public String ID;
    public String Room_Number;
    public String Hoteilid;

    public Room(int floor, String single_room, int price, int status, String image, String detail, String ID, String room_Number, String hoteilid) {
        Floor = floor;
        Single_room = single_room;
        Price = price;
        Status = status;
        Image = image;
        Detail = detail;
        this.ID = ID;
        Room_Number = room_Number;
        Hoteilid = hoteilid;
    }

    public int getFloor() {
        return Floor;
    }

    public void setFloor(int floor) {
        Floor = floor;
    }

    public String getSingle_room() {
        return Single_room;
    }

    public void setSingle_room(String single_room) {
        Single_room = single_room;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getDetail() {
        return Detail;
    }

    public void setDetail(String detail) {
        Detail = detail;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getRoom_Number() {
        return Room_Number;
    }

    public void setRoom_Number(String room_Number) {
        Room_Number = room_Number;
    }

    public String getHoteilid() {
        return Hoteilid;
    }

    public void setHoteilid(String hoteilid) {
        Hoteilid = hoteilid;
    }
}
