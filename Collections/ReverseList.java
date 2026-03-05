class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class ReverseList {

    public static Node reverse(Node head){

        Node prev = null;
        Node current = head;

        while(current != null){

            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }

        return prev;
    }

    public static void printList(Node head){

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = reverse(head);

        printList(head);
    }
}