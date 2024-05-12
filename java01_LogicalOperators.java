
public class java01_LogicalOperators {
    public static void main(String[] arg) {
         int x = 7;
         int y =  5;
         int a = 5;
         int b = 9;
         boolean result = x > y && a > b ; // AND
         boolean result1 = x > y || a < b || x < a ; // OR

         System.out.println(result);
         System.out.println(result1);
    }
}