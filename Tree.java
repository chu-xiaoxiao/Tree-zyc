package com.zyc.tree;

public class Tree<T> {
	private Node<T> root;

	public Tree() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tree(Node<T> root) {
		super();
		this.root = root;
	}

	public Node<T> getRoot() {
		return root;
	}

	public void setRoot(Node<T> root) {
		this.root = root;
	}
	
	public void zhong(Node<T> node){
		if(node.getLeftChild()!=null){
			zhong(node.getLeftChild());
		}
		System.out.println(node.getValue());
		if(node.getRightChild()!=null){
			zhong(node.getRightChild());
		}
	}
	
	public void xian(Node<T> node){
		System.out.println(node.getValue());
		if(node.getLeftChild()!=null){
			xian(node.getLeftChild());
		}
		if(node.getRightChild()!=null){
			xian(node.getRightChild());
		}
	}
	
	public void hou(Node<T> node){
		if(node.getLeftChild()!=null){
			hou(node.getLeftChild());
		}
		if(node.getRightChild()!=null){
			hou(node.getRightChild());
		}
		System.out.println(node.getValue());
	}
}
