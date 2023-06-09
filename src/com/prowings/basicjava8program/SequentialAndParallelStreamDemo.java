package com.prowings.basicjava8program;

import java.util.Arrays;
import java.util.List;

public class SequentialAndParallelStreamDemo {
    public static void main(String[] args) {
        List<Integer> li= Arrays.asList(1,2,3,4);
//        li.stream().forEach(e->{
//            System.out.println(e +" "+Thread.currentThread().getName());
//        });
        li.parallelStream().forEach(e1->{
            System.out.println(e1+" "+Thread.currentThread().getName());
        });
    }
}
