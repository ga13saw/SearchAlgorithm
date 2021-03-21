package com.code4you.linkedlist;

public class LaunchLL {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.append(10);
		linkedList.append(30);
		linkedList.append(5);
		
		linkedList.printList();
		System.out.println("\n"+linkedList.length());
		
		linkedList.append(2,50);
		
		linkedList.printList();
		System.out.println("\n"+linkedList.length());
		
		linkedList.remove();
		linkedList.printList();
		System.out.println("\n"+linkedList.length());
		
		linkedList.reverse();
		
		
	}

}
