import java.util.*;
import java.io.*;

class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Solution {
    public static int getHeight(Node root) {

        if (root == null) return -1;
        else {
            int left = getHeight(root.left);
            int right = getHeight(root.right);
            if (left > right) {
                return (left + 1);
            } else {
                return (right + 1);
            }

        }
    }

    public static void print(Node root,int level){
        if(root==null) return;
        else{
            if(level==0) System.out.print(root.data+" ");
            else{
                print(root.left,level-1);
                print(root.right,level-1);
            }
        }

    }

    static void levelOrder(Node root) {
        //Write your code here
        int level=getHeight(root);
       int n=-1;
       while(n<=level){
           n++;
           print(root,n);
       }


    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}
