package List;
import java.util.Stack;
public class LinkedList {
    private static Node head;
    private static Node tail;
    private static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    public static void add(int elem)
    {
        if(head==null)
        {
            head=new Node(elem);
            tail=head;
        }
        else{
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=new Node(elem);
            tail=temp.next;
        }
    }
    public static void delete(int d) {
        if (head == null) {
            throw new IllegalArgumentException("List is empty.");
        }
        if (head.data == d) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != d) {
            temp = temp.next;
        }
        if (temp.next == null) {
            throw new IllegalArgumentException("Element not found in the list.");
        }
        temp.next = temp.next.next;
        if (temp.next == null) {
            tail = temp;
        }
    }
    public static void insertAt(int d, int elem) {
        if (head == null) {
            add(elem);
        }
        Node newNode = new Node(elem);
        Node temp = head;
        while (temp != null && temp.data != d) {
            temp = temp.next;
        }
        if (temp == null) {
            throw new IllegalArgumentException("Element " + d + " not found in the list.");
        }
        newNode.next = temp.next;
        temp.next = newNode;
        if (newNode.next == null) {
            tail = newNode;
        }
    }
    public void reverse()
    {
        System.out.println("Reverse of LinkedList :");
        Node temp=head;
        Stack<Integer>stack=new Stack<>();
        while(temp!=null)
        {
            stack.add(temp.data);
            temp=temp.next;
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+"-> ");
        }
        System.out.print("END OF LIST");
        System.out.println();
    }
    public void display() {
        System.out.println("Original List :");
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"--> ");
            temp=temp.next;
        }
        System.out.print("END OF LIST");
    }
}

