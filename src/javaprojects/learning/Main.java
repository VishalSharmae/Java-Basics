package javaprojects.learning;

public class Main {

   public static void main(String[] args) {
    Case theCase = new Case("220B", "Dell", "240", new Dimensions(20,20,5));
    Monitor theMonitor = new Monitor("BX200", "HCL", 27, new Resolution(2100, 1800));
    Motherboard theMotherboard = new Motherboard("MB566X", "Gigabyte", 4, 6, "v2.4.4");
    PC thePC = new PC(theCase,theMonitor, theMotherboard);
    thePC.powerUp();
    thePC.
    }
}
