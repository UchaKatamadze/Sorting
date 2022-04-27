package org.ucha;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This class reads the numbers from the user and sorts in into the array.
 */
public class Job {

    public static int [] inputRead(Scanner scanner)
    {
        String str = scanner.nextLine();
        String[] numbers = str.split(" ");
        int [] myArray = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            myArray[i] = Integer.parseInt(numbers[i]);
        }
        return myArray;
    }

    public static int[] sortedArray(int[] newArray) {
        Arrays.sort(newArray);
        return newArray;
    }
}