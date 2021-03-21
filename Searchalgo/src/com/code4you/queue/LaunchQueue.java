package com.code4you.queue;

public class LaunchQueue {

	public static void main(String[] args) {
		Queue queue = new Queue();
		
		queue.enqueue(10);
		queue.enqueue(7);
		queue.enqueue(32);
		queue.enqueue(77);
		
		queue.printQueue();
		
		queue.dequeue();
		queue.printQueue();

	}

}
