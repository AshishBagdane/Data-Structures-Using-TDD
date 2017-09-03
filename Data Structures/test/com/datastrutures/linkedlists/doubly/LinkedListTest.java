package com.datastrutures.linkedlists.doubly;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.datastructures.linkedlists.doubly.LinkedList;

public class LinkedListTest {
	
	private LinkedList<String> linkedListObject;

	@Before
	public void setUp() throws Exception {
		linkedListObject = new LinkedList<>();
	}

	@After
	public void tearDown() throws Exception {
		linkedListObject = null;
	}

	@Test
	public void testIsEmpty() {
		// Given
		String[] stringsToAdd = "I am learning Test Driven Development".split(" ");
		
		// When
		for (String string : stringsToAdd) {
			linkedListObject.addLast(string);
		}
		
		// Then
		assertFalse(linkedListObject.isEmpty());
	}

	@Test
	public void testAddLast() {
		// Given
		String[] stringsToAdd = "I am learning Test Driven Development".split(" ");
		
		// When
		for (String string : stringsToAdd) {
			linkedListObject.addLast(string);
		}
		
		// Then
		assertEquals("[I,am,learning,Test,Driven,Development]", linkedListObject.toString());
	}

	@Test
	public void testAddFirst() {
		// Given
		String[] stringsToAdd = "Hello World!".split(" ");
		
		// When
		for (String string : stringsToAdd) {
			linkedListObject.addFirst(string);
		}
		
		// Then
		assertEquals("[World!,Hello]", linkedListObject.toString());
	}
	
	@Test
	public void testRemoveFirst() {
		// Given
		String[] stringsToAdd = "Hello World!".split(" ");
		
		// When
		for (String string : stringsToAdd) {
			linkedListObject.addFirst(string);
		}
		linkedListObject.removeFirst();
		
		// Then
		assertEquals("[Hello]", linkedListObject.toString());
	}
	
	@Test
	public void testRemoveLast() {
		// Given
		String[] stringsToAdd = "Hello World!".split(" ");
		
		// When
		for (String string : stringsToAdd) {
			linkedListObject.addLast(string);
		}
		linkedListObject.removeLast();
		
		// Then
		System.out.println(linkedListObject.toString());
		assertEquals("[Hello]", linkedListObject.toString());
	}

	@Test
	public void testRemove() {
		// Given
		String[] stringsToAdd = "Hello World!".split(" ");
		
		// When
		for (String string : stringsToAdd) {
			linkedListObject.addFirst(string);
		}
		
		// Then
		assertEquals("Hello", linkedListObject.remove("Hello"));
	}

	@Test
	public void testToString() {
		// Given
		String[] stringsToAdd = "Hello World!".split(" ");
		
		// When
		for (String string : stringsToAdd) {
			linkedListObject.addLast(string);
		}
		
		// Then
		assertEquals("[Hello,World!]", linkedListObject.toString());
	}

}