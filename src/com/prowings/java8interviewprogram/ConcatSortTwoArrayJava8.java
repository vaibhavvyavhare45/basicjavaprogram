package com.prowings.java8interviewprogram;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConcatSortTwoArrayJava8 {
    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[]={0,3,5,8,9};
        int[] c = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(c));
    }
}
