package com.company;
public class java_08_operator {
    public static void main(String[] args) {
        int a = 4;
//        int b =  6 % a; // Arithmetic Operator (Modulo)
//        4.0 % 1.1 -->  Returns Decimal Remiander
        int b = 5;
        b += 3; // b = b + 3  >>  Assignment Operator
        System.out.println(b);
        System.out.println(6==b); // true or false >> comparison operator
        System.out.println(6<=b); // true or false >> comparison operator
        System.out.println(10>5 && 10>11); // true or false (AND) logical operator
        System.out.println(10>5 || 10>7); // true or false (OR) logical operator
        System.out.println(2 & 3); // does binary calculation >> Bitwise operator
//                10
//                11
//             -------- AND
//                10   (1 AND 0 -> 0 and 1 AND 1 -> 1)
//                10 -> 2

    }
}
