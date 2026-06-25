package LinkedList.S1;



public class LL1 {
    static class Node{
        int data;
        Node next;

        Node(int val){
            this.data = val;
            this.next = null;
        }
    }
    static Node addAtHead(int data, Node head){
        Node newNode = new Node(data);
        if(head !=null){
            head = newNode;
            return head;
        }
        newNode.next  = head;
        head = newNode;
        return head;
    }
    static Node addAtTail(int data,Node head){
        Node newNode = new Node(data);
        if(head ==null){
            head = newNode;
            return head;
        }
        Node temp = head;
        while (temp.next!=null) {
            temp = temp.next;
        }
        temp.next =  newNode;
        return head;
    }

    static Node addAtPosition(int data, int position,Node head){
        Node newNode = new Node(data);
        if(head == null || position == 1 ){
            head =  newNode;
        }
        Node temp = head;
        for(int i=0;i<=position;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }


    static Node deleteAtHead(Node head){
        if(head == null){
            return head;
        }
        head = head.next;
        return head;
    }
    // static Node deleteAtTail(Node head){
    //     if(head == null){
    //         return head;
    //     }
        

    // }

    static Node dltWithData(int key, Node head){
        if(head == null){
            return head;
        }
        if(head.data == key){
            return deleteAtHead(head);
        }
        Node temp = head;
        return head;
    }

    static Node dltWithNthPosition(Node head,int pos){
        if (head==null) {
            return head;
        }
        if(pos == 1){
            return deleteAtHead(head);
        }
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null)
        return head;
        temp.next = temp.next.next;
        return head;
    }

    static Node updateNode(Node head,int key, int newData){
        if(head == null){
            return head;
        }
        Node temp = head;
        while (temp!=null && temp.data != key) {
            temp = temp.next;
        }
        if(temp!=null){
            temp.data = newData;
        }
        return head;
    }

    static int linearSearch(Node head, int key){
        int pos=-1;
        if (head == null) {
            return pos;
        }
        Node temp = head;
        while (temp!=null) {
            if (temp.data == key) {
                return pos;
            }
            pos++;
            temp = temp.next;
        }
        if (temp == null) {
            return -1;
        }
        return pos;
    }
    public static void main(String[] args) {
        
    }
}


