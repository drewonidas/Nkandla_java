package com.bbd;

/**
 * Created by bbdnet1574 on 2017/01/18.
 */
public class SwimmingPool {
    private int length;
    private int width;

    public SwimmingPool(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "SwimmingPool{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
