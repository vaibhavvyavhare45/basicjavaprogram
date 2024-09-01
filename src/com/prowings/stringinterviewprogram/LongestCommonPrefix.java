package com.prowings.stringinterviewprogram;

import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of strings
        int n = sc.nextInt();
        sc.nextLine();


        String[] strArr = new String[n];

        // 9
        for (int i = 0; i < n; i++) {
            strArr[i] = sc.nextLine();
        }

        // Find and print the longest common prefix
        System.out.println(findLongestCommonPrefix(strArr));
    }

    private static String findLongestCommonPrefix(String[] strArr) {
        if (strArr == null || strArr.length == 0)
            return "";

        String prefix = strArr[0];
        for (int i = 1; i < strArr.length; i++) {
            while (strArr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
