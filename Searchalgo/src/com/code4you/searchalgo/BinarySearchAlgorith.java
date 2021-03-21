package com.code4you.searchalgo;

public class BinarySearchAlgorith {
	
	public static void main(String[] args) {
		int[] numbers = {4,8,10,55,60,75};
		int searchValue = recursiveSearch(numbers, 75);
		System.out.println(searchValue);
	}
	
	public static int searchValue(int[] numbers, int value) {
		int start = 0;
		int end = numbers.length;
		
		while(start<end){
		int midpoint = (end + start) / 2;
		if(numbers[midpoint] == value){
			return midpoint;
		}
		else if(value < numbers[midpoint]){
			end = midpoint;
			
		}else{
			start = midpoint + 1;
		}
		
		
		}
		return -1;
	}
	
	public static int recursiveSearch(int[] numbers, int value) {
		return recursiveSearch(numbers,0,numbers.length,value);
	}

	private static int recursiveSearch(int[] numbers, int start, int end, int value) {
		if (start >= end) {
			return -1;
		}
		
		int midpoint = (end + start)/2;
		
		if (numbers[midpoint] == value) {
			return midpoint;
		} else if(numbers[midpoint] < value) {
			return recursiveSearch(numbers, midpoint + 1, end, value);
		}else{
			return recursiveSearch(numbers, start, midpoint, value);
		}
		
	}
}















