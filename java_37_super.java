import org.w3c.dom.ls.LSOutput;
//in java, each constructor has a method called super which is there even if not mentioned
class A extends Object{ //every class in java extends object class(pre-defined)  "even if not mentioned"
    public A() {
        super();
        System.out.println("default constructor in A");
    }
    public A(int a) {
        super();
        System.out.println("parameretized in A");
    }
}
class B extends A {   //class B extends A & A extends object, which signifies multilevel inheritance
    public B() {
        super(); //super is like a Jhon Cena method, i.e. it is present there even if you can't see it
        System.out.println("default constructor in B");
    }
    public B(int a) {
        super(a);     // when we pass a value in super then it calls parameterixed constructor
        System.out.println("parameretized in B");
    }
}

public class java_37_super {
    public static void main(String[] args) {

        B obj1 = new B(5);

    }
}
