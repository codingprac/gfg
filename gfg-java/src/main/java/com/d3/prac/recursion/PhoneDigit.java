package com.d3.prac.recursion;

/**
 * Given a Keypad like in phone. Generate all possible words by pressing the numbers.
 *
 * E.g. :-
 * i/p:- 2, 3, 4
 * o/p:- adg adh adi aeg aeh aei afg afh afi bdg bdh bdi beg beh bei bfg bfh bfi cdg cdh cdi ceg ceh cei cfg cfh cfi
 */

public class PhoneDigit {

    static String[] table = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    String json = "{\"data\": \"Hello World\"}";

    static void possibleWords(int a[], int N)
    {
        char[] output = new char[N+1];
        printWords(a, 0, output, N);
    }

    static void printWords(int[] a, int curr_digit, char[] output, int N) {

        if(curr_digit == N) {
            System.out.println(String.valueOf(output) + " ");
            return;
        }

        for(int i = 0; i < table[a[curr_digit]].length(); i++) {

            output[curr_digit] = table[a[curr_digit]].charAt(i);
            printWords(a, curr_digit + 1, output, N);
            if(a[curr_digit] == 0 || a[curr_digit] == 1) {
                return;
            }
        }
    }

}
