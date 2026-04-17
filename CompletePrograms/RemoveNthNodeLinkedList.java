
class ListNode{

    int val;
    ListNode next;

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}



public class RemoveNthNodeLinkedList {

    public static ListNode removeList(ListNode head, int n){

        ListNode fast = head;
        ListNode slow = head;

        for(int i=0;i<n;i++){

            fast = fast.next;
        }
        if(fast == null){
           return  head = head.next;
        }

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return  head;
    }

    public static void printList(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        
        ListNode head = new ListNode(1, null);
         head.next = new ListNode(3, null);
         head.next.next = new ListNode(4, null);
         head.next.next.next = new ListNode(5, null);
         head.next.next.next.next = new ListNode(6, null);

         head = removeList(head, 3);
         printList(head);


    }
    
}
