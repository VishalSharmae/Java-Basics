package javaprojects.learning;

public class AirConditioning {
    private boolean isAirConditioning;
    private String typeOfAirConditioning;

    public AirConditioning(boolean isAirConditioning, String typeOfAirConditioning) {
        this.isAirConditioning = isAirConditioning;
        this.typeOfAirConditioning = typeOfAirConditioning;
    }

    public void printAirConditioning(){
        if (isAirConditioning){
            System.out.println("Room has Air Conditioning of " + typeOfAirConditioning + " type.");
        }else{
            System.out.println("Room has no Air Conditioning");
        }
    }

    public boolean isAirConditioning() {
        return isAirConditioning;
    }

    public String getTypeOfAirConditioning() {
        return typeOfAirConditioning;
    }
}
