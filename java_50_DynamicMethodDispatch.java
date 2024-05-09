//it is used during Run Time Polymorphism

class Pol {
    public void show()
    {
        System.out.println("in pol show");
    }
}
class mor extends Pol {
    public void show()
    {
        System.out.println("in mor show");
    }
}
class phi extends Pol {
    public void show()
    {
        System.out.println("in phi show");
    }
}

public class java_50_DynamicMethodDispatch {
    public static void main(String[] args) {
        Pol obj = new Pol(); //we can create object of parent class and implement its child class
        obj.show();                    //reference of super class and object of sub class eg. Pol obj = new mor();

        obj = new mor();
        obj.show();

        obj = new phi();
        obj.show();


    }
}
