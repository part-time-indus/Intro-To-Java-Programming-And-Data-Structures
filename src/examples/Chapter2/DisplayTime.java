package examples.Chapter2;
import java.util.Scanner;

public class DisplayTime {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer for seconds: ");
        int seconds = input.nextInt();

        int hours = seconds / 3600;
        int remaining_minutes = seconds % 3600;
        int minutes = remaining_minutes / 60;
        int remaining_seconds = remaining_minutes % 60;
        System.out.println(seconds + " seconds is " + hours + " hours and " + minutes + " minutes and  " + remaining_seconds + " seconds");
    }
    
}
