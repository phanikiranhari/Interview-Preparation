package com.phani.linkedLists;

public class ReverseALinkedListUsingRecursion {
	
	 private RecursiveNode head;  
	  
	 private static class RecursiveNode {  
	  private int value;  
	  private RecursiveNode next;  
	  
	  RecursiveNode(int value) {  
	   this.value = value;  
	  
	  }  
	 }  
	  
	 public void addToTheLast(RecursiveNode node) {  
	  
	  if (head == null) {  
	   head = node;  
	  } else {  
		  RecursiveNode temp = head;  
	   while (temp.next != null)  
	    temp = temp.next;  
	  
	   temp.next = node;  
	  }  
	 }  
	  
	  
	 public void printList(RecursiveNode head) {  
		 RecursiveNode temp = head;  
	  while (temp != null) {  
	   System.out.format("%d ", temp.value);  
	   temp = temp.next;  
	  }  
	  System.out.println();  
	 } 
	
	public static RecursiveNode reverseLinkedList(RecursiveNode node) {  
	     if (node == null || node.next == null) {  
	         return node;  
	     }  
	  
	     RecursiveNode remaining = reverseLinkedList(node.next);  
	     node.next.next = node;  
	     node.next = null;  
	    return remaining;  
	 }

	 public static void main(String[] args) {  
		 ReverseALinkedListUsingRecursion list = new ReverseALinkedListUsingRecursion();  
	  // Creating a linked list  
		 RecursiveNode head=new RecursiveNode(5);  
	  list.addToTheLast(head);  
	  list.addToTheLast(new RecursiveNode(6));  
	  list.addToTheLast(new RecursiveNode(7));  
	  list.addToTheLast(new RecursiveNode(1));  
	  list.addToTheLast(new RecursiveNode(2));  
	   
	  list.printList(head);  
	  //Reversing LinkedList  
	  RecursiveNode reverseHead=reverseLinkedList(head);  
	  System.out.println("After reversing");  
	  list.printList(reverseHead);  
	   
	 }  
}
