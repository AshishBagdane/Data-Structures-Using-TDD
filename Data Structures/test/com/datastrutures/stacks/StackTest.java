package com.datastrutures.stacks;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.datastructures.stacks.Stack;

public class StackTest {
	
	private Stack<String> stackObject;

	@Before
	public void setUp() throws Exception {
		stackObject = new Stack<>();
	}

	@After
	public void tearDown() throws Exception {
		stackObject = null;
	}

	@Test
	public void testIsEmpty() {
		// Given

		// When
		
		// Then
		assertTrue(stackObject.isEmpty());
	}
	
	@Test
	public void testPush() {
		// Given
		String[] strings = "Hello World!".split(" ");
		
		// When
		for (String string : strings) {
			stackObject.push(string);
		}
		
		// Then
		assertEquals("[World!,Hello]", stackObject.toString());
	}
	
	@Test
	public void testPop() {
		// Given
		String[] strings = "Hello World!".split(" ");
		
		// When
		for (String string : strings) {
			stackObject.push(string);
		}
		
		// Then
		assertEquals("World!", stackObject.pop());
	}

	@Test
	public void testPeek() {
		// Given
		String[] strings = "Hello World!".split(" ");
		
		// When
		for (String string : strings) {
			stackObject.push(string);
		}
		
		// Then
		assertEquals("World!", stackObject.peek());
	}
	
}
