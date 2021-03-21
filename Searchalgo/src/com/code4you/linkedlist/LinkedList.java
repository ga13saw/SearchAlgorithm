package com.code4you.linkedlist;

public class LinkedList {
	private Node head;
	private static int length;
	
	public LinkedList() {
		length = 0;
	}
	
	public void append(int data) {
		if(head == null){
			head = new Node(data);
			length++;
			return;
		}
		
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
		length++;
		
	}
	
	public int remove() {
		Node tem_node = head;
		if (tem_node!=null) {
			head = head.next;
			length--;
			return tem_node.data;
		}
		
		return -1;
		
	}
	
	public void printList(){
		Node tem_node = head;
		while(tem_node != null){
			System.out.print(tem_node.data+" ");
			tem_node = tem_node.next;
		}
		System.out.println();
	}

	public int length() {
		return length;
	}

	public void append(int index, int data) {
		Node index_node = new Node(data);
		Node tem_node = head;
		int tem_length = 1;
		while(tem_length != index){
			
			tem_node = tem_node.next;
			tem_length += 1;
		}
		
		index_node.next = tem_node.next;
		tem_node.next = index_node;
		length++;
	}
	
	public LinkedList reverse() {
		LinkedList list = new LinkedList();
		while (head !=null) {
			list.append(remove());
		}
		
		list.printList();
		return list;
	}

	
}




















