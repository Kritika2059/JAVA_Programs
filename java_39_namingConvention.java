//[camel Casing] =>> it is used so that it could be readable by everyone

//class and interface - Calc, Runable  => starts with capital letter
//variable and methos - marks, show() => starts with small letters
//constants - PIE => all capital letters

//showMyMarks -> it is more readable than showmymarks
                //In java, show_my_marks (called snake casing) is not considered to be good

class Calc {
    public void showMarks(int marks1, int marks2) {
        System.out.println("total marks is: " + (marks1+marks2));
    }
}
public class java_39_namingConvention {
    public static void main(String[] args) {
        Calc c = new Calc();
        c.showMarks(10, 20);


    }
}
