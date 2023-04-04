package Day1;

public class Student {
    int roll_no;
    String fname;
    float percentage;

    public Student(int roll_no, String fname, float percentage) {
        this.roll_no = roll_no;
        this.fname = fname;
        this.percentage = percentage;

    }
    public String toString(){
        return "roll_no is " + roll_no + "Fname is ";
    }

    public class StudentArray {
        public static void main(String[] args) {
            Student s1 = new Student(1, "sd", 65f);
            Student s2 = new Student(2, "gd", 12f);
            Student sArray[] = new Student[2];
            sArray[0] = s1;
            sArray[1] = s2;
            for (int i = 0; i < sArray.length; i++)
                System.out.println(sArray[i]);
        }

    }
}
