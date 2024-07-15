import java.util.Scanner;

public class BST{

    static class Node{
        int data;
        Node left;
        Node right;
        int key;

        Node(int data){
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }

    // static Node rootNode;

    // public void insert(int value) {

    //     Node newNode = new Node(value);

    //     if (rootNode == null) {
    //         rootNode = newNode;
    //         return;
    //     }
    //     else {
    //         Node current = rootNode;
    //         Node parent = null;
    //         while (true) {
    //             parent = current;
    //             if (value < current.data) {
    //                 current = current.left;
    //                 if (current == null) {
    //                     parent.left = newNode;
    //                     return;
    //                 }
    //             } 
    //             else {
    //                 current = current.right;
    //                 if (current == null) {
    //                     parent.right = newNode;
    //                     return;
    //                 }
    //             }
    //         }
    //     }
    // }


    public static Node insert(Node root , int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        if(root.data > data){
            root.left = insert(root.left , data);
        }else{
            root.right= insert(root.right , data);
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
                inOrder(root.left);
            if (root.right != null)
                inOrder(root.right);
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

    public static boolean search(Node root , int key){
        if(root == null){
            return false;
        }
        if(root.data > key){
            return search(root.left , key);
        }
        else if(root.data == key){
            return true;
        }
        else{
            return search(root.right, key);
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<data.length;i++){
        int data[] = sc.nextInt();
        root = insert(root, data[i]);
        }
        // int data[]={1,4,3,5,6,2,4};
        Node root = null;

        // for(int i=0; i<data.length; i++){
        //     root = insert(root, data[i]);
        // }
        
        // insert(root, 4);
        // insert(root, 3);
        // insert(root, 4);
        // insert(4);
        // insert(3);
        // insert(6);
        delete(root, 6);
        System.out.print("In-Order  :");
        inOrder(root);
        System.out.println();
        System.out.print("Pre-Order :");
        preOrder(root);
        System.out.println();
        System.out.print("Post-Order:");
        postOrder(root);
        System.out.println();

        if(search(root, 4)){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
    }
}