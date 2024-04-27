public class java_15_logicalOperators {
    public static void main(String[] args) {
        // && -> AND
        // || -> OR
        // ! -> NOT
        // logical AND, logical OR, logical NOT
        boolean a=true;
        boolean b=false;

        //AND
        if(a&&b)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }

        //OR
        if(a||b)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }

        //NOT
            System.out.println(!a);
    }
}
