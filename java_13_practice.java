public class java_13_practice {
    public static void main(String[] args) {
        //problem 1: convert a string to lowercase
        String name = "Kritika Pandey";
        name = name.toLowerCase();
        System.out.println(name);

        //problem 2: repalce spaces with underscores
        String space = "i am good";
        System.out.println(space.replace(" ","_"));

        //problem 3: replace <|name|> with some custom name
        String letter = "Dear <|name|>, Thanks a lot!";
        System.out.println(letter.replace("<|name|>","kritika"));

        //problem 4: detect double and triple spaces in a string
        String myString = "This string contains  double and   triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   ")); //if output is -1 then triple space not detected

        //problem 5: print a string letter as a letter like:
        // "Dear kritika,
        //      This java course is nice.
        //                          Thanks"
        System.out.println("\"Dear kritika, \n\tThis java course is nice.\n\t\t\t\t\tThanks\"");
    }
}
