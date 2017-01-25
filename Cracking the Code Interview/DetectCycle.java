//https://www.hackerrank.com/challenges/ctci-linked-list-cycle
/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as:
    class Node {
        int data;
        Node next;
    }
*/


boolean hasCycle(Node head) {
    HashSet<Node> visited = new HashSet<Node>(); //holds the list of visited nodes

    Node cur = head; //starting at the head of the list

    while(cur!=null){

        if(visited.contains(cur.next)){  return true; } //detected a cycle! return true

        visited.add(cur); //no cycle found yet, mark current node as visited
        cur = cur.next;

    }

    return false; //no cycle found, return false
}
