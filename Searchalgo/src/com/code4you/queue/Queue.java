package com.code4you.queue;

public class Queue {
	
	private Node first;
	private Node last;
	public int lenght;
	
	public Queue() {
		this.first = null;
		this.last = null;
		lenght = 0;
	}
	
	public void enqueue(int data) {
		if (isEmpty()) {
			first = new Node(data);
			last = first;
			lenght++;
			return;
		}
		
		Node new_node = new Node(data);
		new_node.next = first;
		first = new_node;
		lenght++;
	}
	
	public int dequeue() {
		if (isEmpty()) {
			return 0;
		}
		Node delete_node = first;
		first = first.next;
		int value = delete_node.data;
		delete_node = null;
		lenght--;
		return value;
	}
	
	public boolean isEmpty() {
		if (first == null) {
			return true;
		}
		return false;
	}
	
	public void printQueue() {
		if (isEmpty()) {
			return;
		}
		Node print_node = first;
		while (print_node!=null) {
			System.out.print(print_node.data+" ");
			print_node = print_node.next;
		}
		System.out.println();
	}
}









