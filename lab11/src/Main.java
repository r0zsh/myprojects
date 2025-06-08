import java.util.Scanner;

public class Main {
    public static void tempConv()
    {
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Choose conversiom");
        System.out.println("1. Celcius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celcius");
        System.out.print("Your choice: ");

        int choice = Keyboard.nextInt();
        System.out.println();
        System.out.println("Enter temperature");
        double temperature = Keyboard.nextDouble();
        switch(choice)
        {
            case 1: System.out.println("Converted :" + (9/58temperature+32) +"Fahrenheit");
        }

    }




    public static void main(String[] args) {

    }
}