import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
public class TrainingInstitute extends JFrame implements ActionListener{
	private JPanel p1;
	private JPanel p2;

	private ImageIcon icon_;
	private ImageIcon eIcon;
	private ImageIcon cIcon;
	private ImageIcon clIcon;
	private ImageIcon dIcon;

	private JButton Add_;
	private JButton cAdd_;
	private JButton enrol;
	private JButton cEnrol; 
	private JButton cDisplayAll;
	private JButton cClear;
	private JButton complete;

	private JTextField description_;
	private JTextField instructorName_;
	private JTextField courseFee_;
	private JTextField courseDuration_;
	private JTextField dailyHour_;
	private JTextField studentName_;
	private JTextField enrolDate_;
	private JTextField courseNo_;
	private JTextField roomNo_;
	private JTextField downPayment_;

	private JTextField cDescription_;
	private JTextField cInstructorName_;
	private JTextField cCourseFee_;
	private JTextField cCourseDuration_;
	private JTextField cValidDuration_;
	private JTextField cAwardedBy_;
	private JTextField cStudentName_;
	private JTextField cStartDate_;
	private JTextField cCourseNo_;
	private JTextField cExamDate_;
	private JTextField cExamCenter_;
	private Professional profObj;
		
	ArrayList<Course> list = new ArrayList<Course>();

