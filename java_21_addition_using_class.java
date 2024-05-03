class calculator
{
    public int add(int n1, int n2)
    {
        System.out.println("addition is: ");
        int r = n1 + n2;
        return r;
    }

}

public class java_21_addition_using_class
{
    public static void main(String[] args)
    {
        int num1=4;
        int num2=5;

        calculator calci = new calculator();
        int result = calci.add( num1, num2 );
        System.out.println(result);
    }
}
