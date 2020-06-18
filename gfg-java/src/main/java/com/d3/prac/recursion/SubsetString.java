package com.d3.prac.recursion;

import java.util.ArrayList;

public class SubsetString {

    static ArrayList<String> powerSet(String s)
    {
        ArrayList<String> list = new ArrayList<>();
        powerSetHelper(s, "", 0, list);
        return list;
    }

    static void powerSetHelper(String s, String curr, int index, ArrayList<String> list) {
        if(index == s.length()) {
            list.add(curr);
            System.out.println(curr+" ");
            return;
        }
        powerSetHelper(s, curr, index+1, list);
        powerSetHelper(s, curr + s.charAt(index), index+1, list);
    }

    public static void main(String[] args) {

        System.out.println(powerSet("abc"));

        String[]  str = new String[10];
        str[5].charAt(1);

    }
}
