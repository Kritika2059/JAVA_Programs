class MethodOverA {
    public void show() {
        System.out.println("in A show");
    }
    public void config() {
        System.out.println("in A config");
    }
}
class MethodOverB extends MethodOverA {
    public void show() {
        System.out.println("in B show");
    }
}

public class java_45_methodOverriding {
    public static void main(String[] args) {
        MethodOverB obj = new MethodOverB();
        obj.show();
        obj.config();
    }
}
