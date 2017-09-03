package com.datastructures.linkedlists.doubly;

public class LinkedList<E> {

	private class Node<T> {
		
		private T data;
		private Node<T> next;
		private Node<T> prev;
		
		public Node(T data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			this.next = null;
			this.prev = null;
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

		public Node<T> getPrev() {
			return prev;
		}

		public void setPrev(Node<T> prev) {
			this.prev = prev;
		}
		
	}
	
	private Node<E> head;
	private Node<E> tail;
	private int size;
	
	public boolean isEmpty() {
		return (head == null);
	}
	
	public void addLast(E data) {
		Node<E> node = new Node<>(data);
		if (this.isEmpty()) {
			head = tail = node;
		} else {
			Node<E> temp = tail;
			temp.setNext(node);
			tail = node;
			node.setPrev(temp);
		}
		size++;
	}
	
	public void addFirst(E data) {
		Node<E> node = new Node<>(data);
		if (this.isEmpty()) {
			head = tail = node;
		} else {
			Node<E> temp = head;
			node.setNext(temp);
			head = node;
			temp.setPrev(node);
		}
		size++;
	}
	
	public E remove(E data) {
		Node<E> nodeWithRequiredData = getNodeWithData(data);
		E dataToReturn = null;
		if (nodeWithRequiredData != null) {
			dataToReturn = nodeWithRequiredData.getData();
			remove(nodeWithRequiredData);
		}
		return dataToReturn;
	}
	
	public E removeFirst() {
		Node<E> nodeToRemove = head;
		E dataToReturn = head.getData();
		Node<E> nextNode = nodeToRemove.getNext();
		if (nextNode != null) {
			nextNode.setPrev(null);
		}
		head = nextNode;
		return dataToReturn;
	}
	
	public E removeLast() {
		Node<E> nodeToRemove = tail;
		E dataToReturn = tail.getData();
		Node<E> prevNode = nodeToRemove.getPrev();
		if (prevNode != null) {
			prevNode.setNext(null);
		}
		tail = prevNode;
		return dataToReturn;
	}

	private void remove(Node<E> nodeWithRequiredData) {
		boolean isFirstNode = (head.equals(nodeWithRequiredData));
		boolean isLastNode = (tail.equals(nodeWithRequiredData));
		boolean isOnlyNode = (isFirstNode && isLastNode);
		boolean isInBetweenNode = !isOnlyNode;
		if (isOnlyNode) {
			head = tail = nodeWithRequiredData = null;
		} else if (isFirstNode) {
			removeFirst();
		} else if (isLastNode) {
			removeLast();
		} else if (isInBetweenNode) {
			nodeWithRequiredData.getNext().setPrev(nodeWithRequiredData.getPrev());
			nodeWithRequiredData.getPrev().setNext(nodeWithRequiredData.getNext());
		}
	}
	
	private Node<E> getNodeWithData(E data) {
		Node<E> temp = head;
		while (temp != null && temp.getData().equals(data) != true) {
			temp = temp.getNext();
		}
		return temp;
	}
	
	protected E peek() {
		return head.getData();
	}
	
	@Override
	public String toString() {
		StringBuffer output = new StringBuffer();
		
		output.append('[');
		
		if (!this.isEmpty()) {
			Node<E> temp = head;
			while (temp.getNext() != null) {
				output.append(temp.getData()).append(',');
				temp = temp.getNext();
			}
			output.append(temp.getData());
		}
		
		output.append(']');
		
		return output.toString();
	}
	
}