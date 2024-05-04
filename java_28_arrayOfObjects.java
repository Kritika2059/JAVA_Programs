class student {
    int rollno;
    String name;
    int marks;
}

public class java_28_arrayOfObjects {
    public static void main(String[] args) {

        student s1 = new student();
        s1.rollno = 1;
        s1.name = "John";
        s1.marks = 89;

        student s2 = new student();
        s2.rollno = 2;
        s2.name = "Mary";
        s2.marks = 78;

        student s3 = new student();
        s3.rollno = 3;
        s3.name = "Peter";
        s3.marks = 90;


        student students[] = new student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0; i<students.length;i++) {
            System.out.println(students[i].name + " : " + students[i].marks);
        }
    }
}
