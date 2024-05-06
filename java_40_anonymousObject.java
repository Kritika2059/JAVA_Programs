class AnObj {
    public AnObj() {
        System.out.println("object created");
    }
    public void show() {
        System.out.println("in AnObj show");
    }
}

public class java_40_anonymousObject {
    public static void main(String[] args) {

        //int marks;
        //marks = 100;
        //here, var is created and then assigned,
        // similar can be done with object also
        //AnObj obj;
        //obj= new AnObj(); //new AnObj is the place where object is created

        //now what we can do is: create an object anonymously
        new AnObj(); //now here object is not created but constructor is called
        // this type of object is called "anonymous object"
        //new AnObj(),show(); by doing this we can call show but
                            // this type of object can only be created once


        //obj.show();

    }
}
