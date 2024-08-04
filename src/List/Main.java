package List;

public class Main {
    public static void main(String[]args)
    {
//        LinkedList LL=new LinkedList();
//        LL.add(10);
//        LL.add(20);
//        LL.add(30);
//        LL.add(40);
//        LL.add(50);
//        LL.insertAt(40,45);
//        LL.delete(30);
//        LL.reverse();
//        LL.display();


//        Doubly Linked List
        DLL Double =new DLL();
        DLL.add_end(7);
        DLL.add_end(8);
        DLL.add_after(7,23);
        DLL.add_after(23,12);
        DLL.display();
        DLL.delete(8);
        System.out.println("---- AFTER DELETING ELEMENT --- ");
        DLL.display();
        DLL.reverse();
    }
}
