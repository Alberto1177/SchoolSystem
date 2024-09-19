package org.generation.classes;

import java.util.ArrayList;
import java.util.List;

public class Course {
	//propiedades
	String courseName;
	String profesorName;
	int year;
	
	
	
	public Course(String courseName, String profesorName, int year) {
		this.courseName = courseName;
		this.profesorName = profesorName;
		this.year = year;
	}//Constructor

	List<Student> enrolledStudnent = new ArrayList<>(  );
	
	public void enroll(Student student){
	      enrolledStudnent.add(student);
   }//Metodo para agregar al estudiante
	
	public void enroll(Student[] students){
	      for (Student student : students) {
	    	  enrolledStudnent.add(student);
		}
	}//Metodo para agregar estudiantes

   public void unEnroll(Student student){
      enrolledStudnent.remove(student);
   }//Metodo para eliminar al estudiante

   public int countStudents(){
	   int total=0;
       for (Student student : enrolledStudnent) {
			total=total+1;
		}
       return total;
   }//Metodo para contar los estudiantes
   
   public int bestGrade(){
       int best=0;
       for (Student student : enrolledStudnent) {
			if (student.grade>best) {
				best=student.grade;
			}
		}
       return best;
   }//Metodo que devuelve el mejor promedio
}
