package com.code4you.stack;

public class LaunchStack {

	public static void main(String[] args) {
		Stack stack = new Stack(10);
		stack.push(10);
		stack.push(60);
		stack.push(5);
		stack.push(48);
		stack.printStack();
		stack.pop();
		stack.pop();
		stack.printStack();
		System.out.println(stack.length);
	//	System.out.println(stack.);
	}

}
