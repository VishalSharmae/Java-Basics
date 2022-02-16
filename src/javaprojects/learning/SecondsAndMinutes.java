package javaprojects.learning;

public class Main {

    public static void main(String[] args) {
	String newname = getDurationString(3905);
        System.out.println(newname);
    }
    public static String getDurationString( int minutes, int seconds){
        if ((minutes < 0) || (seconds <0 || seconds > 59)){
            return "Invalid Number";
        }
        int hours= minutes/60;
        minutes = minutes%60;

        String hoursString = hours + "h";
        if (hours < 10){
            hoursString= "0" + hoursString;
        }
        String minuteString = minutes + "m";
        if ( minutes <10){
            minuteString = "0" + minuteString;
        }
        String secondsString = seconds + "s";
        if (seconds < 10){
            secondsString = "0" + secondsString;
        }

        return hoursString +" " + minuteString + " " + secondsString;
    }
    public static String getDurationString( int seconds){
        if (seconds <0){
            return "Invalid Value";
        }
        int minutes = seconds/60;
        seconds= seconds%60;
        return getDurationString(minutes, seconds);
    }
}
