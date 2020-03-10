package com.java.collections;

import java.util.*;
/* ********************************************************************** *
 * In this class Im getting the subsets, counting unique numbers and      *
 * finding the highest number found for the unique numbers in the subsets *
 * ********************************************************************** */
class DequeProcessing{
    int process(ArrayDeque<Integer> deque, int subsetSize){

        HashSet<Integer> identical = new HashSet<>();            // store unique sizes of subsets
        ArrayList<Integer> uniqueSizesList = new ArrayList<>();  // store all the actual sizes

        int subsetsNumber = deque.size() - subsetSize + 1; //general formulae for the total number of possible subsets

        for (int i = 0; i < subsetsNumber; i++) {
            Object[] deqAsArray = deque.toArray();
            int loopCount = deque.size()-1;
            for (int j = 0; j < subsetSize; j++) {
                identical.add((Integer) deqAsArray[loopCount-j]);
            }
            // Remove last element
            deque.removeLast();
            // add size of subset to a list
            uniqueSizesList.add(identical.size());

            //clear the hash set on every iteration of each subset creation
            identical.clear();
        }
        return determineMax(uniqueSizesList);
    }
    // find the highest number 
     int determineMax(ArrayList<Integer> uniqueSizes){
		int maximum = 0;
		for(Integer num : uniqueSizes){
			if(num > maximum){
				maximum = num;
			}
		}
		return maximum;
	}
}
