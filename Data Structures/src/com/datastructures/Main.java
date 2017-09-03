package com.datastructures;

import com.datastructures.linkedlists.doubly.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		
		linkedList.addLast("One");
		linkedList.addFirst("Two");
		linkedList.addFirst("Three");
		
		System.out.println(linkedList.toString());
	}
}
