package com.prowings.java8interviewprogram;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class LocalDateforNextDayDate {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        System.out.println(today);
        LocalDate nextModay=today.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println(nextModay);
    }

}
