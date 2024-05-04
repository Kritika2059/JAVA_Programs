class car {
    String brand;
    String type;
    int price;
    static String name;// this is class member
    //for using non static method,object must be created

    public void show() {
        System.out.println(brand + " : " + price + " : " + type + " : " + name);
    }

    //***in static method only static variable can be used

    public static void show1() {
        System.out.println("In static method : " + name);
    }

    //** non static variable van be used in static method indirectly using object reference

    public static void show2(car obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + obj.type + " : " + name);
    }

    static {    //static block where static variable is assigned with some value
        name = "car";
    }

}

public class java_32_staticMethod {
    public static void main(String[] args) {

        car obj1 = new car();
        obj1.brand = "tesla";
        obj1.price = 1000;
        obj1.type = "modelX";



        car obj2 = new car();
        obj2.brand = "TATA";
        obj2.price = 1500;
        obj2.type = "nexon";

        //static method is basically a static function which directly uses static variables
        // and can also indirectly use non-static variables
        obj1.show();  //non-static method is called using object
        obj2.show();

        car.show1();  //static method is called directing using class

        car.show2(obj1);  //object is passed in static method


    }
}