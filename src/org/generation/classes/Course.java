package org.generation.classes;

import java.util.ArrayList;
import java.util.List;

public class Course {
	//propiedades
	String courseName;
	String profesorName;
	int year;
	
	List<Student> enrolledStudnent = new ArrayList<>(  );
	
	public void enroll(Student student){
	      enrolledStudnent.add(student);
	   }//Metodo para agregar al estudiante

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
				best= student.grade;
				if (best> student.grade) {
					best=student.grade;
				}
			}
	       return best;
	   }
}
