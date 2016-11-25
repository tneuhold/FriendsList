package com.example.neuho.friendslist.model;

import java.io.Serializable;

/**
 * Created by neuho on 25.11.2016.
 */

public class Friends implements Serializable {

    private String writer;
    private String address;
    private String phoneNumber;
    private String favouriteActor;

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFavouriteActor() {
        return favouriteActor;
    }

    public void setFavouriteActor(String favouriteActor) {
        this.favouriteActor = favouriteActor;
    }

    public Friends() {
    }

    public Friends(String writer, String address, String phoneNumber, String favouriteActor) {
        this.writer = writer;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.favouriteActor = favouriteActor;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Friends{");
        sb.append("writer='").append(writer).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", phoneNumber='").append(phoneNumber).append('\'');
        sb.append(", favouriteActor='").append(favouriteActor).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

