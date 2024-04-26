import java.util.Locale;
import java.util.Scanner;

public class java_12_stringMethods {
    public static void main(String[] args){
        String name = "Kritika";
        System.out.println(name);

        int value = name.length();
        System.out.printf("length of name is: %d",value);
        System.out.println();

        String lcase = name.toLowerCase();
        System.out.printf("lowercase of name is: %s",lcase);
        System.out.println();

        String ucase = name.toUpperCase();
        System.out.printf("uppercase of name is: %s",ucase);
        System.out.println();

        String nontrim = "    krizTrim    ";
        System.out.println(nontrim);
        System.out.println(nontrim.trim()); // removes umwanted whitespaces from the string

        System.out.println(name.substring(3)); //prints rest of the string after given position (3) i.e. string after 3rd position is tika

        System.out.println(name.substring(3,6)); //start and end position is given as (3,6) i.e tik (3 exclude, 6 include)

        System.out.println(name.replace('K','r')); // replace old char to new char (capital K is occured only 1 time so r is replaced to it only
        System.out.println(name.replace('i','e')); // small i is occured twice so e is replaced at each place where i occured
        System.out.println(name.replace("it","eee")); //string at one can be replaced

        System.out.println(name.startsWith("Kr")); // checks if it starts with given string or not 'if yes then returns TRUE'
        System.out.println(name.endsWith("kk")); // false, doesnot ends with kk

        System.out.println(name.charAt(2)); //what is the character at index '2' (index -> position)

        System.out.println(name.indexOf("i"));  //what is the index of char"i" (K->0,r->1,i->2,t->3,...and so on) >> i started at 3

        System.out.println(name.indexOf("ik",3)); //what is index of i but start searching from 3rd index

        System.out.println(name.lastIndexOf("i")); //eg:- in Kritika it returns index of 2nd 'i' not the 1st one

        System.out.println(name.lastIndexOf("i",3)); // will search 'i' up to 4th index

        System.out.println(name.equals("kritika")); //checks/equals with orignal strings
                                                    // if "kritika" is checked with "Kritika" then returns 'FALSE' >> casesensetive
        System.out.println(name.equalsIgnoreCase("kritika")); //it ignores case and returns 'TRUE' even there is K instead of k

        System.out.println("escape sequence \"double quotes\" "); // " inside " " java confuses so use \"  tp print "  similarly \\ to pring \ similarly \' to print ' This is called Escape Sequence

        System.out.println("my name is kr\nitika"); // \n is new line
    }
}
