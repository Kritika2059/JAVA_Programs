package com.company;

import java.util.Scanner;

public class java_06_practiceQuestion1 {
    public static void main (String[] args)
    {
        Scanner  m = new Scanner(System.in);

        System.out.println("Enter maeks of subject 1");
        int a = m.nextInt();
        System.out.println("Enter maeks of subject 2");
        int b = m.nextInt();
        System.out.println("Enter maeks of subject 3");
        int c = m.nextInt();
        System.out.println("Enter maeks of subject 4");
        int e = m.nextInt();
        System.out.println("Enter maeks of subject 5");
        int f = m.nextInt();
        int per = (a + b+ c+ e+ f) / 5;
        System.out.println("the percentage is : " + per);
    }
}
