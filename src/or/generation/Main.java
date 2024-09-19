package or.generation;

import org.generation.classes.Student;

public class Main {

	public static void main(String[] args) {
		Student student = new Student("Mario","Valverde",2020, 70, 2023);
		
		student.printFullName("Mario", "Valverde");//Imprime el nombre completo
		student.isApproved(70);//Devuelve true
		System.out.println(student.changeYearIfApproved(70, 2022));//Devuelve mensaje y el year
		
		System.out.println(student.toString());
		
	}

}
