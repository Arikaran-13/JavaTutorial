package basics;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
         DoubleyLinkedList<Integer> dlist = new DoubleyLinkedList<>();
         dlist.insertAtBegin(2);
         dlist.insertAtBegin(3);
        dlist.insertAtBegin(4);
        dlist.insertAtBegin(5);
       dlist.insertAtpos(2,10);
         dlist.displayList();
         dlist.displayListRev();
    }
}
class DoubleyLinkedList<T> {



    class Node{
        T data;
        Node prev;
        Node next;
        Node(T data){
            prev=null;
            next=null;
            this.data=data;
        }
    }
    Node head ,tail;
    DoubleyLinkedList(){
        head=null;
        tail=null;
    }

    public void insertAtBegin(T data){
        Node newnode = new Node(data);
        if(head==null){


            tail=newnode;
            newnode.next=head;
        }
        else{
            head.prev = newnode;
            newnode.next=head;

        }
        head=newnode;
    }
    public void displayList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public void displayListRev(){
        Node temp=tail;
        while(temp!=null){
            System.out.print(" "+temp.data+" ");
            temp=temp.prev;
        }
    }
    public void insertAtpos(int pos,T val){
        if(pos==0){
            insertAtBegin(val);
        }
        else{
            Node newnode = new Node(val);
            Node temp=head;
            for(int i=1;i<pos;i++){
                temp=temp.next;
                if(temp==null){
                    throw new IndexOutOfBoundsException("Index out of bounds");
                }
            }
            newnode.next=temp.next;
            newnode.prev=temp;
            if(temp==tail){
                tail=newnode;
            }
            else {
                temp.next.prev = newnode;
                temp.next = newnode;
            }


        }

    }
}