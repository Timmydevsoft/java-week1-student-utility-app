package org.timmy;

import java.util.Scanner;

public class StudentUtilityApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        showMenu();
        int option = scanner.nextInt();
        switch (option){
            case 1:
                addTwoNumbers();
                break;
            case 2:
                checkEven();

        }
        if(option ==1){
            addTwoNumbers();
        }
    }


    static void showMenu(){
        System.out.println("==== STUDENT UTILITY APP ====");
        System.out.println("1. Add two numbers");
        System.out.println("2. Check if a number is EVEN or ODD");
        System.out.println("3. Print numbers from 1 to N");
        System.out.println("4. Display day of the week");
        System.out.println("5. Exit");
        System.out.println("Enter your choice");
    }

    static void addTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;

        System.out.println("Sum is: "+sum);
        showMenu();

    }

    static void checkEven(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int firstNumber = scanner.nextInt();

        String res = firstNumber%2 ==0 ? "EVEN": "ODD";
        System.out.println(res);
    }
}


