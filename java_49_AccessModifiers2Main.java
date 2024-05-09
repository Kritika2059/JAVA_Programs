import java_48_AccessModifier.*;   //accessing the files from java_48_AccessModifier package

class cr extends java_48_AccessModifiers1 {
    public void abc()
    {
        System.out.println(num); //since, number is used in sub-class, it can be used even number is protected
    }
}

public class java_49_AccessModifiers2Main {
    public static void main(String[] args) {
        java_48_AccessModifiers1 obj = new java_48_AccessModifiers1();
        System.out.println("marks = " + obj.marks);
                            //here, we are able to access the variable marks from another package only
                            //because it is public
       // System.out.println(obj.rollNo);  => since, rollNo is provate so it cannot be accessed outside class

        cr obj1 = new cr();
        obj1.abc();
    }
}
