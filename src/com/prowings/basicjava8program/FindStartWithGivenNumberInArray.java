package com.prowings.basicjava8program;

import java.util.Arrays;
import java.util.List;

public class FindStartWithGivenNumberInArray {
    public static void main(String[] args) {
        int a[] = {100, 101, 526, 741, 410, 821, 105};
        int digit=1;
        Arrays.stream(a).filter(s -> String.valueOf(s).startsWith(String.valueOf(digit)))
                .forEach(System.out::println);

    }
}
