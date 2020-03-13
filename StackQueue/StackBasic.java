import java.io.*;
import java.util.*;


class StackBasic {

    static class Node
    {
        int data;
        Node next;
        Node(int d){
            data = d;
        }
    }

    static Node top;

    static void printStack(){
        while(top!=null){
            System.out.println(top.data);
            System.out.println();
            top = top.next;
        }

    }
    static int peek(){return top.data;}
    static boolean isEmpty(){return top == null;}
    static void push(Node node){
        node.next = top;
        top = node;
    }
    static int pop(){
        int data = top.data;
        top = top.next;
        return data;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        for (Integer num : nums) {
            Node node = new Node(num);
            push(node);
        }
        System.out.println(peek());
        System.out.println(pop());

        System.out.println();
        printStack();

    }
}