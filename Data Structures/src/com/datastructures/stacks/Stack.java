package com.datastructures.stacks;

import com.datastructures.linkedlists.doubly.LinkedList;

public class Stack<E> extends LinkedList<E> {
	
	public void push(E data) {
		addFirst(data);
	}
	
	public E pop() {
		return removeFirst();
	}
	
	public E peek() {
		return super.peek();
	}
}
