package com.phani.trees;

public class SortedArrayToMinHeightBinaryTree {

	public static void main(String[] args) {
		int sortedArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		SortedArrayToMinHeightBinaryTree sortedArrayToMinHeightBinaryTree = new SortedArrayToMinHeightBinaryTree();
		BSTNode treeCreated = sortedArrayToMinHeightBinaryTree.createBST(
				sortedArray, 0, sortedArray.length - 1);
		System.out.println(treeCreated.getData());
		System.out.println(treeCreated.getLeft().getData());
	}

	private BSTNode createBST(int[] sortedArray, int startIndex, int endIndex) {
		if (startIndex > endIndex) {
			return null;
		}
		int midElementIndex = (startIndex + endIndex) / 2;
		BSTNode bst = new BSTNode();
		bst.setData(sortedArray[midElementIndex]);
		bst.setLeft(createBST(sortedArray, startIndex, midElementIndex - 1));
		bst.setRight(createBST(sortedArray, midElementIndex + 1, endIndex));
		return bst;
	}
}
