package com.company;
import java.util.Scanner; // to import scanner class

public class java_05_takingInputs {
    public static void main (String[] args) {
        System.out.println("Taking input from user!");  //'sout' is the shortcut key for 'System.out.println();'
        Scanner sc = new Scanner(System.in); //System.in always reads data from KEYBOARD

        System.out.println("enter integer number1");
        int a = sc.nextInt(); //read integer from keyboard

        System.out.println("Enter integer number2");
        int b = sc.nextInt();

        int sum = 0;
        sum = a + b;

        System.out.println("Enter floating number1");
        float c = sc.nextFloat(); //read floating value from keyboard

        System.out.println("Enter floating number2");
        float d = sc.nextFloat();
        float sumf = 0;
        sumf = c + d;

        System.out.println("the integer sum is " + sum); //'+ sum' is to print a value of a variable in the same line
        System.out.println("the float sum is " + sumf);

        System.out.println("to check the validity if the entered number is integer or not >> enter a number!");
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        System.out.println("string input!");
        String str = sc.next(); // 'next' doesnot take whitespaces
        System.out.println(str);
        String st = sc.nextLine(); // 'nextLine'  take whitespaces
        System.out.println(st);

//        int num1 = 0b101; //binary
//        int num2 = 0x1011; //hex
//        double num3 = 12e10; //large
//        char cha = 'a'; //char
    }
}
