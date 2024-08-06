package Tree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.add(7);
        tree.add(10);
        tree.add(11);
        tree.add(15);
        tree.add(20);
        tree.add(30);
        tree.add(60);
        tree.add(1);
        tree.print_root();
        tree.display(1);
        System.out.println();
        tree.delete(20);
        tree.display(1);
    }
}
