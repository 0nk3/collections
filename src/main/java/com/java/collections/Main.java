package com.java.collections;

import java.util.*;
/* ******************************************************** *
 * @author : Ndumiso Onke Fanti                             *
 * Title   :                           *
 * ******************************************************** */
public class Main {
    public static void main(String[] args) {

        // Creation of all objects
        DeuqueInput deuqueInput = new DeuqueInput();
        DequeProcessing pro = new DequeProcessing();

        //Getting input and  retrieving all the return values from the input methods
        int dequeSize = deuqueInput.getSize();
        int sizeOfSubset = deuqueInput.getSubsetSize();

        Deque<Integer> deque = deuqueInput.getDeque();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

        pro.process((ArrayDeque<Integer>) deque, sizeOfSubset);
    }
}
