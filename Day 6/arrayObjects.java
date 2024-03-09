class Student
{
    int rollNo;
    String name;
    int marks;
}

public class arrayObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "Navin";
        s1.marks = 88;
        
        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "Harsh";
        s2.marks = 67;
        
        Student s3 = new Student();
        s3.rollNo = 3;
        s3.name = "Kiran";
        s3.marks = 97;

        Student students[] = new Student[3];
        // int x[] = new int[4];
        // <datatype> <variable>[] = new datatype[<arrayLength];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i = 0; i < students.length; i++)
        {
        //    System.out.println(students[i]);
        //      Prints address of each students[i]
            System.out.println("Roll no: " + students[i].rollNo + ", " + "Marks: " + students[i].marks + "%");
        }
    }
}
