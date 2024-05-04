class student1 {
    int rollno;
    String name;
    int marks;
}

public class java_29_enhancedForLoop_inArray {
    public static void main(String[] args) {

        student1 s1 = new student1();
        s1.rollno = 1;
        s1.name = "John";
        s1.marks = 77;

        student1 s2 = new student1();
        s2.rollno = 2;
        s2.name = "Mary";
        s2.marks = 88;

        student1 s3 = new student1();
        s3.rollno = 3;
        s3.name = "Peter";
        s3.marks = 99;


        student1 students[] = new student1[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(student1 stud : students) {
            System.out.println(stud.name + " : " + stud.marks);
        }

//        for(int i=0; i<students.length;i++) {
//            System.out.println(students[i].name + " : " + students[i].marks);
//        }
    }
}
