package com.phani.trees;

//Java program to check is binary tree is symmetric or not
class BNode {

 int key;
 BNode left, right;

 BNode(int item) {
     key = item;
     left = right = null;
 }
}

class CheckIfABinarySearchTreeIsMirror {

 static BNode root;

 // returns true if trees with roots as root1 and root2 are mirror
 boolean isMirror(BNode node1, BNode node2) {

     // if both trees are empty, then they are mirror image
     if (node1 == null && node2 == null) {
         return true;
     }

     // For two trees to be mirror images, the following three
     // conditions must be true
     // 1 - Their root node's key must be same
     // 2 - left subtree of left tree and right subtree
     //      of right tree have to be mirror images
     // 3 - right subtree of left tree and left subtree
     //      of right tree have to be mirror images
     if (node1 != null && node2 != null && node1.key == node2.key) {
         return (isMirror(node1.left, node2.right)
                 && isMirror(node1.right, node2.left));
     }

     // if neither of the above conditions is true then
     // root1 and root2 are mirror images
     return false;
 }

 // returns true if the tree is symmetric i.e
 // mirror image of itself
 boolean isSymmetric(BNode node) {

     // check if tree is mirror of itself
     return isMirror(root, root);
 }

 // Driver program
	public static void main(String args[]) {
		CheckIfABinarySearchTreeIsMirror tree = new CheckIfABinarySearchTreeIsMirror();
		tree.root = new BNode(1);
		tree.root.left = new BNode(2);
		tree.root.right = new BNode(2);
		tree.root.left.left = new BNode(3);
		tree.root.left.right = new BNode(4);
		tree.root.right.left = new BNode(4);
		tree.root.right.right = new BNode(3);
		boolean output = tree.isSymmetric(root);
		if (output == true) {
			System.out.println("1");
			System.out.println("Mirror image ");
		} else {
			System.out.println("0");
			System.out.println("Not a mirror image");
		}
	}
}