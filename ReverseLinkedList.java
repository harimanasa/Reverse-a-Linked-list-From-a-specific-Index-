public class ReverseLinkedList {

    public static class Node{
        int value;
        Node next;
        Node(int value){this.value = value;}
    }

    public static Node buildList(){
        Node head = new Node(0);
        Node temp = head;
        for(int i=1; i<10; i++){
            temp.next = new Node(i*10);
            temp = temp.next;
        }
        return head;
    }

    public static void printList(Node head){
        while(head!=null){
            System.out.print(head.value + "->");
            head = head.next;
        }
        System.out.println();
    }

    public static Node reverseList(Node head){
        Node p1 = null;
        Node p2 = head;

        while(p2 !=null){
            Node p3 = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = p3;
        }
        return p1;
    }

    public static Node reverseHelper(Node head){
        Node p1 = null;
        Node p2 = head;

        while(p2 != null){
            Node p3 = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = p3;
        }
        return p1;
    }

    public static Node reverseListIndx(Node head, int indx){
        Node realHead = head;
        while(indx>0){head = head.next; indx--;}
        Node headPrevJoin = head;
        Node Reversed = reverseHelper(head.next);
        System.out.println("Temp head is : "+ head.value);
        System.out.println("Temp head is : "+ Reversed.value);
        head.next = Reversed;
        return realHead;
    }

    public static void main(String[] args){
        Node head = buildList();
        printList(head);
        head = reverseList(head);
        printList(head);
        head = reverseListIndx(head, 4);
        printList(head);

    }
}

