public class Certification extends Course{
           private int courseFee;
           private String startDate;
           private String examDate;
           private String examCenter;
           private String certificateAwardedBy;
           private String validTill;
           private boolean started;
    public Certification(String courseName, String instructorName,int totalHours, int courseFee, String certificateAwardedBy, String validTill){
        super(courseName, instructorName, totalHours);
        this.courseFee=courseFee;
        this.certificateAwardedBy=certificateAwardedBy;
        this.validTill=validTill;
        startDate="";
        examDate="";
        examCenter="";
        started=false;
    }
    public int getCourseFee(){ //this method is used to access course fee
        return courseFee;
    }
    public String getStartDate(){ //this method is used to access start date
        return startDate;
    }
    public String getExamDate(){ //this method is used to access exam date
        return examDate;
    }
    public String getExamCenter(){ //this method is used to access exam center
        return examCenter;
    }
    public String getCertificateAwardedBy(){ //this method is used to access certificate awarded by
        return certificateAwardedBy;
    }
    public String getValidTill(){ //this method is used to access valid till
        return validTill;
    }
    public boolean getStarted(){ //this method is used to access started
        return started;
    }
    public void setCourseFee(int courseFee){ //this method is used to set course fee
        if(started==false){
            this.courseFee=courseFee;
        }else{ 
            System.out.println("Sorry! Course fee cannot be changed as course has already been started.");
        }
    }
    public void enroll(String studentName, String startDate, String examDate, String examCenter){ //this method is used to enroll student
        if(started==false){
            setStudentName(studentName);
            started=true;
            this.examDate=examDate;
            this.examCenter=examCenter;
            this.startDate=startDate;
        }else{
            System.out.println("Course has already been started on"+this.startDate);
             
        }
    }
    public void display(){ //this method is used to display all the required details 
        super.display();
        if (started==true){
            System.out.println("Course Started on "+startDate);
            System.out.println("Exam Scheduled on "+examDate);
            System.out.println("Exam Center: "+examCenter);
            System.out.println("Certificate will be awarded by: "+certificateAwardedBy);
            System.out.println("Certificate will be valid till: "+validTill);
        }
            
        
            
    }
    
            
    
}
