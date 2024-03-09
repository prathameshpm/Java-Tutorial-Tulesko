class Student
{
    int rollNo;
    int marks;
}

public class enhancedForLoops {
    public static void main(String[] args) {
        int x[] = new int[4];

        x[0] = 5;
        x[1] = 2;
        x[2] = 4;
        x[3] = 9;

        for(int n : x)
        {
            System.out.print(n + " ");
        }

        System.out.println();

        Student s1 = new Student();
        s1.rollNo = 1;
        s1.marks = 88;
        
        Student s2 = new Student();
        s2.rollNo = 2;
        s2.marks = 67;
        
        Student s3 = new Student();
        s3.rollNo = 3;
        s3.marks = 97;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(Student m : students)
        {
            System.out.println("Roll no: " + m.rollNo + ", " + "Marks: " + m.marks + "%");
        }

        /*
         * for(<datatype> <newVariable> : <arrayVariable>){
         *      Code to execute
         * }
         */
    }
}
