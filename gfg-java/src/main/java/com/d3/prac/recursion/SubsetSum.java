package com.d3.prac.recursion;

import java.util.stream.IntStream;

public class SubsetSum {

    int countSubsets(int arr[], int n, int sum) {
        if(n==0) {
            return (sum==0) ? 1 : 0;
        }
        return countSubsets(arr, n-1, sum) + countSubsets(arr, n-1, sum - arr[n-1]);
    }

    // my fuddu implementation
    /*int findCount(int sum, int[] emptyArr, int[] tempArr, int[] arr, int count, int index) {
        if (sum == 0) {
            return count++; // if there are +ve & -ve nos present than we can get a subset which is 0. Need to handle
        }
        if (index == arr.length) {
            return count;
        }
        if (sum == add(arr)) {
            return count++;
        }
        tempArr[tempArr.length] = arr[index];
        return findCount(sum, emptyArr, tempArr, arr, count, index + 1)
                + findCount(sum, emptyArr, tempArr, arr, count, index + 1);
        // how to start with an empty arr
    }

    private int add(int[] arr) {
        return IntStream.range(0, arr.length).sum();
    }*/

    public static void main(String[] args) {
        SubsetSum ss = new SubsetSum();
        int[] arr = {10, 20, 15};
        //int count = ss.findCount(25, new int[1], new int[arr.length], arr, 0, 0);
        int count  = ss.countSubsets(arr, arr.length, 25);
        System.out.println("count = " + count);
    }
}
