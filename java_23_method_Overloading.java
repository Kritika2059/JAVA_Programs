class overload {
    public int add(int n1, int n2)
    {
        return n1+n2;
    }

    public int add(int n1, int n2, int n3)
    {
        return n1+n2+n3;
    }

    public double add(double n1, int n2)
    {
        return n1+n2;
    }
}

public class java_23_method_Overloading {
    public static void main(String[] args) {
        overload obj = new overload();
        int result1 = obj.add(2,3);
        int result2 = obj.add(2,3,4);
        double result3 = obj.add(2.5,3);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
