//In java, we can inherit the feature of class of another file
//here we will try to inherit the feature of class of another file
// i.e. java_42_Calc1.java
// and java_43_AdvCalc.java using "extends" which also extends the features of java_42_Calc1.java
// public class java_43_AdvCalc extends java_42_Calc1  => features of both class is inherited

//NOTE: ** this program uses program no. 42 and 43 to show inheritance and extends feature
//  and uses program no.44 to show multilevel inheritance

//veryAdvCalc extends features of AdvCalc, AdvCalc extends features of Calc1 which is multilevel inheritance


public class java_41_inheritance {
    public static void main(String[] args) {
        java_44_veryAdvCalc obj = new java_44_veryAdvCalc();
        int r1 = obj.add(4,5);
        int r2 = obj.sub(9,5);
        int r3 = obj.multi(9,5);
        int r4 = obj.div(10,5);
        double r5 = obj.power(5,2);

        System.out.println("r1 : " + r1);
        System.out.println("r2 : " + r2);
        System.out.println("r3 : " + r3);
        System.out.println("r4 : " + r4);
        System.out.println("r5 : " + r5);
    }
}


// In java, Multiple Inheritance doesnot work
// because of Ambiguity Problem, this feature is removed from java (2 parent have same method, which one to choose)
