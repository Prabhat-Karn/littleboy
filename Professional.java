public class Professional extends Course{
    private int courseFee;
    private String enrollDate;
    private String roomNo;
    private int dailyHour;
    private int downPayment;
    private boolean started;
    private boolean completed;
    public Professional (String courseName, String instructorName, int courseFee, int totalHours,int dailyHour){
        super(courseName, instructorName,totalHours);
        this.courseFee=courseFee;
        this.dailyHour=dailyHour;
        enrollDate="";
        roomNo="";
        downPayment=0;
        started=false;
        completed=false;
       
    }
    public int getCourseFee(){ // this method is used to access course fee
        return courseFee;
    }
    public String getEnrollDate(){ //this method is used to access enroll date
        return enrollDate;
    }
    public String getRoomNo(){ //this method is used to access room no
        return roomNo;
    }
    public int getDailyHour(){ //this method is used to access daily hour
        return dailyHour;
    }
    public int getDownPayment(){ //this method is used to access down payment
        return downPayment;
    }
    public boolean getStarted(){ //this method is used to access strted
        return started;
    }
    public boolean getCompleted(){ //this method is used to access completed
        return completed;
    }
    public void setCourseFee(int courseFee){ // This method is used to set courses fee
        this.courseFee=courseFee;
    }
    public void setDailyHour(int dailyHour){ // This method is used to set daily hour
        this.dailyHour=dailyHour;
    }
    public void setEnrollDate(String enrollDate){ //This method is used to set enroll date
        this.enrollDate=enrollDate;
    }
    public void setDownPayment(int downPayment){ //This method is used to set down payment
        this.downPayment=downPayment;
    }
    public void setRoomNo(String roomNo){ //This method is used to set room no
        this.roomNo=roomNo;
    }
    public void enrollStudent(String studentName, String enrollDate, int downPayment, String roomNo){ // This method is used to enroll student.
        if (started==true){
            System.out.println("Class has already been sarted");
            System.out.println("Instructor Name: "+instructorName);
            System.out.println("Room No.: "+roomNo);
        }else{
            setStudentName(studentName);
            setEnrollDate(enrollDate);
            setDownPayment(downPayment);
            setRoomNo(roomNo);
            started=true;
            completed=false;
        }
    }
    public void courseComp(){
        if (completed==true){
            System.out.println("Course has been completed!");
        }else{
            setStudentName("");
            enrollDate="";
            downPayment=0;
            started=false;
            completed=true;
        }
    }
    public void print_(){ //this method is used to print the required details
        System.out.println("Course Name: "+getCourseName());
        System.out.println("Instructor Name: "+instructorName);
        System.out.println("Course Fee: "+courseFee);
    }
    public void display(){ //this method is used to display all the required details.
        super.display();
        if(started==true){
            System.out.println("Completed: "+getCompleted());
            System.out.println("Date for enrollment: "+enrollDate);
            System.out.println("Down Payment: "+downPayment);
           
        }
    }
        
    
        
    
            
        
    
    
    
        
        
}