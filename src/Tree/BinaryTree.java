package Tree;
public class BinaryTree
{
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    Node root;
    public void add(int val)
    {
        root=Insert_rec(root,val);
    }
    public void delete(int val)
    {
        root=delete_rec(root,val);
    }
    public void print_root()
    {
        System.out.println("THE ROOOT IS : "+root.data);
    }
    public Node Insert_rec(Node root,int val)
    {
        if(root==null)
        {
            root=new Node(val);
        }
        else if(val< root.data)
        {
            root.left=Insert_rec(root.left,val);
        }
        else {
            root.right=Insert_rec(root.right,val);
        }
        return root;
    }

    public void display(int No_type_Order)
    {
        if(No_type_Order==1)
            inorder(root);
        if(No_type_Order==2)
            preorder(root);
        if(No_type_Order==3)
            postorder(root);
    }
    private Node delete_rec(Node root, int val) {
        if(root==null)
            return null;
        else if(val< root.data)
            root.left=delete_rec(root.left,val);
        else if(val>root.data)
            root.right=delete_rec(root.right,val);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.data = MinValue(root.right);
            root.right = delete_rec(root.right, root.data);
        }
        return root;
    }
    public int MinValue(Node root)
    {
        int min=root.data;
        while (root.left != null) {
            root = root.left;
            min = root.data;
        }
        return min;
    }
    private void postorder(Node root) {
        if(root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+"-> ");
    }
    private void preorder(Node root) {
        if(root==null)
            return;
        System.out.print(root.data+"-> ");
        preorder(root.left);
        preorder(root.right);
    }
    private void inorder(Node root) {
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data+"-> ");
        inorder(root.right);
    }
}
