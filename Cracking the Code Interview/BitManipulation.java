//https://www.hackerrank.com/challenges/ctci-lonely-integer
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    /* Bit manipulation to find unique value in array.
       Will be using the XOR operation, because it will run in linear (O(N))
       time with constant space. Now with XOR operations, we know that X ^ X = 0
       AND X ^ Y = 1. Since we know that all numbers but one in the array have
       a pair, the XOR will cancel out all the pairs (resulting in unique = 0),
       and leave us with the unique number, which when XOR'd with unique,
       will give us our answer, regardless of the ordering. */

    public static int lonelyInteger(int[] a) {
        int unique = 0;
        for(int i = 0; i < a.length; i++){
            unique ^= a[i]; //^= is XOR

        }
        return unique;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }
}
