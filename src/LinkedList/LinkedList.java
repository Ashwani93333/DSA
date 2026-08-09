package LinkedList;

class Node{
    int data;
    Node next;

    //constructor
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList{
    private int size;
    private Node head; // First node block
    private Node tail; // Last node block

    //Default -> null
    public SinglyLinkedList(){
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public int getSize(){
        return this.size;
    }

    //Methods--------

    //display fun.
    void display(){
        Node current = head;
        if(current == null){
            System.out.println("List is empty");
            return;
        }

        while(current != null){
            System.out.print(current.data);
            if(current.next != null)
                System.out.print(" -> ");
            current = current.next;

        }
        System.out.print(" ->null ");
        System.out.println();
    }

    // push-front
    public void pushFront(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // push-back
    public void pushBack(int data){
        Node newNode = new Node(data);

        //----- if only head is there we go for this impl.--------

//        Node current = head;
//
//        if(current == null){
//            head = tail = newNode;
//            return;
//        }
//        while(current.next != null){
//            current = current.next;
//        }
//
//        current.next = newNode;

        //-----If we have tail concept then direct update it-----

        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        size++;

    }

    //Delete Node from front
    public void popFront(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        //Single Node - Safety
        if(head == tail){
            tail = head = null;
            return;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        size--;


    }
    //Delete Node from back
    public void popBack(){

        if(head == null){
            System.out.println("List is empty");
            return;
        }

        if(head == tail){
            tail = head = null; // collapse
            return;
        }

        Node temp = head;

        while(temp.next != tail){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;

    }

    //Insert at Middle of LL
    public void insertMiddle(int data, int position){

        //check points
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        // Invalid position
        if (position < 0) {
            System.out.println("Invalid Position");
            return;
        }

        if(position==0){
            pushFront(data);
            return;
        }

        //general case
        Node temp = head;

        for(int i = 0; i<position-1; i++){
            temp = temp.next;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //Search in LL
    public int search(int key){
        Node current = head;
        int index =0;

        if(head == null){
            return -1;
        }
        while (current.next != null){
            if(current.data == key){
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;

    }


    //Reverse LL
    public void reverse() {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        head = prev;
    }

}

public class LinkedList {

    public static void main(String[] args) {

        SinglyLinkedList ll = new SinglyLinkedList();
        //Before Adding any Nodes
        ll.display();
        //Adding Nodes at front
        ll.pushFront(1);
        ll.pushFront(2);
        ll.display();

        //Adding Nodes at back
        ll.pushBack(3);
        ll.pushBack(78);
        ll.pushBack(789);
        ll.display();

        //delete Node from Front
        ll.popFront();
        ll.display();
        ll.display();

        //delete Node from Back
        ll.popBack();

        //Inserting in Middle of LL
        ll.insertMiddle(56,0);

        //Searching in LL returning the Index of it....
        int ans = ll.search(3);
        System.out.println("Index" + ans);


        //reverse
        ll.reverse();

        ll.display();

        //---size---
        System.out.println("Size of LinkedList: " + ll.getSize());

    }
}
