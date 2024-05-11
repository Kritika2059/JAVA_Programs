class Acast {
    public void show1() {
        System.out.println("in A show");
    }
}
class Bcast extends Acast {
    public void show2() {
        System.out.println("in B show");
    }
}

public class java_53_UpcastingDowncasting {
    public static void main(String[] args) {

        //Upcasting
        Acast obj = new Bcast(); //similar to typecasating double to integer value
        obj.show1();

        //Downcasting
        Bcast obj1 = (Bcast) obj;
        obj1.show2();
    }
}
