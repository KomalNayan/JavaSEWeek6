package com.komalnayangalla_c0779428_week6;

import java.util.*;

public class Sample {
    public static void main(String[] args) {
        //System.out.println("Hello World");
        Student s1 = new Student(1);
        s1.setFirstName("Komal Nayan");
        s1.setLastName("Galla");
        s1.setCity("Vijayawada");
        s1.setAddress("Kamayyathopu");
        s1.setBirthDate(new Date("01/12/1998"));
        s1.setCellPhone("+91 9885188271");
        s1.setEmail("komalnayan47@gmail.com");
        s1.setGender(Gender.MALE);
        s1.setDepartment("CSAT");
        float [] marks = {89,90,91,92,93};
        s1.setMarks(marks);
        s1.setPinCode("520007");
        s1.calculateTotalMarks();
        s1.calculatePercentage();
        s1.calculateGrade();
        System.out.println("Student ID : "+s1.getStudentId());
        System.out.println("Full Name : "+s1.getFullName());
        System.out.println("Department : "+s1.getDepartment());
        System.out.println("Date of Birth  : "+s1.getBirthDate());
        System.out.println("Gender : "+s1.getGender());
        System.out.println("Address : "+s1.getAddress());
        System.out.println("City : "+s1.getCity());
        System.out.println("Email : "+s1.getEmail());
        System.out.println("CellPhone : "+s1.getCellPhone());
        System.out.println("Total Marks : "+s1.getTotalMarks());
        System.out.println("Average : "+s1.getPercentage());
        System.out.println("Grade : "+s1.getGrade());

    }
}
