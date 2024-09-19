package or.generation;

import org.generation.classes.Course;
import org.generation.classes.Student;

public class MainCourse {

	public static void main(String[] args) {
		Course course = new Course("Ciencias","Pepe Jimenez", 2024);
		
		//Estudiantes
		Student studen1= new Student("Jorge","Perez",2010,86,1);
		Student studen2= new Student("Paco","Olivares",2010,55,1);
		Student studen3= new Student("Jorge","Perez",2010,70,1);
		
		//Agregar los estudiantes a los cursos
		course.enroll(studen1);
		course.enroll(studen2);
		course.enroll(studen3);
		
		//Contar estudiantes
		System.out.println(course.countStudents());
		
		//imprime el alumno 2
		System.out.println(studen2.toString());
		//Mejor promedio
		System.out.println(course.bestGrade());
		
		//Eliminar estudiante
		course.unEnroll(studen2);
		//Contar estudiante
		System.out.println(course.countStudents());
		
		//Sobrecarga
        Student[] studentsArray = {studen1, studen2, studen3};
        course.enroll(studentsArray);
        //contar estudiantes
        System.out.println(course.countStudents());


	}//main

}//class main
