package linkedlist;

import java.util.LinkedList;
import java.util.List;


public class SinglyLinkedList {
    ListNode head; //refers to first node which is null initially


    public void insert(int data) {
        ListNode node = new ListNode();  //create new node (in memory )
        node.data = data; //user passes in data into parameter and it gets assigned into node.data
        node.next = null; // by default the next object will be null

        //node itself is the head ... if its your first node then head will be null
        if (head == null) {
            head = node;
        } else {
            //having a list with multiple nodes - place where the next equals null
            ListNode n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAt(int pos, int data){
        ListNode node = new ListNode();
        node.data = data;
        node.next = null;

        if(pos == 0){
            insertAtStart(data);
        }
        ListNode n = head;
        for(int i = 0; i< pos-1; i++){
            n = n.next;
        }
        node.next = n.next;
        n.next = node;

    }

    public void insertAtStart(int data){
        ListNode node = new ListNode();
        node.data = data;
        node.next = null;

        node.next = head;
        head = node;

    }

    public void showNodes() {
        ListNode node = head;

        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public static void main(String[] args) {

        SinglyLinkedList slisty = new SinglyLinkedList();
        slisty.insert(30);
        slisty.insert(45);
        slisty.insert(60);
        slisty.insertAtStart(25);

        slisty.showNodes();

    }
}
