package com.kevinmichie;

public class Node {

    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value <= data) {
            if (left == null) { // if nothing is there
                left = new Node(value); // insert this value from constructor
            } else {
                left.insert(value);
            }
        }   else {
            if (right == null) {
                right = new Node(value);
            } else {
                right.insert(value);
            }
        }
    }

    public boolean contains(int value) {
        if (value == data) {
            return true;
        } else if (value < data) {
            if (left == null) {
                return false;
            } else {
                return left.contains(value);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.contains(value);
            }
        }
    }


    public void printInOrderOfTraversal() {
        if (left != null) {
            left.printInOrderOfTraversal();
        }
        System.out.println(data);
        if (right != null) {
            right.printInOrderOfTraversal();
        }
    }

    boolean checkBST(Node root) {
        return check(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    boolean check(Node n, int min, int max){
        if(n==null)
            return true;
        if(n.data <= min || n.data >= max)
            return false;
        return check(n.left, min, n.data)
                && check(n.right, n.data, max);
    }



    public static void main(String[] args) {
	// write your code here
    }


}
