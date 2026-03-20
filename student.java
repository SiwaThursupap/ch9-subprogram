public class student {

    private int studentId;
    private String studentName;
    private double gpa;
    private boolean gender ;

    public student(int studentId, String studentName, double gpa) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.gpa = gpa;
    }

    public void displayInfo() {
        IO.println("--Student Info--");
        IO.println("Student ID : " + this.studentId);
        IO.println("Student Name : " + this.studentName);
        IO.println("GPA : " + this.gpa);
    }

    public String getInfo(){
        return this.studentId + " " + this.studentName + " " +this.gpa;
    }
}