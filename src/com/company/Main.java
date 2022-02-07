package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner appScanner = new Scanner(System.in).useDelimiter("\n");

        try {
            runErrors(appScanner);
        } catch (ArithmeticException e) {
            System.out.println("Value cannot be divided by 0");
        } catch (NullPointerException e) {
            System.out.println("String can't be null");
        } catch (NumberFormatException e) {
            System.out.println("Can't parse string");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index not available");
        } catch (NewException e) {
        }

    }

    public static void runErrors(Scanner appScanner) throws ArithmeticException, NullPointerException, NumberFormatException, ArrayIndexOutOfBoundsException, NewException{
        System.out.println("Choose an exception to handle:");
        System.out.println("[1]Arithmetic, [2]NullPointer, [3]NumberFormat, [4]ArrayIndexOutOfBounds, [5]NewException");
        int option = appScanner.nextInt();
        do {
            if (option == 1) {
                int dividedByZero = 10 / 0;
            } else if (option == 2) {
                String text = null;
                System.out.println(text.length());
            } else if (option == 3) {
                String myOtherString = "hello";
                System.out.println(Integer.parseInt(myOtherString));
            } else if (option == 4) {
                String[] myWords = {"Hello", "World"};
                System.out.println(myWords[2]);
            } else if (option == 5) {
                try {
                    throw new NewException("Last Exception 2");
                } catch (NewException e) {
                    System.out.println(e);
                }
            }
            option++;
        } while (option == 5);
    }
}

class NewException extends Exception {
    public NewException(String message) {
        super(message);
        System.out.println("Last exception 1");
    }
}
