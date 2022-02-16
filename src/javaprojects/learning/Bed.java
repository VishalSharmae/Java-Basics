package javaprojects.learning;

import java.awt.*;

public class Bed {
    private String sizeOfBed;
    private Dimensions dimensions;

    public Bed(String sizeOfBed, Dimensions dimensions) {
        this.sizeOfBed = sizeOfBed;
        this.dimensions = dimensions;
    }

    public void printSizeOfBed(){
        System.out.println("Room is having a " + getSizeOfBed() + " bed of dimensions " + getDimensions());
    }

    public String getSizeOfBed() {
        return sizeOfBed;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
