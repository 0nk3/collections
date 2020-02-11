package com.java.collections;

import java.util.*;
/* ******************************************************** *
 * @author : Ndumiso Onke Fanti                             *
 * Title   : Java Collections                               *
 * ******************************************************** */
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        // Creation of all objects
        DeuqueInput deuqueInput = new DeuqueInput();
        DequeProcessing pro = new DequeProcessing();

        // Getting input and  retrieving all the return values from the input methods
        int dequeSize = deuqueInput.getSize();
        int sizeOfSubset = deuqueInput.getSubsetSize();

        Deque<Integer> deque = deuqueInput.getDeque();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

        int output = pro.process((ArrayDeque<Integer>) deque, sizeOfSubset);
        System.out.println(output);
    }
}
