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
        Node headRef = head;
        if (headRef != null) {
            newNode.next = head;
            printNode(newNode);
        } else {
            headRef = newNode;
            newNode.next = null;
            printNode(newNode);
            System.out.println(newNode.next);
        }
    }

    // This node will delete the Node at the start of the LinkedList
    public void popNode() {
        //when ever you call up this operation this will delete the head node of the linkedlist
        // For e.g. if you call popNode(1) for a list of 1->2->3->4 new list would be 2->3->4
        // Time Complexity O(1)
        Node HeadRef = head;
        Node tempNode = null;
        if (head == null) {
            System.out.println("The list is empty, Hence Deletion not Possible!!");
        } else {
            tempNode = head.next;
            HeadRef = tempNode;
            //printNode(HeadRef);
        }

    }

    public void insertNode(int dataIns, int pos) {

        Node headRef = head;
        int counter = 1;

        while (headRef != null) {
            if (counter == pos) {
                Node newNode = new Node(dataIns);
                headRef.next = newNode;
                newNode.next = headRef.next.next;
                printNode(headRef);
                return;
            }
            headRef = headRef.next;
            counter++;
        }
    }


    // This function specifically inserts the node before the node of the stated position
    public void insertNodeBefore(int insData, int pos) {
        //The complexity of the insertion is O(n)

        // Maintain the current Node and previous Node
        Node curNode = head;
        Node prevNode = null;
        Node newNode = null;
        int counter = 0;

        if (curNode == null) {
            System.out.println("Insertion is Not Possible!! the list is empty");
            return;
        }

        if (curNode.next == null || pos == 0) {
            pushNode(insData);
            return;
        }

        while (curNode != null && !(counter == pos)) {
            prevNode = curNode;
            curNode = curNode.next;
            counter++;
            System.out.println(counter);
        }

        if (curNode != null) {
            newNode = new Node(insData);
            prevNode.next = newNode;
            newNode.next = curNode;
            printNode(head);
            return;
        }

        System.out.println("Insertion is not possible !!, Found End of the list");

    }

    public void insertNodeAfter(int insData, int pos) {

        Node curNode = head;
        Node nextNode = null;
        Node newNode = null;
        int counter = 0;

        if (curNode == null) {
            System.out.println("Insertion is Not Possible!! the list is empty");
            return;
        }

        if(pos == 0){
            newNode = new Node(insData);
            curNode.next = newNode;
            newNode.next = null;
            printNode(head);
            return;
        }

        while(curNode != null && !(counter == pos)){
             curNode = curNode.next;
             if(curNode.next !=null){
                 nextNode = curNode.next;
             }else{
                 nextNode = null;
             }
             System.out.println(counter);
             counter++;
        }

        if(curNode!=null){
            newNode = new Node(insData);
            curNode.next = newNode;
            newNode.next = nextNode;
            printNode(head);
            return;
        }

        System.out.println("You code reached here , It means that the code failed to Insert the node!!");
    }

    public void deleteNode(int pos) {

        Node prevNode = null;
        Node curNode = head;
        int counter = 0;
        if(curNode == null){
          System.out.println("List Is Empty!! Delete operation not supported");
          return;
        }

        if(pos == 0){
            head = null;
            return;
        }

        while(curNode!=null && !(counter == pos)){
            prevNode = curNode;
            curNode = curNode.next;
            counter++;
        }

        if(curNode!=null){
            prevNode.next = curNode.next;
            printNode(head);
            return;
        }

        System.out.println("Position stated is incorrect!!");

    }


    public void printNode(Node Head) {
        Node headRef = Head;
        while (headRef != null) {
            System.out.print(headRef.data + " ");
            headRef = headRef.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        LinkedListDef lld = new LinkedListDef();

         lld.head = new Node(1);
         Node second = new Node(2);
         Node third = new Node(3);


         lld.head.next = second;
         second.next = third;
         third.next = null;

       /* //create nodes
        lld.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node four = new Node(4);

        // Create the links


        lld.head.next = second;
        second.next = third;
        third.next = four;
        four.next = null; // Endnodes will always be pointed to null */

        //lld.head = null;


        // push a node
        // lld.pushNode(20);
        //  lld.popNode();
        //lld.insertNodeBefore(20, 2);
        //lld.insertNodeAfter(30, 2);
        lld.deleteNode(2);


        // lld.insertNode(30,3);

    }
}