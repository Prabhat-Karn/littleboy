
/**
 * Write a description of class course here.
 *
 * @author (Prabhat Kumar Karn)
 * @version (1.0)
 */
public class Course{
    String courseName;
    String instructorName;
    String studentName;
    int totalHours;
    public Course(String courseName, String instructorName, int totalHours){ //constructor to assign new value in the global attribute 
        this.courseName=courseName;
        this.instructorName=instructorName;
        this.totalHours=totalHours;
        studentName="";
    }
    public String getCourseName(){ //method used to access course name
        return courseName;
    }
    public String getInstructorName(){ //method used to access instructor's name
        return instructorName;
    }
    public String getStudentName(){ //method used to access student name
        return studentName;
    }
    public void setStudentName(String studentName){ //This method is used to set student name
        this.studentName=studentName;
    }
    public  void display(){ // this methodd is used to display the required details
        System.out.println("Course Name: "+courseName);
        System.out.println("Name of Instructor: "+instructorName);
        System.out.println("Total Hours: "+totalHours);
        if (!studentName.equals("")){
            System.out.println("Student Name "+studentName);
        }
    
    }
    
    
}