public class java2_ConditionalStatements {
    public static void main (String[] arg){
         int x = 8;
         int y = 7;
         int z = 9;
         if (x>y && x>z)
             System.out.println(x);
         else if (y>z)
             System.out.println(y);
         else
            System.out.println(z);

    }
}
