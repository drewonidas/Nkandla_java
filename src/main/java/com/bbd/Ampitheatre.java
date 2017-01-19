package com.bbd;

/**
 * Created by bbdnet1574 on 2017/01/18.
 */
public class Ampitheatre {
    private int noOfSeats;

    public Ampitheatre(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    @Override
    public String toString() {
        return "Ampitheatre{" +
                "noOfSeats=" + noOfSeats +
                '}';
    }
}
