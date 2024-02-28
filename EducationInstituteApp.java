package com.logic_session;

import java.util.Scanner;

//Course class representing a course offered by the education institute
class Course 
{
private int id;
private String name;
private double fee;
public Course(int id, String name, double fee)
{
  this.id=id;
  this.name=name;
  this.fee=fee;
}
  public int getId()
  {
      return id;
  }
   public String getName()
  {
      return name;
  }
   public double getfee()
  {
      return fee;
  }
  /*public String toString()
  {
      return " "+id+"."+name+"-Fee:"+fee;
  }*/
}



//Offer class representing a special offer provided by the education institute
class Offer 
{
	//declare atributes and develop constructor and getter method
private String offerText;
public Offer(String offerText)
{
  this.offerText=offerText;
}

public String getOfferText()
{
  return offerText;
}
/*public String toString()
  {
      return offerText;
  }*/
}

//EducationInstitute class managing courses, offers, and student enrollment
class EducationInstitute 
{
  Course[] courses;
  Offer[]  offers;
  
  public EducationInstitute(Course[] courses, Offer[] offers) {
		super();
		this.courses = courses;
		this.offers = offers;
	}
  public Course[] getCourses() {
		return courses;
	}
	public Offer[] getOffers() {
		return offers;
	}
  
 public void  enrollStudentInCourse(int courseId, String studentName)
 {
	 for(int i=0;i<courses.length;i++)
	 {
		 if(courseId == courses[i].getId())
		 {
     System.out.println(studentName+ " enroll a course: "+courses[i].getName());
     System.out.println("------------------------------------------------");
		 }
	 }
 }
}

//Student class representing a student who interacts with the education institute
class Student implements Runnable
{
String name;
EducationInstitute institute ;
Student(String name, EducationInstitute institute)
{
  this.name=name;
  this.institute=institute;
}
public void viewCoursesAndFees()
{
  System.out.println("Available Courses:");
  for(Course c:institute.getCourses())
  {
      System.out.println(" "+c.getId()  +"."+c.getName()+"-Fee:"+c.getfee());
  }
}

public void viewOffers()
{
    System.out.println("Ongoing Offers:");
    for(Offer o:institute.getOffers())
  {
      System.out.println(" "+o.getOfferText());
  }

}
public void enrollInCourse(int courseId)
{
  institute.enrollStudentInCourse(courseId,name);
}
@Override
public void run() 
{
	viewCoursesAndFees();
	viewOffers();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter id you want to buy:");
	int courseId=sc.nextInt();
	enrollInCourse(courseId);
	
}
}

//EducationInstituteApp class as the main program
public class EducationInstituteApp 
{
	public static void main(String[] args) throws InterruptedException  
	{
	Course c1=new Course(1,"Mathematics",1000.0);
	Course c2=new Course(2,"Science",1200.0);
	Course c3=new Course(3,"English"  ,900.0);
	Offer o1=new Offer("Special discount: Get 20% off on all courses!");
	Offer o2=new Offer("Limited time offer: Enroll in any two courses and get one course free!");
   Course[] c4={c1,c2,c3};
    Offer[]  o3={o1,o2};
  EducationInstitute e1=new EducationInstitute(c4,o3);
  Student s1=new Student("alice",e1);
  Student s2=new Student("John",e1);
  Thread t1=new Thread(s1);
  Thread t2=new Thread(s2);
  t1.start();
  t1.join();
  t2.start();
	
	}
}
