package javaprojects.learning;

public class Main {

    public static void main(String[] args) {

        Doors doors = new Doors(2,"Wooden", "Manual");
        AirConditioning airConditioning = new AirConditioning(true, "Ducted");
        Bed bed = new Bed("King Size", new Dimensions(25,30,5));
        Room room = new Room(doors, airConditioning, bed);
        room.getAirConditioning().printAirConditioning();
        room.getBed().printSizeOfBed();
        room.getDoors().printNumberOfDoors();

        // Not using a getter
        System.out.println("*******************************************************");
        room.output();

    }
}
