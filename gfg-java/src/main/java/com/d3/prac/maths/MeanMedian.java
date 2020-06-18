package com.d3.prac.maths;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MeanMedian {

    int mean(int a[], int N) {
        Arrays.sort(a);
        int sum1 = Arrays.stream(a).sum();
        int sum = IntStream.of(a).sum();
        return sum/N;
    }

}
