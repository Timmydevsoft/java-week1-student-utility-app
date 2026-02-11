package org.timmy;

import java.util.Scanner;

public class StudentUtilityApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int option;

        do{
            showMenu();
            option = scanner.nextInt();
            switch (option){
                case 1:
                    addTwoNumbers(scanner);
                    break;
                case 2:
                    checkEven(scanner);
                    break;
                case 3:
                    printNumFromOneToN(scanner);
                    break;
                case 4:
                    displayDayOfTheWeek(scanner);
                    break;
                default:
                    System.out.println("Invalid option");
            }

        }while(option !=5);
        scanner.close();

        System.out.println("Thank you for using the app");
    }


    static void showMenu(){
        System.out.println("==== STUDENT UTILITY APP ====");
        System.out.println("1. Add two numbers");
        System.out.println("2. Check if a number is EVEN or ODD");
        System.out.println("3. Print numbers from 1 to N");
        System.out.println("4. Display day of the week");
        System.out.println("5. Exit");
        System.out.println("Enter your choice: ");
    }

    static void addTwoNumbers(Scanner scanner){
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("Sum is: "+sum);
    }

    static void checkEven(Scanner scanner){
        System.out.println("Enter the number: ");
        int firstNumber = scanner.nextInt();

        String res = firstNumber%2 ==0 ? "EVEN": "ODD";
        System.out.println(res);
    }

    static void printNumFromOneToN(Scanner scanner){


        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        for(int i =1; i<=number; i++){
            System.out.println(i);
        }
    }

    static void displayDayOfTheWeek(Scanner scanner){
        System.out.println("Enter the number of the week: ");
        int option = scanner.nextInt();
        switch (option){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

    }
}


