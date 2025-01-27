public class Student {
    public int studentid;
    public String studentname;
    public String grade;

    public Student(){
        this(0,"unknown","none");
    }
    public Student(int studentid, String studentname, String grade) {
        // Initialize studentId with the provided parameter
        this.studentid = studentid;
        // Initialize studentName with the provided parameter
        this.studentname = studentname;
        // Initialize grade with the provided parameter
        this.grade = grade;
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        // Create a new Student object using the default constructor
        Student student1 = new Student();
        // Print the values of the instance variables for student1
        System.out.println("Student1 ID: " + student1.studentid);
        System.out.println("Student1 Name: " + student1.studentname);
        System.out.println("Student1 Grade: " + student1.grade);

        // Create a new Student object using the parameterized constructor
        Student student2 = new Student(101, "Cullen", "A");
        // Print the values of the instance variables for student2
        System.out.println("Student2 ID: " + student2.studentid);
        System.out.println("Student2 Name: " + student2.studentname);
        System.out.println("Student2 Grade: " + student2.grade);
    }
}
