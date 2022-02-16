package javaprojects.learning;

public class Room {
    private Doors doors;
    private AirConditioning airConditioning;
    private Bed bed;

    public Room(Doors doors, AirConditioning airConditioning, Bed bed) {
        this.doors = doors;
        this.airConditioning = airConditioning;
        this.bed = bed;
    }

    public void output(){
        doors.printNumberOfDoors();
        airConditioning.printAirConditioning();
        bed.printSizeOfBed();
    }
    public Doors getDoors() {
        return doors;
    }

    public AirConditioning getAirConditioning() {
        return airConditioning;
    }

    public Bed getBed() {
        return bed;
    }
}
