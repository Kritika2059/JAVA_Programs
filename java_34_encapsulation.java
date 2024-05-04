class human {
//    private int age = 21;
//    private String name = "kritika";

    private int age ;
    private String name ;

    public int getAge() {
        return age;
    }

    public void setAge(int a) { // this is how we set the valuse of data
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
    name = n;
    }

}

public class java_34_encapsulation {
    public static void main(String[] args) {
        human obj1 = new human();
        //obj1.age = 21;
        //obj1.name = "kritika";

        obj1.setAge(21);
        obj1.setName("kritikaa");

        // this is how we can access private data
        System.out.println(obj1.getName() + " : " + obj1.getAge() );

     }
}
