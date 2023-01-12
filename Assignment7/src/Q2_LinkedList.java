/* Assignment 7 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (60 marks)
    Use java to implement a data structure named LinkedList, and implement several methods of the LinkedList.

 */

class Node {
    int data; // 'data' stores the value of a node.
    Node next; // 'next' refers/points to the next node

    // the construction method of class Node.
    Node(int d) {
        data = d;
        next = null;
    }
}

class Q2_LinkedList {
    Node head;

    // Insert 'new_data' at the beginning of the LinkedList
    // (5 marks)
    public void insertAtBeginning(int new_data) {
        Node newNode = new Node(new_data);
        newNode.next = head;
        head = newNode;
    }

    // Insert 'new_data' at the end of the LinkedList
    // (5 marks)
    public void insertAtEnd(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null){
            head = new_node;
        }
        else{
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = new_node;
        }
    }

    // Insert 'new_data' after a node referred to as 'prev_node'
    // (10 marks)
    public void insertAfter(Node prev_node, int new_data) {
        if (prev_node == null){
            return;
        }
        Node new_node1 = new Node(new_data);
        new_node1.next = prev_node.next;
        prev_node.next = new_node1;
    }

    // Delete a node located in 'position' of the Linked List. The first element of the LinkedList has a position=0.
    // (10 marks)
    void deleteNode(int position) {
        if (head == null){
            return;
        }
        Node temp1 = head;
        if (position == 0){
            head = temp1.next;
            return;
        }
        for (int i=0; temp1 != null && i < position-1; i++){
            temp1 = temp1.next;
        }
        if (temp1 == null || temp1.next == null){
            return;
        }
        Node temp2 = temp1.next.next;
        temp1.next = temp2;
    }

    // Search for a node containing the value of 'key' in the LinkedList.
    // If there is a node in the LinkedList whose value is equal to 'key', then return 'true'.
    // If there is no node in the LinkedList whose value is equal to 'key', then return 'false'.
    // (15 marks)
    boolean search(Node head, int key) {
        Node temp3 = head;
        while (temp3 != null){
            if (temp3.data == key){
                return true;
            }
            temp3 = temp3.next;
        }
        return false;
    }

    // Sort the nodes in the LinkedList in ascending orders of their values.
    // Requirement: please use bubble sort.
    // Example: for a LinkedList: head->3->5->1->4->2, the sorted LinkedList should be head->1->2->3->4->5.
    // (15 marks)
    void sortLinkedList(Node head) {
        if (head != null){
            Node currentNode = null;
            int status = 0;
            do {
                currentNode = head;
                status = 0;
                while (currentNode != null && currentNode.next != null){
                    if (currentNode.data > currentNode.next.data){
                        status = 1;
                        currentNode.data = currentNode.data + currentNode.next.data;
                        currentNode.next.data = currentNode.data - currentNode.next.data;
                        currentNode.data = currentNode.data - currentNode.next.data;
                    }
                    currentNode = currentNode.next;
                }
            }
            while (status == 1);
        }
    }

    // Print the linked list
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args) {
        /* TA may test different functions of the LinkedList here */
        /* The following is just an example of how to do the test. */

        Q2_LinkedList llist = new Q2_LinkedList();

        llist.insertAtEnd(1);
        llist.insertAtBeginning(2);
        llist.insertAtBeginning(3);
        llist.insertAtEnd(4);
        llist.insertAfter(llist.head.next, 5);

        System.out.println("Linked list: ");
        llist.printList();

        System.out.println("\nAfter deleting an element: ");
        llist.deleteNode(3);
        llist.printList();

        System.out.println();
        int item_to_find = 3;
        if (llist.search(llist.head, item_to_find))
            System.out.println(item_to_find + " is found");
        else
            System.out.println(item_to_find + " is not found");

        llist.sortLinkedList(llist.head);
        System.out.println("\nSorted List: ");
        llist.printList();
    }
}