public class java_54_WrapperClass {
    public static void main(String[] args) {
        int num = 10;
//        Integer num1 = new Integer(num);  //boxing => when we store primitive type in the object
        Integer num1 = num; //auto-boxing => when we store primitive type in the object {AUTOMATICALLY}
        System.out.println(num1);

//        int num2 = num1.intValue(); //unboxing => when we take out primitive value from the obfect
        int num2 = num1; //auto-unboxing => when we take out primitive value from the obfect {AUTOMATICALLY}
        System.out.println(num2);

        String str = "12";
        int num3 = Integer.parseInt(str); //parseInt is one of the Wrapper Class
        System.out.println(num3*2);
    }
}
