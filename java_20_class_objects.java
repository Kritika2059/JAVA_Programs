class calculate
{
    int a;

    public int add()
    {
        System.out.println("in add");
        return 0;
    }
}

public class java_20_class_objects
{
    public static void main(String[] args)
    {
        calculate obj1 = new calculate();
        int result = obj1.add();
        System.out.println(result);

    }
}
