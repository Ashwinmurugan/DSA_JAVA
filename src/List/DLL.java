package List;

public class DLL {
    private static Node head;
    private static Node tail;
    private static class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data=data;
        }
    }
    public static void add_end(int elem) {
        Node newNode = new Node(elem);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public static void add_first(int elem)
    {
        Node newNode=new Node(elem);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else {
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }
    public static void add_after(int d,int elem)
    {
        if (head == null) {
            add_first(elem);
        }
        Node NewNode=new Node(elem);
        Node temp=head;
        while(temp!=null && temp.data!=d)
        {
            temp=temp.next;
        }
        NewNode.next=temp.next;
        NewNode.prev=temp;
        temp.next=NewNode;
        if (NewNode.next != null) {
            NewNode.next.prev = NewNode;
        }
        else {
            tail = NewNode;
        }
    }
    public static void delete(int elem)
    {
        Node temp=head;
        while(temp.data!=elem && temp!=null)
        {
            temp=temp.next;
        }
        if(temp.next==null)
        {
            tail=temp.prev;
            tail.next=null;
        }
        else {
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
        }
    }
    public static void reverse()
    {
        System.out.println("REVERSE OF DLL: ");
        Node temp=tail;
        while(temp!=null)
        {
            System.out.print(temp.data+"-> ");
            temp=temp.prev;
        }
        System.out.println("END OF D_List");
    }
    public static void display() {
        System.out.println("Original List :");
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"--> ");
            temp=temp.next;
        }
        System.out.print("END OF DLIST");
        System.out.println();
    }
}
