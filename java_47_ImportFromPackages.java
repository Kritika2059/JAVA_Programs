
import java_46_packages.java_46_package1; //this way we can use the classes from the packages
import java_46_packages.java_46_package2;
import java.util.ArrayList; //to use arraylist class we have to import in this way

//whichever class we use belongs to a package
//System is also a clage which belongs to the package "java.lang"
//but we never import it because the package java.lang is default imported
// what defailt imported is "java.lang.*" where * denotes all the files inside lang folder
//* means all the files not all the folders
// if you create a new folder and move the exsisting folder insider the new folder then the old folder will be moved to new one then the code will be changed accordingily automatically
//libraries is something which is used when we want to create some application and don't want to write all the code by ourself then we can use already built libraries
//libraries must have unique name. to make it unique:
//com.google.example  -> reverse google.com to make it unique


public class java_47_ImportFromPackages  {
    public static void main(String[] args) {

        ArrayList list = new ArrayList(); //this is inbuilt class

        java_46_package1 obj1 = new java_46_package1();
        int result = obj1.add(3,4);
        System.out.println("main result add = " + result);

        java_46_package2 obj2 = new java_46_package2();
        int result2 = obj2.mul(3,4);
        System.out.println("main result mul = " + result2);
    }
}
