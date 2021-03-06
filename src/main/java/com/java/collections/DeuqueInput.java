package com.java.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
/* ******************************************************************** *
 * In this class I'm simply getting all the required input from the user*
 * and validating it                                                    *
 * ******************************************************************** */
class DeuqueInput {

    private Deque<Integer> deque = new ArrayDeque<>();
    private Scanner input = new Scanner(System.in);

    // Lets retrieve the size of the deque
    int getSize() {
        System.out.println("Enter the size of the deque : ");
        return input.nextInt();
    }
    // Lets get the size of a subset generated
    int getSubsetSize() {
        System.out.println("Enter the size a subset : ");
        int subsetSize = input.nextInt();
        input.nextLine(); // consume next line
        return subsetSize;
    }

    Deque<Integer> getDeque() throws NumberFormatException {
        System.out.println("Enter deque elements eg 4 5 8 0 0 : ");
        String element = input.nextLine();

        String[] intArray = element.split(" ");
        //Take all the read input and convert to int, store in a deque and return the deque
        for (String strNum: intArray) {
            try {
                deque.add(Integer.parseInt(strNum));
            }catch (NumberFormatException e){
                System.err.println("Sorry, Your input is invalid");
                throw new NumberFormatException();
            }
        }
        return deque;
    }
}
