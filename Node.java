package com.zyc.tree;

public class Node<T> {
	private T value;
	private Node<T> leftChild;
	private Node<T> rightChild;
	public Node() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Node(T value) {
		super();
		this.value = value;
	}


	public Node(T value, Node<T> leftChild, Node<T> rightChild) {
		super();
		this.value = value;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}


	public T getValue() {
		return value;
	}


	public void setValue(T value) {
		this.value = value;
	}


	public Node<T> getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(Node<T> leftChild) {
		this.leftChild = leftChild;
	}
	public Node<T> getRightChild() {
		return rightChild;
	}
	public void setRightChild(Node<T> rightChild) {
		this.rightChild = rightChild;
	}

	
}
