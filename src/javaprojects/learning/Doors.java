package javaprojects.learning;

public class Doors {
    private int numberOfDoors;
    private String typeOfDoor;
    private String LockType;

    public Doors(int numberOfDoors, String typeOfDoor, String lockType) {
        this.numberOfDoors = numberOfDoors;
        this.typeOfDoor = typeOfDoor;
        LockType = lockType;
    }

    public void printNumberOfDoors(){
        System.out.println("There are " + getNumberOfDoors() + " doors in the room.");
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public String getTypeOfDoor() {
        return typeOfDoor;
    }

    public String getLockType() {
        return LockType;
    }
}
