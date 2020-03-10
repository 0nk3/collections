package com.java.collections;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.util.ArrayDeque;
import java.util.ArrayList;

class DequeProcessingTest {

	private DequeProcessing processing = new DequeProcessing();
	private ArrayDeque<Integer> deque = new ArrayDeque<>();

	@Test
	void shouldReturnOneWhenGivenIdenticalNumbers(){
		//given
		for(int i = 0; i < 8; i++){
			deque.add(2);
		}
		//when
		int expected = 1;
		// then
		Assert.assertEquals(expected, processing.process(deque, 3));
		deque.clear();
	}

	@Test
	void shouldReturnThree(){
		//given
		int[] inputNumbers = new int[]{6,2,6,8,3,7,1,4,4};
		for (int number:
			 inputNumbers) {
			deque.add(number);
		}
		// when
		int expected = 3;
		//then
		Assert.assertEquals(expected, processing.process(deque, 3));
		deque.clear();
	}

	@Test
	void shouldReturnTwo(){
		//given
		int[] inputNumbers = new int[]{7,5,5,7,5,5,7,5,5,6};
		for (int number:
			 inputNumbers) {
			deque.add(number);
		}
		// when
		int expected = 2;
		//then
		Assert.assertEquals(expected, processing.process(deque, 3));
		deque.clear();
	}

	@Test
	void shouldReturnHighestNumber(){
		// given
		ArrayList<Integer> numbers = new ArrayList<>();
		int[] nums = new int[]{3,27,0,-4,10,2};
		for (int num: nums) {
			numbers.add(num);
		}
		// then
		int highest = 27;
		// then
		Assert.assertEquals(highest, processing.determineMax(numbers));
	}
}
