//https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    //implements a queue using two stacks
    public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();

        //adds new value to stack
        public void enqueue(T value) { // Push onto newest stack
            stackNewestOnTop.push(value);
        }

        //takes a preview at oldest value stack
        public T peek() {
             inverse();
            return stackOldestOnTop.peek();
        }

        //removes oldest value in stack
        public T dequeue() {
            inverse();
            return stackOldestOnTop.pop();
        }

        ///helper method that takes the first stack, and flips it backwards to second stack, aka queue
        private void inverse(){
             if(stackOldestOnTop.isEmpty()){
                 while(!stackNewestOnTop.isEmpty()){
                     stackOldestOnTop.push(stackNewestOnTop.pop());
                 }
             }
        }
    }

    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}
