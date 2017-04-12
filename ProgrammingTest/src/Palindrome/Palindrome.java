package Palindrome;

import Interface.Digit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Alfie on 4/10/2017.
 * Palindrome.java
 */
public class Palindrome extends Digit{

    // Palindrome Checker
    public boolean isDigitPalindrome(Integer[] array) {
        boolean retVal = false;

        // Check if array not empty
        if (array.length != 0 && array.length != 1) {
            Integer arrayLength = array.length;

            // Reverse Array and compare check
            // Stop at middle to reduce iteration
            retVal = true;
            for (int x = arrayLength -1, y = 0; y < (arrayLength / 2); x--, y++) {
                if (array[x] != array[y]) {
                    retVal = false;
                    break;
                }
            }
        }

        return retVal;
    }

    public boolean isDigitLapindrome(Integer[] array) {
        boolean retVal = false;

        // Check if array not empty
        if (array.length != 0 && array.length != 1) {
            Integer arrayLength = array.length;

            //Declare 2 list
            List<Integer> listA = new ArrayList<>();
            List<Integer> listB = new ArrayList<>();

            // Reverse Array and compare check
            // Stop at middle to reduce iteration
            for (int x = arrayLength -1, y = 0; y < (arrayLength / 2); x--, y++) {
                //add values to list
                listA.add(array[x]);
                listB.add(array[y]);
            }

            Collections.sort(listA);
            Collections.sort(listB);

            retVal = true;
            for (int x = 0; x < listA.size(); x++) {
                if (listA.get(x) != listB.get(x))
                {
                    retVal = false;
                    break;
                }
            }
        }

        return retVal;
    }

    // Display result if palindrome or not
    public void displayPalindrome(Integer[] array) {
        if (isDigitPalindrome(array)) {
            System.out.println("It's a Palindrome");
        } else {
            System.out.println("It's NOT a Palindrome");
        }
    }

    // Display result if lapindrome or not
    public void displayLapindrome(Integer[] array) {
        if (isDigitLapindrome(array))
        {
            System.out.println("It's a Lapindrome");
        } else {
            System.out.println("It's NOT a Lapindrome");
        }
    }
}
