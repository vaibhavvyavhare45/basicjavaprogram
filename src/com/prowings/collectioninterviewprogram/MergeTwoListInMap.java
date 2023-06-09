package com.prowings.collectioninterviewprogram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MergeTwoListInMap {

    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(10);
        li.add(20);
        li.add(5);
        List<String> li2 = new ArrayList<>();
        li2.add("vaibhav");
        li2.add("marish");
        li2.add("pranav");
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < li.size(); i++) {
            map.put(li.get(i), li2.get(i));
        }
        System.out.println(map);

    }
}
