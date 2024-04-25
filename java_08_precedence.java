package com.company;
public class java_08_precedence {
    public static void main(String[] args) {
        int a = 6*5-34/2; //...... BODMAS doesnot always apply on java
        /*  since, * and / has same precedence
            >> Highest precedence goes to * and /. They are
            then evaluated of left to right associavity.
            =30-17
            =13
         */
        System.out.println(a);
        //Precedence and associativity
        int b = 60/5 - 34*2;
        /*  Here, associativity comes in play
            = 12 - 34*2
            = 12 - 68
            = -56
        */
        System.out.println(b);

        // .... QUICK QUIZ .....
        int x=6;
        int y=1;
        int k = x*y/2;
        System.out.println("expression 1 " +k);

        int aa=5;
        int bb=1;
        int cc=4;
        int l = b*b - (4*aa*cc)/(2*aa);
        System.out.println("expression 2 " +l);

    }
}
