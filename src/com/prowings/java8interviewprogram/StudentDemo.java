package com.prowings.java8interviewprogram;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> li1 = new ArrayList<>();
        li1.add(new Student(1001, "vaibhav", "CSE", "male", 50000));
        li1.add(new Student(1002, "marish", "CIVIL", "male", 60000));
        li1.add(new Student(1003, "pranav", "Mechanical", "male", 70000));
        li1.add(new Student(1004, "vishwajit", "Mechanical", "male", 65000));
        li1.add(new Student(1005, "sonali", "CSE", "female", 45000));
        li1.add(new Student(1006, "monali", "IT", "female", 46000));
        li1.add(new Student(1007, "karishma", "Electronic", "female", 63000));
        li1.add(new Student(1008, "kasturi", "Electrical", "female", 35000));

        System.out.println(li1);


        double avgfees = li1.stream().mapToDouble(Student::getFees).average().orElse(0.0);
        System.out.println(avgfees);

        Map<String, Double> avgByFMSalary = li1.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingDouble(Student::getFees)));
        System.out.println(avgByFMSalary);
        //adding 1000 to each salary
        li1.forEach(s -> s.setFees(s.getFees() + 1000));
        System.out.println(li1);
        //find maximum fees and minimum fees
        Optional<Student> maxFees = li1.stream().max(Comparator.comparingDouble(Student::getFees));
        System.out.println(maxFees);
        Optional<Student> minFees = li1.stream().min(Comparator.comparingDouble(Student::getFees));
        System.out.println(minFees);

        //
        Comparator<Student> comparator = Comparator.comparing(Student::getName);
        Set<Student> sortByName = li1.stream().sorted(comparator).collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(sortByName);

        li1.forEach(s -> System.out.println(s.getName() + " " + s.getFees()));
        System.out.println(li1);

        double sumOfSal = li1.stream().mapToDouble(Student::getFees).sum();
        System.out.println(sumOfSal);

        Comparator<Student> comparator1 = Comparator.comparingDouble(Student::getFees).reversed();
        List<Student> descStudentByFees = li1.stream().sorted(comparator1).collect(Collectors.toList());
        System.out.println(descStudentByFees);

    }
}
