/*   Author: Sampath Medarametla
 *   This program will illustrate the basic opertations of the LinkedList
 */

class LinkedListDef {

    //Head Definition of the LinkedList
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int dataIns) {
            data = dataIns;
            next = null;
        }
    }


    // This function will push the Node into start of the linkedlist
    public void pushNode(int nodeData) {
        //when ever you call up this operation this will insert the new node at the very begining of th linkedlist
        // Fore.g. if you call pushNode(20) for a list of 1->2->3->4 new list would be 20->1->2->3->4
        // Time Complexity O(1)
        Node newNode = new Node(nodeData);
        newNode.next = head;
        printNode(newNode);
    }

    // This node will delete the Node at the start of the LinkedList
    public void popNode() {
        //when ever you call up this operation this will delete the head node of the linkedlist
        // For e.g. if you call popNode(20) for a list of 1->2->3->4 new list would be 2->3->4
        // Time Complexity O(1)

        head = head.next;
        printNode(head);

    }

    public void insertNode() {
    }

    public void deleteNode() {
    }


    public void printNode(Node Head){
        Node headRef = Head;
        while(headRef!= null){
            System.out.print(headRef.data +" ");
            headRef = headRef.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {

        LinkedListDef lld = new LinkedListDef();

        //create nodes
        lld.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node four = new Node(4);

        // Create the links


        lld.head.next = second;
        second.next = third;
        third.next = four;
        four.next = null; // Endnodes will always be pointed to null

        // push a node
        lld.pushNode(20);
        lld.popNode();

    }
}