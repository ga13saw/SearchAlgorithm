package com.code4you.stack;

public class Stack {
	private int top;
	private int bottom;
	public int length;
	private int[] stack;
	
	public Stack(int capacity) {
		stack = new int[capacity];
		length = 0;
		top = 0;
		bottom = -1;
	}
	
	public void push(int value) {
		if (isEmpty()) {
			bottom = bottom +1;
			
		}
		stack[top++] = value;
		length++;
		
	}
	
	public int pop() {
		if(isEmpty()){
			bottom = bottom - 1;
			throw new NullPointerException();
		}
		 
		length--;
		return stack[--top];
	}
	
	public boolean isEmpty() {
		if(top == 0){
			return true;
		}
		return false;
	}
	public void printStack() {
		if(isEmpty()){
			throw new NullPointerException();
		}
		for (int i = top-1; i > -1; i--) {
			
			System.out.print(stack[i] + " ");
			
		}
		System.out.println();
	}
}










