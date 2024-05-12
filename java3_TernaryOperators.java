public class java3_TernaryOperators {
    public static void main(String[] arg){
        int n = 4;
        int result = 0;

        if(n%2==0)
            result = 10;
        else
            result = 5;
        System.out.println(result);

// Instead of above if else condition statement we can use the down code
        result = n%2==0 ? 10 : 5; //ternary operators
    }
}
