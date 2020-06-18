package com.d3.prac.recursion;

public class TailRecursion {

    void print(int n, int k) {
        if (n < 1) {
            return;
        }
        System.out.println(k);
        print(n-1, k+1);
    }

    public static void main(String[] args) {
        TailRecursion tr = new TailRecursion();
        tr.print(5, 1);
        Math.log10(5);
    }

}
