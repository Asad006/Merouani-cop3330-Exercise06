package org.example;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static Scanner scanner= new Scanner(System.in);
    public static void main( String[] args )
    {
        App app = new App();
        int age;
        int retirementAge;

        age = app.getUserAge(scanner);

        retirementAge = getUserRetirement(scanner);

        outputDisplay(age,retirementAge);

    }

    private static void outputDisplay(int age, int retirementAge) {
        System.out.printf("You have %d years left until you can retire.\n", retirementAge-age);
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.printf("It's %d, so you can retire in %d\n",year,year+(retirementAge-age));
    }

    private static int getUserRetirement(Scanner scanner) {
        int retirementAge;

        System.out.println("What is your current age?");
        retirementAge = Integer.parseInt(scanner.nextLine());
        return retirementAge;
    }

    private int getUserAge(Scanner scanner) {
        int age;

        System.out.println("What is your current age?");
        age = Integer.parseInt(scanner.nextLine());
        return age;
    }
}
