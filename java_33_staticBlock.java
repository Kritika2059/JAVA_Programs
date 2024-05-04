class phone {
    String brand;
    int price;
    static String name;

    public phone()
    {
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }
    static {     //coz if we keep this in constructor then every time static variable is initialized which is not needed
        name = "phone"; // so this static block is created
        System.out.println("in static block");
    }
    public void show() {
        System.out.println(brand + " : " + name + " : " + price);
    }
}

public class java_33_staticBlock {
    public static void main(String[] args) //throws ClassNotFoundException {       // to throw the exception
        {

         //   Class.forName("phone"); //to throw the exception if no class is found
        phone obj1 = new phone();
        obj1.brand = "apple";
        obj1.price = 1500;
        phone.name = "smartphone";

        phone obj2 = new phone();
        obj2.brand = "samsung";
        obj2.price = 1000;
        phone.name = "smartphoneeee";

        obj1.show();
        obj2.show();

        }
    }

