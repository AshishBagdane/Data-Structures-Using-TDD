package com.datastructures.linkedlists.singly;

public class LinkedList<E> {

	private class Node<T> {
		
		private T data;
		private Node<T> next;
		
		public Node() {
			// TODO Auto-generated constructor stub
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}
		
	}
	
	private Node<E> head;
	private long size;
	
	public boolean isEmpty() {
		return (head == null);
	}
	
	public void add(E data) {
		Node<E> node = new Node<>();
		node.setData(data);
		if (this.isEmpty()) {
			head = node;
		} else {
			Node<E> temp = getLastNode();
			temp.setNext(node);
		}
		size++;
	}
	
	private Node<E> getLastNode() {
		Node<E> temp = head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		return temp;
	}
	
	@Override
	public String toString() {
		StringBuffer output = new StringBuffer();
		
		output.append('[');
		
		Node<E> temp = head;
		while (temp.getNext() != null) {
			output.append(temp.getData()).append(',');
			temp = temp.getNext();
		}
		output.append(temp.getData());
		
		output.append(']');
		
		return output.toString();
	}

	public long size() {
		// TODO Auto-generated method stub
		return size;
	}
}
