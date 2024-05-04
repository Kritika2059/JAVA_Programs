class mobile {
    String brand;
    int price;
    String network;
    static String name; //static variable which is same for all objects

    public void show() {
        System.out.println(brand+ " : " + price + " : " + network + " : " + name);
    }
}

public class java_31_staticVariable {
    public static void main(String[] args) {
        mobile obj1 = new mobile();
        obj1.brand = "apple";
        obj1.price = 1000;
        obj1.network = "4G";
        //obj1.name = "iphone";
        mobile.name = "smartphone"; //it is called by class name not need to mention object

        mobile obj2 = new mobile();
        obj2.brand = "samsung";
        obj2.price = 2000;
        obj2.network = "5G";
        //obj2.name = "android";
        mobile.name = "smartphone"; // no need to do this as well

        //obj1.name = "phone"; //when the valuse is changed for one object then it is changed for all the objects as 'name' is static
        mobile.name = "phone";

        obj1.show();
        obj2.show();


    }
}
