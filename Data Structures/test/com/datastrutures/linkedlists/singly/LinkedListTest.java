package com.datastrutures.linkedlists.singly;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.datastructures.linkedlists.singly.LinkedList;

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
		String[] stringsToAdd = "Everything is one".split(" ");

		//When
		for (String string : stringsToAdd) {
			linkedListObject.add(string);
		}
		
		// Then
		assertEquals(false, linkedListObject.isEmpty());
	}

	@Test
	public void testAdd() {
		// Given
		String[] stringsToAdd = "Everything is one".split(" ");
		
		// When
		for (String string : stringsToAdd) {
			linkedListObject.add(string);
		}
		
		// Then
		assertEquals(stringsToAdd.length, linkedListObject.size());
	}

	@Test
	public void testToString() {
		// Given
		String[] stringsToAdd = "Everything is one".split(" ");

		//When
		for (String string : stringsToAdd) {
			linkedListObject.add(string);
		}
		
		// Then
		assertEquals("[Everything,is,one]", linkedListObject.toString());
	}

}
