package LinkedList;

public class LL {

    //train ka dabba
    Node head;
    private int size;

    public LL(){
        this.size = 0;
    }

    //Contain a Node class
    static class Node{
        int val;
        Node next;

        //default const
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }



    //add first
    public void addFirst(int val){
        Node newNode = new Node(val);

        //check
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        //updated head as new head
        head = newNode;
        size++;

    }

    //add last
    public void addLast(int val){
        Node newNode = new Node(val);

        if(head == null){
            //directly update head with newNode
            head = newNode;
            return;
        }

        //if head is not null
        Node currentNode = head;   // Start from head

        while(currentNode.next != null){
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
        size++;
    }


    //delFirst
    public void delFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        //making head of LL to ref point collapse >> java garbage collection handel it
        head = head.next;
        size--;
    }

    //delLast
    public void deleteLast(){

        if(head == null){
            System.out.println("List is empty");
            return;
        }

        // only one node
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while(lastNode.next != null){
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }

        secondLast.next = null;
        size--;
    }

    //Traverse on linkedList
    public void printLL(){
        Node currentNode = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        while(currentNode != null){
            System.out.print(currentNode.val + " ");
            //update currentNode with next reference
            currentNode = currentNode.next;
        }

    }



    public static void main(String[] args) {
        LL list1 = new LL();
        list1.addFirst(10);
        list1.addFirst(20);
        list1.addFirst(30);
        list1.addLast(40);
        System.out.println(list1.size);

        list1.delFirst();
        list1.printLL();

    }
}
