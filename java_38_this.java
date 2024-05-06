//In super method, it calls constructor of super class
//NOW, if we need to call the constructor of own(same) class then, this() method is used

class Aa {
    public Aa() {
        super();
        System.out.println("default constructor in A");
    }

    public Aa(int a) {
        super();
        System.out.println("parameretized in A");
    }
}

class Bb extends Aa {
    public Bb() {
        super();
        System.out.println("default constructor in B");
    }

    public Bb(int a) {
        this();  //this method calls its own constructor
        System.out.println("parameretized in B");
    }
}

public class java_38_this {
    public static void main(String[] args) {
        Bb obj1 = new Bb(5);
    }
}
