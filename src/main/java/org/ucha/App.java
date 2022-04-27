package org.ucha;

import java.util.Scanner;

/**
 * This is the main class of the application
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = org.ucha.Job.inputRead(scanner);

        myArray = org.ucha.Job.sortedArray(myArray);
        for (int i = 0; i < myArray.length; i++)
            System.out.println(myArray[i]);
    }
}