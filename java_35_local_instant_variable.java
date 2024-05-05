class human {
//    private int age = 21;
//    private String name = "kritika";

    private int age ;
    private String name ;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age; //local and instant(global) variable has same name, prefrence is given to local variable
            //this.age(this keyword) represents curent object
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class java_35_local_instant_variable {
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
