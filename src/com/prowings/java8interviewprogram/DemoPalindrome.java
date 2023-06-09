package com.prowings.java8interviewprogram;
interface CheckPalindrome{
     boolean isPalindrome(String str);
}
public class DemoPalindrome {
    public static void main(String[] args) {
        String input="rar";
        CheckPalindrome c=str->{
            String  reversed=new StringBuilder(str).reverse().toString();
            return str.equals(reversed);
        };
        boolean isPalindrome=c.isPalindrome(input);
        System.out.println(input + " is a palindrome?  " +isPalindrome);
    }
}