package bst;
import org.w3c.dom.Node;

public class BST {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public Node root;
    public BST(){
        root = null;
    }

    //insert method to insert elements
    public void insert(int data){

        Node newNode = new Node(data);

        //check whether tree is empty
        if(root==null){
            root=newNode;
            return;
        }
        else{

            // current will hold the root 
            Node current = root;
            Node parent = null;

            while(true){

                //parent keep track of the parent node of the current node
                parent = current;

                //if data is less than current inserted to the left subtree
                if(data<current.data){
                    current= current.left;
                    if(current==null){
                        parent.left=newNode;
                        return;
                    }
                }
                //if data is greater than current then inserted to the right
                else{
                    current= current.right;
                    if(current==null){
                        parent.right=newNode;
                        return;
                    }
                }
            }
        }
    }
    // inorder method to print the content of the tree
    public void inorder(Node node){

        //check if tree is empty
        if(root == null){
            System.out.println("Tree is empty");
            return;
        }
        else{
            if(node.left!=null)
                inorder(node.left);
            System.out.println(node.data+" ");
            if(node.right!=null)
                inorder(node.right);
        }
    }
    public static void main(String[] args) {
        BST bt = new BST();
        bt.insert(50);
        bt.insert(40);
        bt.inorder(bt.root);
    }
    
}

