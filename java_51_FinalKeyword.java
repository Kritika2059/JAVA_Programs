//'final' keyword can be used in: variable, method, class


final class aa {        /*when we make a method final
    // then we will not be able to make its child class
    //its inheritance will be stopped and we cannot extend it*/

    public void show() {
        System.out.println("in aa show");
    }
    public void add(int a, int b) {
        System.out.println(a+b);
    }
}
class aaa {
    public final void show() { //when we make out method final then we cannot override it
        System.out.println("in aaa show final method");
    }
    public void add(int a, int b) {
        System.out.println(a+b);
    }
}

class bbb extends aaa {
    /*public void show() {  //here, we are overriding a final method => so, it throws an error
        System.out.println("in bbb show");
    } */
    public void newshow() {
        System.out.println("in bbb new show");
    }
}

    public class java_51_FinalKeyword {
    public static void main(String[] args) {
        int num = 8;
        num = 9;
        System.out.println(num);

        //when it is clear that the value of will should not change in future then we use final keyword
        //it is a good practive to use final keyworf

        final int num1 = 18; // when we use final keyword, the variable acts as constand and its value cannot be changed
        System.out.println(num1);
//        num1 = 9;     //error occurs coz we cannot assign a value to final variable num1
//        System.out.println(num1);


//        aa obj = new aa();  //obj of final class
//        obj.show();
//        obj.add(4,5);

       bbb obj1 = new bbb();
        obj1.newshow();
    }
}
