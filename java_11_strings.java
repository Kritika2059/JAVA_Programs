import java.util.Scanner;
public class java_11_strings {
    public static void main(String[] args) {
        String myName;
        myName = new String("kriti"); //since, in java String is actually a class
        String Name =  "kritika";     // but can also be used as datatype
        System.out.println(myName);
        System.out.println(Name);

        //other methods to print in java
        int a = 6;
        float b=5.645957f;
        float c =6.362157f;

        System.out.printf("value of a is %d and b is %f",a,b); //same as in C language ( f in printf stands for format specifier)
        System.out.println(); //automatically prints new line at the end
        System.out.print("hi");
        System.out.format("value of a is %d and b is %f",a,b); //same as printf
        System.out.println();
        System.out.printf("value of c(0.2) is %.2f and b(10.4) is %10.4f",c,b);//only %.2f works %0.2f doesnot works
        System.out.println();
        System.out.println("enter any string");
        Scanner sc = new Scanner(System.in);
        String st = sc.next(); //doesnot takes whitespaces
        System.out.println(st);
        String st1 = sc.nextLine(); //takes whitespaces
        System.out.println(st1);

    }
}
