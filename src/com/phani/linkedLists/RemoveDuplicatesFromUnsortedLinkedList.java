package com.phani.linkedLists;

import java.util.HashSet;

public class RemoveDuplicatesFromUnsortedLinkedList {
 
    public static void removeDuplicates(Node headNode){
 
        HashSet<Integer> occuredItems = new HashSet<Integer>();
 
        Node tempNode = headNode;
        
        if(headNode == null){
           return;
          }
        else{
          //initializing hash
          occuredItems.add(headNode.data);
        }
 
        // this loop will kick start only when we have ATLEAST two nodes
        while(tempNode != null && tempNode.next != null){
            // if next node is a duplicate node
            if(occuredItems.contains((tempNode.next).data)){
 
                //then jump over it
                tempNode.next = (tempNode.next).next;
              }
            else{
               // add next node data to hash
               occuredItems.add((tempNode.next).data);
               tempNode = tempNode.next;
            }
        }
    }
 
    public static void printList(Node headNode){
 
        while(headNode != null){ 
            // printing the data at current node
            System.out.print(headNode.data+" "); 
            // moving to next node in list
            headNode = headNode.next; 
         }
    }
 
    // this method adds node to front of list
    public static Node addNode(Node nodeHead,int data){
        Node newNode = new Node(data);
 
        // if list is empty then the newly created node becomes head node
        if(nodeHead == null){
           return newNode;
          }
        // otherwise append new node to start of list and return it as head
        else{
           newNode.next = nodeHead;
           return newNode;
        }
    }
 
    public static void main(String [] args){
 
        // Creating a Linked List of six nodes
        // HEAD-->2-->2-->7-->4-->3-->4-->null
 
        Node headNode = null;
 
        headNode = addNode(headNode, 4);
        headNode = addNode(headNode, 3);
        headNode = addNode(headNode, 4);
        headNode = addNode(headNode, 7);
        headNode = addNode(headNode, 2);
        headNode = addNode(headNode, 2);
 
        removeDuplicates(headNode);
        printList(headNode);
 
   }
 
}