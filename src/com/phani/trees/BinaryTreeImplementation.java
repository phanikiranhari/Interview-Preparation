package com.phani.trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeImplementation {

	static List <Integer> list = new ArrayList<Integer>();
	private static BSTNode root;

	public static void main(String[] args) {
		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(3);
		numberList.add(2);
		numberList.add(4);
		numberList.add(1);
		numberList.add(5);
		BinaryTreeImplementation treeImplementation = new BinaryTreeImplementation();
		for (Integer value : numberList) {
			root = treeImplementation.createABinaryTree(value);
		}
		/*System.out.println("Tree Created");
		System.out.println(root.getData());
		System.out.println(root.getLeft().getData());
		System.out.println(root.getRight().getData());*/
		int searchValue = 5;
		System.out.println("Searching for "+searchValue);
		boolean searchResult = search(root, searchValue);
		System.out.println("Search found is "+searchResult);
		System.out.println("In order traversal of the tree is ");
		inorderTraversal(root);
		System.out.println();
		System.out.println("Pre order traversal of the tree is ");
		preOrderTraversal(root);
		System.out.println();
		System.out.println("Post order traversal of the tree is ");
		postOrderTraversal(root);
	}


	private static boolean search(BSTNode node, int searchValue) {
		boolean found = false;
		if (node != null && node.getData() == searchValue) {
			found = true;
		} else {
			if (node!=null && node.getData() != null) {
				if (node.getData() > searchValue) {
					node = node.getLeft();
				} else {
					node = node.getRight();
				}
				found = search(node, searchValue);
			} else {
				found = false;
			}
		}
		return found;
	}


	public BSTNode createABinaryTree(Integer value) {
		root = insertIntoTree(root, value);
		//System.out.println(root.getData());
		return root;
	}

	private static BSTNode insertIntoTree(BSTNode root, Integer value) {

		if (root == null) {
			// Tree is empty. Create root node first
			root = createNode(root, value);
		} else {
			if (value < root.getData()) {
				root.setLeft(insertIntoTree(root.getLeft(), value));
			} else {
				root.setRight(insertIntoTree(root.getRight(), value));
			}
		}
		return root;
	}

	private static BSTNode createNode(BSTNode node, Integer value) {
		node = new BSTNode();
		node.setData(value);
		node.setLeft(null);
		node.setRight(null);
		return node;
	}
	private static void inorderTraversal(BSTNode node) {
		if (node != null) {
			inorderTraversal(node.getLeft());
			System.out.print(node.getData() + " ");
			inorderTraversal(node.getRight());
		}
	}
	private static boolean checkIfABinaryTreeIsBST(BSTNode node) {
		int i =0;
		if (node != null) {
			inorderTraversal(node.getLeft());
			System.out.print(node.getData() + " ");
			if (list == null){
				list.add(node.getData());
				i=i+1;
			}
			else{
				if (node.getData() < list.get(i)){
					return false;
				}
			}
			inorderTraversal(node.getRight());
		}
		return true;
	}
	private static void preOrderTraversal(BSTNode node) {
		if (node != null) {
			System.out.print(node.getData() + " ");
			preOrderTraversal(node.getLeft());
			preOrderTraversal(node.getRight());
		}
	}
	
	private static void postOrderTraversal(BSTNode node) {
		if (node != null) {
			postOrderTraversal(node.getLeft());
			postOrderTraversal(node.getRight());
			System.out.print(node.getData() + " ");
		}
	}
}
