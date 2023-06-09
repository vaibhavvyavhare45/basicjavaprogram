package com.prowings.stringinterviewprogram;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s = "vaibhav";
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int count = 0;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                }
            }
            if (count < 1)
                System.out.print(ch[i]);

        }

        /*other way*/
        String removeDuplicate="";
        for(int i=0;i<ch.length;i++){
            boolean duplicate=false;
            for(int j=0;j< i;j++){
                if(ch[i]==ch[j]){
                    duplicate=true;
                    break;
                }
            }
            if(!duplicate)
                removeDuplicate+=ch[i];
        }
        System.out.println(removeDuplicate);
    }
}
