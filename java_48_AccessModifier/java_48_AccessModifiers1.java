package java_48_AccessModifier;   //this file is access from outside this package
public class java_48_AccessModifiers1 {
    public int marks = 6; //if we want to access something outside the package
                        //then always make it public
    private int rollNo = 8;  //this provate variable can only accessed inside class
    int age = 12;  //since access modifier is not mentioned, it is default access modifier which can only be accessed inside package
        //AVOID USING DEFAULT ACCESS MODIFIER "Strictly"
    protected int num = 987; //this private variable can be accessed inside class, inside package, outside package subclass but not outside package non-subclass

    //But variables should not be public but methods should be public
    public void display() {
        System.out.println(marks);
    }

}
