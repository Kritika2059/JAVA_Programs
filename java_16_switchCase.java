import java.util.Scanner;

public class java_16_switchCase {
    public static void main(String[] args) {
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        //switch statement is used instead of if-else ladder
        //switch is used when there are multiple choices
        switch (age){
            case 18:
                System.out.println("you are eligible for voting");
                break;
            case 30:
                System.out.println("you can marry now");
                break;
            case 24:
                System.out.println("you should get a job now");
                break;
            case 60:
                System.out.println("you should get retired now");
                break;
            default:
                System.out.println("Nothing to do just enjoy your life");
        }


        System.out.println("enter your name");
        Scanner st = new Scanner(System.in);
        String se = st.next();
        //switch statement is used instead of if-else ladder
        //switch is used when there are multiple choices
        switch (se) { // by howering over the switch keyword you can:
            // enhanced switch
            case "kritika":
                System.out.println("Good Luck kitte!!");
                break;
            case "diya":
                System.out.println("Hello mots");
                break;
            case "srijan":
                System.out.println("munnu dunnu");
                break;
            case "kridip":
                System.out.println("chal bey");
                break;
            default:
                System.out.println("Sorry, I don't know you");
                break;
        }
    }
}
