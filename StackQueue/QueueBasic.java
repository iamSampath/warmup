// Author: Sampath
// This program Implments LinkedList utilizing the Queue Concepts

import java.io.*;
import java.util.*;

class QueueBasic{
    Node head;
   static class Node{
        int data;
        Node next;
        Node(int d){
          data = d;
        }
    }
     Node tail;

    public void add(int insData){
        //Create a Node
        Node simpleNode = new Node(insData);
        // Head and Tail shouldn't be null otherwise make head and tail as null

        // First In First Out
        if(tail!=null){
          tail.next = simpleNode;
        }
        tail = simpleNode;
        if(head == null) {
            head = simpleNode;
        }
    }

     public int remove(){
        int data = head.data;
        head = head.next;
        if(head == null){
            tail = null;
        }
        return data;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int peek(){
        return head.data;
    }

    public void printNode(){
        while(head != null){
            System.out.print(head.data + "\t");
            head = head.next;
        }
    }

    public static void main(String[] args){

        QueueBasic qb = new QueueBasic();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(30);
        nums.add(15);
        nums.add(40);
        nums.add(80);
        nums.add(200);

        for(Integer num : nums){
            qb.add(num);
        }
        System.out.println(qb.peek());
        System.out.println(qb.remove());
        System.out.println(qb.isEmpty());
        qb.printNode();
    }

}