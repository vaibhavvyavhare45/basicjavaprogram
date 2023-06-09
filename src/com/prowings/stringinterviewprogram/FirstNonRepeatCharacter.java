package com.prowings.stringinterviewprogram;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatCharacter {
    public static void main(String[] args) {
        String s = "vaibhav";
        for (int i = 0; i < s.length(); i++) {
            boolean uniqueChar = true;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    uniqueChar = false;
                    break;
                }
            }

            if (uniqueChar) {
                System.out.println(s.charAt(i));
                break;
            }
        }

        // second way for non-repeated character
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);
        for (Map.Entry<Character,Integer> entrySet:map.entrySet()) {
            if (entrySet.getValue()==1){
                System.out.println(entrySet.getKey());
                break;
            }
            
        }
        
    }

}
