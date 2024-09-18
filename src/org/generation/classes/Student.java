package org.generation.classes;

public class Student {
	//Propiedades
	 String firstName;
     String lastName;
     int registration;
     int grade;
     int year;

	public void printFullName(String firstName, String lastName){
	      System.out.println(firstName +" "+ lastName);
	   }//Metodo para imprimir el nombre completo del estudiante

   public void isApproved(int grade){
       //TODO implement: should return true if grade >= 60
	   boolean aprovado;
		   if (grade>=60) {
			aprovado=true;
		}else {
			aprovado=false;
		}   
		   System.out.println(aprovado);
   }//Metodo para aprovar al estudiante

   public int changeYearIfApproved(int grade, int year){
		   if (grade>=60) {
			year=year+1;
			System.out.println("Congratulations");
			return year;
		} else {
			System.out.println("No approved");
			return year;
		}
	   
   }//Metodo para el cambio del year del estudiante

	public Student(String firstName, String lastName, int registration, int grade, int year) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.grade = grade;
		this.year = year;
	}//constructor
	
	public Student(String firstName, String lastName) {
		this(firstName, lastName, 2018, 3,2014);
	}//Constructor
	
	
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", registration=" + registration
				+ ", grade=" + grade + ", year=" + year + "]";
	}//constructor

	
     
     
}
