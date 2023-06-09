package com.prowings.java8interviewprogram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfWordsInList {
    public static void main(String[] args) {
        String s="vaibhav";
        List<String> name= Arrays.asList(s.split(""));
       Map<String,Long>map= name.stream().filter(ch-> Collections.frequency(name,ch)>1)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
}
