package com.zyc.tree;

import org.junit.Before;
import org.junit.Test;

public class TestTree {
	Tree<Integer> tree = new Tree<Integer>();
	@Before
	public void init(){
		Node<Integer> root = new Node<Integer>(1);
		Node<Integer> left = new Node<Integer>(2);
		Node<Integer> right = new Node<Integer>(3);
		root.setLeftChild(left);
		root.setRightChild(right);
		tree.setRoot(root);
	}
	@Test
	public void testXian(){
		tree.zhong(tree.getRoot());
	}
}
