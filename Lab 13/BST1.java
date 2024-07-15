
public class BST1{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }

    public static Node insert(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        if(root.data > data){
            root.left = insert(root.left, data);
        }
        else{
            root.right = insert(root.right, data);
        }
        return root;    
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void preOrder(Node root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        } else {
            System.out.print(root.data + " ");
            if (root.left != null)
                preOrder(root.left);
            if (root.right != null)
                preOrder(root.right);
        }
    }
 
    public static void postOrder(Node root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        } else {
            if (root.left != null)
                inOrder(root.left);
            if (root.right != null)
                inOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static Node delete(Node root, int val){
        if(root.data > val){
            root.left = delete(root.left, val);
        }
        else if(root.data < val){
            root.right = delete(root.right, val);
        }
        else{
            if(root.left==null && root.right==null){
                return null;
            }
            else if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right=delete(root.right, IS.data);
        }
        return root;
    }
    
    public static Node inorderSuccessor(Node root){
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }


    public static void main(String[] args){
        int data[]={1,4,3,5,6,2,4};
        Node root = null;

        for(int i=0; i<data.length; i++){
            root = insert(root, data[i]);
        }
        delete(root, 6);
        System.out.print("In-Order:"); 
        inOrder(root);
        System.out.println();
        System.out.print("pre-Order:");
        preOrder(root);
        System.out.println();
        System.out.print("post-Order:");
        postOrder(root);
        System.out.println();
        //insert(root,8);
        // insert(null, 6);
        // insert(null, 4); 
    }
}