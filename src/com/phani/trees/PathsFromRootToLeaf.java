package com.phani.trees;

import java.util.ArrayList;
import java.util.List;

public class PathsFromRootToLeaf {
	
	public static void main(String[] args) {
		BinaryTreeImplementation tree = new BinaryTreeImplementation();
		BSTNode binaryTree  = null;
		List<Integer> listOfIntegers = new ArrayList<Integer>();
		List<Integer> path = new ArrayList<Integer>();
		listOfIntegers.add(5);
		listOfIntegers.add(3);
		listOfIntegers.add(8);
		listOfIntegers.add(2);
		listOfIntegers.add(4);
		listOfIntegers.add(1);
		listOfIntegers.add(7);
		listOfIntegers.add(9);
		for (Integer value : listOfIntegers){
			binaryTree = tree.createABinaryTree(value);
		}
		printPathFromRootToLeaf(binaryTree, path);
	}

	private static void printPathFromRootToLeaf(BSTNode binaryTree, List<Integer> path) {
		
		if (binaryTree == null){
			return;
		}
		path.add(binaryTree.getData());
		if (binaryTree.getLeft() == null && binaryTree.getRight() == null){
			System.out.println(path);
		}
		else{
			printPathFromRootToLeaf(binaryTree.getLeft(), new ArrayList<Integer>(path));
			printPathFromRootToLeaf(binaryTree.getRight(), new ArrayList<Integer>(path));
		}
	}
}
