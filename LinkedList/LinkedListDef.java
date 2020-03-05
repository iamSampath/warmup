/*
 *  Author: Sampath Medarametla
 *  This program explains about the Linkedlist def, operations like Insert, print elements
 */

import java.util.*;

class LinkedListDef {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void insertNodeAtPos(int insNode, int pos) {

        Node newNode = new Node(insNode);
        Node currentNode = head;
        Node tempNode;

        int counter = 1;

        while (currentNode != null) {
            tempNode = currentNode.next;
            if (counter == pos) {
                currentNode.next = newNode;
                newNode.next = tempNode;
                return;
            }
            counter++;
            currentNode = currentNode.next;

        }

    }

    public void searchNode(int searNode) {
        Node currentNode = head;
        if (currentNode.next == null) {
            System.out.println("The List is empty");
        } else {
            while (currentNode != null) {
                if (currentNode.data == searNode) {
                    System.out.println("Element Found in the List!!");
                    return;
                }
                currentNode = currentNode.next;
            }
        }
        System.out.println("Element is not found in the list!!");
    }

    public void deleteNode(int delNode) {

        Node temp = head;
        Node prevNode = null;
        if (temp != null && temp.data == delNode) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != delNode) {
            prevNode = temp;
            temp = temp.next;
        }
        if (temp == null) return;
        prevNode.next = temp.next;
    }

    public void printList() {
        Node currentNode1 = head;
        while (currentNode1 != null) {
            System.out.print(currentNode1.data + "\t");
            currentNode1 = currentNode1.next;
        }
    }


    public static void main(String[] args) {

        LinkedListDef ll = new LinkedListDef();
        ll.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        third.next = null;

        ll.head.next = second;
        second.next = third;
        ll.printList();
        System.out.println();
        ll.insertNodeAtPos(4, 2);
        System.out.println("=====After Insertion===");
        ll.printList();
        System.out.println();
        ll.searchNode(10);
        ll.searchNode(4);
        ll.deleteNode(3);
        System.out.println("==After deletion=======");
        ll.printList();

    }

}
