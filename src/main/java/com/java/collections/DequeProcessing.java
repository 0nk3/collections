package com.java.collections;

import java.util.*;

class DequeProcessing{

    void process(ArrayDeque<Integer> deque, int subsetSize){


        HashSet<Integer> identical = new HashSet<>();            // store unique sizes of subsets
        ArrayList<Integer> uniqueSizesList = new ArrayList<>();  // store all he actual sizes

        int subsetsNumber = deque.size() - subsetSize + 1; // total number of possible subsets

        System.out.println("original list : " + deque);
        System.out.println("============================================\n");

        for (int i = 0; i < subsetsNumber; i++) {
            Object[] deqAsArray = deque.toArray();
            int loopCount = deque.size()-1;
            for (int j = 0; j < subsetSize; j++) {
                identical.add((Integer) deqAsArray[loopCount-j]);
            }
            // Remove last element
            deque.removeLast();
            uniqueSizesList.add(identical.size());
            System.out.println("Before clear hashset : " + identical);
            identical.clear();
            System.out.println("latest deque : " + deque);
        }
        System.out.println("==================================================\n");
        System.out.println("sizes : " + uniqueSizesList);
    }
    // find the highest number 
    int DetermineMax(ArrayList<Integer> uniqueSizes){
		int highest = 0;
		for(Integer num : uniqueSizes){
			if(num > highest){
				highest = num;
			}
		}
		return highest;
	}
	
}
