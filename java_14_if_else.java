import java.util.Scanner;

public class java_14_if_else {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("To know you can drive or not, you have to: \n enter your age");

        //if-else statements
        int age = a.nextInt();
        if(age>18) {
            System.out.println("yes, you can drive");
        }
        else {
            System.out.println("you can't drive");
        }
    }
}