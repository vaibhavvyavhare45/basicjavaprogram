package com.prowings.stringinterviewprogram;

public class StringGivenCharAvg {
    public static void main(String[] args) {
        String s = "A:30,B:40,C:90,A:20,C:10,B:55";
        ;
        String p[] = s.split(",");
        int sumA = 0;
        int countA = 0;
        int sumB = 0;
        int countB = 0;
        int sumC = 0;
        int countC = 0;
        for (String i : p) {
            String[] keyValue = i.split(":");
            String key = keyValue[0];
            int value = Integer.parseInt(keyValue[1]);

            if (key.equals("A")) {
                sumA += value;
                countA++;
            } else if (key.equals("B")) {
                sumB += value;
                countB++;
            } else if (key.equals("C")) {
                sumC += value;
                countC++;
            }

        }

        //calculate avg
        double avgA = sumA / countA;
        double avgB = sumB / countB;
        double avgC = sumC / countC;

        System.out.println(avgA);
        System.out.println(avgB);
        System.out.println(avgC);


    }
}
