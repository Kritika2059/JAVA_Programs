class con {

    private int age;
    private String name;

    public con() {
        age = 20;
        name = "notKriti";
        System.out.println("default constructor");
    }

    public con(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("parameterised constructor");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}

    public class java_36_constructor {
        public static void main(String[] args) {
            con obj = new con();
            System.out.println(obj.getName() + " : " + obj.getAge());

//            obj1.setAge(21);
//            obj1.setName("kritikaa");

            con obj1 = new con(21,"kritiii");
            System.out.println(obj1.getName() + " : " + obj1.getAge());

        }
    }