	public void course(){
		setTitle("Training Institute");
		setSize(700,722);
		setLayout(null);
		

		p1 = new JPanel();
		add(p1);
		p1.setBounds(16,10,650,285);
		p1.setLayout(null);
		p1.setBorder(BorderFactory.createTitledBorder("Professional Course"));
		

		p2 = new JPanel();
		add(p2);
		p2.setBounds(16,300,650,370);
		p2.setLayout(null);
		p2.setBorder(BorderFactory.createTitledBorder("Certification Course"));
		
	
		JLabel description = new JLabel("Description ");
		JLabel instructorName = new JLabel("Instructor Name ");
		JLabel courseFee = new JLabel ("Course Fee ");
		JLabel courseDuration = new JLabel("Course Duration ");
		JLabel dailyHour = new JLabel("Daily Hour ");
		JLabel studentName = new JLabel("Student Name ");
		JLabel enrolDate = new JLabel("Enrol Date ");
		JLabel courseNo = new JLabel("Course No. ");
		JLabel roomNo = new JLabel("Room No. ");
		JLabel downPayment = new JLabel("Down Payment ");

		JLabel cDescription = new JLabel("Description ");
		JLabel cInstructorName = new JLabel("Instructor Name ");
		JLabel cCourseFee = new JLabel ("Course Fee ");
		JLabel cCourseDuration = new JLabel("Course Duration ");
		JLabel cValidDuration = new JLabel("Valid Duration ");
		JLabel cAwardedBy = new JLabel("Awarded By ");
		JLabel cStudentName = new JLabel("Student Name ");
		JLabel cEnrolDate = new JLabel("Enrol Date ");
		JLabel cCourseNo = new JLabel("Course No. ");
		JLabel cRoomNo = new JLabel("Room No. ");
		JLabel cStartDate = new JLabel("Start Date ");
		JLabel cExamDate = new JLabel("Exam Date ");
		JLabel cExamCenter = new JLabel("Exam Center ");
		

		description.setBounds(30,17,100,30);
		instructorName.setBounds(30,45,150,30);
		courseFee.setBounds(30,73,120,30);
		courseDuration.setBounds(320,73,150,30);
		dailyHour.setBounds(30,101,120,30);
		studentName.setBounds(30,157,120,30);
		enrolDate.setBounds(30,185,120,30);
		courseNo.setBounds(320,185,120,30);
		roomNo.setBounds(30,213,120,30);
		downPayment.setBounds(320,213,150,30);

		cDescription.setBounds(30,17,100,30);
		cInstructorName.setBounds(30,45,150,30);
		cCourseFee.setBounds(30,73,120,30);
		cCourseDuration.setBounds(320,73,150,30);
		cValidDuration.setBounds(30,101,120,30);
		cAwardedBy.setBounds(30,129,120,30);
		cStudentName.setBounds(30,185,120,30);
		cCourseNo.setBounds(30,213,120,30);
		cStartDate.setBounds(320,213,120,30);
		cExamDate.setBounds(30,241,120,30);
		cExamCenter.setBounds(30,269,120,30);
		
		
		p1.add(description);
		p1.add(instructorName);
		p1.add(courseFee);
		p1.add(courseDuration);
		p1.add(dailyHour);
		p1.add(downPayment);
		p1.add(studentName);
		p1.add(enrolDate);
		p1.add(courseNo);
		p1.add(roomNo);
		

		p2.add(cDescription);
		p2.add(cInstructorName);
		p2.add(cCourseFee);
		p2.add(cCourseDuration);
		p2.add(cStudentName);
		p2.add(cStartDate);
		p2.add(cCourseNo);
		p2.add(cExamDate);
		p2.add(cExamCenter);
		p2.add(cValidDuration);
		p2.add(cAwardedBy);
		

		description_ = new JTextField();
		instructorName_ = new JTextField();
		courseFee_ = new JTextField();
		courseDuration_ = new JTextField();
		dailyHour_ = new JTextField();
		studentName_ = new JTextField();
		enrolDate_ = new JTextField();
		courseNo_ = new JTextField();
		roomNo_ = new JTextField();
		downPayment_ = new JTextField();

		cDescription_ = new JTextField();
		cInstructorName_ = new JTextField();
		cCourseFee_ = new JTextField();
		cCourseDuration_ = new JTextField();
		cValidDuration_ = new JTextField();
		cAwardedBy_ = new JTextField();
		cStudentName_ = new JTextField();
		cStartDate_ = new JTextField();
		cCourseNo_ = new JTextField();
		cExamDate_ = new JTextField();
		cExamCenter_ = new JTextField();
		
		
		description_.setBounds(133,24,450,22);
		instructorName_.setBounds(133,50,450,22);
		courseFee_.setBounds(133,76,150,22);
		courseDuration_.setBounds(433,76,150,22);
		dailyHour_.setBounds(133,104,150,22);
		studentName_.setBounds(133,164,450,22);
		enrolDate_.setBounds(133,192,150,22);
		courseNo_.setBounds(433,192,150,22);
		roomNo_.setBounds(133,220,150,22);
		downPayment_.setBounds(433,220,150,22);
		cDescription_.setBounds(133,24,450,22);
		cInstructorName_.setBounds(133,50,450,22);
		cCourseFee_.setBounds(133,76,150,22);
		cCourseDuration_.setBounds(433,76,150,22);
		cValidDuration_.setBounds(133,104,150,22);
		cAwardedBy_.setBounds(133,132,450,22);
		cStudentName_.setBounds(133,192,450,22);
		cCourseNo_.setBounds(133,220,150,22);						
		cStartDate_.setBounds(433,220,150,22);
		cExamDate_.setBounds(133,248,150,22);
		cExamCenter_.setBounds(133,276,450,22);

		p1.add(description_);
		p1.add(instructorName_);
		p1.add(courseFee_);
		p1.add(courseDuration_);
		p1.add(dailyHour_);
		p1.add(downPayment_);
		p1.add(studentName_);
		p1.add(enrolDate_);
		p1.add(courseNo_);
		p1.add(roomNo_);

		p2.add(cDescription_);
		p2.add(cInstructorName_);
		p2.add(cCourseFee_);
		p2.add(cCourseDuration_);
		p2.add(cStudentName_);
		p2.add(cStartDate_);
		p2.add(cCourseNo_);
		p2.add(cExamDate_);
		p2.add(cExamCenter_);
		p2.add(cValidDuration_);
		p2.add(cAwardedBy_);

		icon_ = new ImageIcon("add.png");
		eIcon = new ImageIcon("enrollnow.png");
		cIcon = new ImageIcon("complete.png");
		clIcon = new ImageIcon("clear2.png");
		dIcon = new ImageIcon("display.png");
	 
		Add_ = new JButton("ADD", icon_);
		enrol = new JButton("Enrol",eIcon);
		complete = new JButton("Complete",cIcon);

		cAdd_ = new JButton("ADD",icon_);
		cEnrol = new JButton("Enrol",eIcon);
		cClear = new JButton("Clear",clIcon);
		cDisplayAll = new JButton("Display All",dIcon);

		Add_.setBounds(430,132,155,25);
		enrol.setBounds(250,248,155,25);
		complete.setBounds(425,248,155,25);

		cAdd_.setBounds(430,160,155,25);
		cEnrol.setBounds(435,304,155,25);
		cClear.setBounds(260,332,155,25);
		cDisplayAll.setBounds(435,332,155,25);

		p1.add(Add_);
		p1.add(enrol);
		p1.add(complete);

		p2.add(cAdd_);
		p2.add(cEnrol);
		p2.add(cClear);
		p2.add(cDisplayAll);

		setVisible(true);
		p1.setVisible(true);
		p2.setVisible(true);


		Add_.addActionListener(this);
		cAdd_.addActionListener(this);
		enrol.addActionListener(this);
		cEnrol.addActionListener(this);
		cDisplayAll.addActionListener(this);
		complete.addActionListener(this);
		cClear.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if (e.getSource()==Add_){
			addCourseToProfessional();
		}
		else if(e.getSource()==cAdd_){
			addCourseToCertification();
		}
		else if (e.getSource()==enrol){
			enrolStudentToProfessional();
		}
		else if(e.getSource()==cEnrol){
			enrolStudentToCertification();
		}
		else if (e.getSource()==cDisplayAll){
			display_();
		}
		else if (e.getSource()==complete){
			courseCompletion();
		}
		else{
			if(e.getSource()==cClear){
				clear_();
			}
		}
	}	
	public void addCourseToProfessional(){
		
		try{

		        if (description_.getText().isEmpty() || instructorName_.getText().isEmpty() || courseFee_.getText().isEmpty() || courseDuration_.getText().isEmpty() || dailyHour_.getText().isEmpty()){
			    throw new NoSuchFieldException();	
		        }
		        else{
			
		                 String crscName = description_.getText();
		                 String instrctrName = instructorName_.getText();
		                 int crscFee = Integer.parseInt(courseFee_.getText());
		                 int totlHr = Integer.parseInt(courseDuration_.getText());
		                 int dlyHr = Integer.parseInt(dailyHour_.getText());
		                 profObj = new Professional (crscName, instrctrName, crscFee, totlHr, dlyHr);
		                 list.add(profObj);

		                 JOptionPane.showMessageDialog(p1,"Congratulation! The course has been added to Professional","Information",JOptionPane.INFORMATION_MESSAGE);

		                 description_.setText("");
		                 instructorName_.setText("");
		                 courseFee_.setText("");
		                 courseDuration_.setText("");
		                 dailyHour_.setText("");
		        }
		}
		catch(NoSuchFieldException E){
			JOptionPane.showMessageDialog(p1, "Required values must be provided");
		}
		catch(NumberFormatException N){
			JOptionPane.showMessageDialog(p1,"Sorry! Invalid Input","Error",JOptionPane.ERROR_MESSAGE);
		}
	}
	public void addCourseToCertification(){
		try{
			if (cDescription_.getText().isEmpty() || cInstructorName_.getText().isEmpty() || cCourseFee_.getText().isEmpty() || cCourseDuration_.getText().isEmpty() || cValidDuration_.getText().isEmpty() || cAwardedBy_.getText().isEmpty()){
				throw new NoSuchFieldException();
			}
		    else{
		            String cCrsName = cDescription_.getText();
		            String cInstrctrName = cInstructorName_.getText();
		            int cTotlHr =Integer.parseInt(cCourseDuration_.getText());
		            int cCrscFee = Integer.parseInt(cCourseFee_.getText());
		
		            String cAwrdBy = cAwardedBy_.getText();
		            String cVldTill = cValidDuration_.getText();

		            Certification certObj = new Certification (cCrsName, cInstrctrName, cTotlHr, cCrscFee, cAwrdBy, cVldTill);
		            list.add(certObj);

		            JOptionPane.showMessageDialog(p2, "Congratulation! The course has been added to Certification","Information",JOptionPane.INFORMATION_MESSAGE);

		            cDescription_.setText("");
		            cInstructorName_.setText("");
		            cCourseDuration_.setText("");
		            cCourseFee_.setText("");

		            cAwardedBy_.setText("");
		            cValidDuration_.setText("");
		    }
		}
		catch(NoSuchFieldException E){
			JOptionPane.showMessageDialog(p2, "Required value must be provided");
		}
		catch(NumberFormatException N){
			JOptionPane.showMessageDialog(p2,"Sorry! Invalid Input","Error",JOptionPane.ERROR_MESSAGE);
		}

	}
	public void enrolStudentToProfessional(){
		try{
		        String stdntName = studentName_.getText();
		        String enrlDate = enrolDate_.getText();
		        int crscNo = Integer.parseInt(courseNo_.getText())-1;
		        String romNo = roomNo_.getText();
		        int dwnPaymnt = Integer.parseInt(downPayment_.getText());

		        if (crscNo > list.size() || crscNo<0){
			JOptionPane.showMessageDialog(p1,"Error: Invalid Course Number", "Error",JOptionPane.ERROR_MESSAGE);
		        }
		        else{
			        Course c =list.get(crscNo);
			        if (c instanceof Professional){
				                                   Professional p = (Professional)c; //object casting
				                                   p.enrollStudent(stdntName,enrlDate,dwnPaymnt,romNo);
				                                  JOptionPane.showMessageDialog(p1, "The Student has been enrolled Succesfully in Professional course");
			        }
			        else{
				         JOptionPane.showMessageDialog(p1,"Course is not of professional", "Information",JOptionPane.INFORMATION_MESSAGE);
			        }

		        }
		
		}	
		catch(NumberFormatException N){
			JOptionPane.showMessageDialog(p1, "Sorry! Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void courseCompletion(){
			try{
				if (studentName_.getText().isEmpty()){
					                                 JOptionPane.showMessageDialog(p1,"Student has not been enrolled yet!","Error",JOptionPane.ERROR_MESSAGE);
				}
				else{
					int crscNo = Integer.parseInt(courseNo_.getText())-1;
					if(crscNo>list.size()||crscNo<0){
						                            JOptionPane.showMessageDialog(p1,"Error: Invalid Course Number","Error",JOptionPane.ERROR_MESSAGE);
					}
					else{
						Course c = list.get(crscNo);
						if(c instanceof Professional){
                			                                         Professional p = (Professional)c;
							                         p.courseComp();
							                        JOptionPane.showMessageDialog(p1, "The Course has been completed");
						}
						else{
							JOptionPane.showMessageDialog(p1,"The Course is not of Professional");
						}
					}
				}
			
			}
			catch(NullPointerException N){
				JOptionPane.showMessageDialog(p1,"Student has not been enrolled yet!","Error",JOptionPane.ERROR_MESSAGE);
			}
			catch(Exception E){
				JOptionPane.showMessageDialog(p1,"Error!","Error",JOptionPane.ERROR_MESSAGE);
			}
	}
	public void enrolStudentToCertification(){
		try{
		        String stdName = cStudentName_.getText();
		        int crscNo = Integer.parseInt(cCourseNo_.getText())-1;
		        String strtDt = cStartDate_.getText();
		        String exmDt = cExamDate_.getText();
		        String exmCntr = cExamCenter_.getText();

		        if (crscNo >= list.size() || crscNo<0){
		 	                                          JOptionPane.showMessageDialog(p1,"Error: Invalid Course Number", "Error",JOptionPane.ERROR_MESSAGE);
		        }
		        else{
		 	        Course c =list.get(crscNo);
			        if (c instanceof Certification){
				                                    Certification cf = (Certification)c; //object casting
				                                    cf.enroll(stdName,strtDt,exmDt,exmCntr);
				                                    JOptionPane.showMessageDialog(p1, "The Student has been enrolled Succesfully in Certification course");
			        } 
			        else{
				        JOptionPane.showMessageDialog(p1,"Course is not of Certification", "Information",JOptionPane.INFORMATION_MESSAGE);

			        }
		        }
		}
		catch(NumberFormatException N){
			JOptionPane.showMessageDialog(p2,"Invalid Input","Error",JOptionPane.ERROR_MESSAGE);
		}
		catch(Exception N){
			JOptionPane.showMessageDialog(p2,"Invalid Input","Error",JOptionPane.ERROR_MESSAGE);		}
	}
	
	public void display_(){
		if(list.isEmpty()){
			              JOptionPane.showMessageDialog(p2,"Input the values first!", "Information",JOptionPane.INFORMATION_MESSAGE);
		}
		else{
			for (Course c:list){
				               if (c instanceof Professional){
					       Professional p = (Professional)c;
					       p.display();
				               }
				               if(c instanceof Certification){
					                                          System.out.println("\n\n");
					                                          Certification cf = (Certification)c;
					                                          cf.display();
				               }
		        }
		}
	}
	public void clear_(){
		                description_.setText("");
		                instructorName_.setText("");
		                courseFee_.setText("");
		                courseDuration_.setText("");
		                dailyHour_.setText("");
		                studentName_.setText("");
		                enrolDate_.setText("");
		                courseNo_.setText("");
		                roomNo_.setText("");
		                downPayment_.setText("");

		                cDescription_.setText("");
		                cInstructorName_.setText("");
		                cCourseFee_.setText(""); 
		                cCourseDuration_.setText("");
		                cValidDuration_.setText("");
		                cAwardedBy_.setText("");
		                cStudentName_.setText("");
		                cStartDate_.setText(""); 
		                cCourseNo_.setText(""); 
		                cExamDate_.setText(""); 
		                cExamCenter_.setText(""); 
	}
	public static void main (String args[]) {
		                                    TrainingInstitute ti = new TrainingInstitute();
		                                    ti.course();
	}
}