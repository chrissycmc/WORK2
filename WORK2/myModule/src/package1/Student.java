package package1;

public class Student {
    String Name;
    private int StudentID;

    public Student(String Name,int StudentID){
        this.Name=Name;
        this.StudentID=StudentID;
    }
    public void displayStudentInfo(){
        System.out.println("Student name:"+Name);
        System.out.println("Student Id :"+StudentID);
    }
}
