package com.bbd;

/**
 * Created by bbdnet1574 on 2017/01/18.
 */
public class ChickenRun {
    private int noOfChickens;

    public ChickenRun(int noOfChickens) {
        this.noOfChickens = noOfChickens;
    }

    public int getNoOfChickens() {
        return noOfChickens;
    }

    public void setNoOfChickens(int noOfChickens) {
        this.noOfChickens = noOfChickens;
    }

    @Override
    public String toString() {
        return "ChickenRun{" +
                "noOfChickens=" + noOfChickens +
                '}';
    }
}
