//https://www.hackerrank.com/challenges/ctci-is-binary-search-tree
/*
The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/

  /* This will be solved using inorder traversal in O(N) time and constant space.
  I have a variable called previous that keeps track of the last node visited
  which is compared to the current node, if previous is bigger than the current
  node, we have a problem (not BST), so we return false. */
    Node previous = null;

    boolean checkBST(Node root) {

        //left root right
        if(root == null){ return true; }

        if(!checkBST(root.left)){ return false;} //going left.....

        if(previous != null && root.data <= previous.data){ return false; } //root...
        previous = root;

        return checkBST(root.right); //going right....
    }
