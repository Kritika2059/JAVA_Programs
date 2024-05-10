import java.util.Objects;

class Laptop
{
    //hashCode, equals, toString methods, etc
    //object class contains lots of builtin(let's say already made) methods which makes it easier and efficient to write code than making methods by our own
    String model;
    int price;
//to generate toSring automatically =? right click => click generate => click toString(
    //it will generate a better (output)message to show to user
    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    //    public boolean equals(Laptop thatObj)
//    {
////        if(this.model.equals(thatObj.model) && this.price == thatObj.price)
////        {       //if boolean result = obj1.equals(obj2); was written without creating this method then it would have pronted 'false'
////            return true;
////        }
////        else
////        {
////            return false;
////        }
//        //instead of doing this all of above we can do something like below, which will automatically return boolean
//        return this.model.equals(thatObj.model) && this.price == thatObj.price;
//
//    }
    //now instead of doing this by creating own method, simply we can do like below
    //right click => click Generate => equals() and hashCode()
    //then it will create this method automatically and cleck all the values not only variable
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return price == laptop.price && Objects.equals(model, laptop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }
}

public class java_52_ObjectClass {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.model = "lenovo ideapad";
        obj1.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.model = "lenovo ideapad";
        obj2.price = 1000;

        boolean result = obj1.equals(obj2); //result was false when boolean result = obj1==obj2;
        //it will not use equals of object class it will use equals of Laptop class
        System.out.println(obj1); //every time object is created it will call toString method
        System.out.println(result);
    }
}
