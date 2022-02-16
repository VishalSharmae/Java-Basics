package javaprojects.learning;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
     public void powerUp(){
        theCase.pressPowerButton();
        printLogo();
     }

     private void printLogo(){
        monitor.drawPixelAt(1200,1800,"yellow");
     }
}
