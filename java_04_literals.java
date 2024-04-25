package com.company;

public class java_04_literals  {
    public static void main(String[] args) {
        byte age = 34; //since, age probably cannot be more than 127 that's why we used "byte" to store age
        char ch = 'A';
        float f1 = 6.5f;
        int a = 56;
        boolean abc =true;
        String ab = "kritika";  // 'S' in String must be uppercase
        long agedino = 44444444444666L; // 'L' ,must be there in long
        double d1 = 4.55; // default type for decimals

        System.out.println(age);
        System.out.println(ch);
        System.out.println(f1);
        System.out.println(a);
        System.out.println(ab);
        System.out.println(d1);
    }
}
