package com.ramnath.hackerranktests;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ShiftLaftArray {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        
         for (int l = 0; l < k; l++) {
            for (int i = 0; i < a.length - 1; i++) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
        {
            System.out.print(output[i] + " ");
       }
        System.out.println();
      
    }
}
