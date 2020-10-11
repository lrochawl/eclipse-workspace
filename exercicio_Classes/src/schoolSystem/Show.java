package schoolSystem;

import java.util.Locale;
import java.util.Scanner;

import schoolRegistration.Student;

public class Show {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();

		System.out.println("************* Cadastro de notas *************");
		System.out.println();
		System.out.print("Nome: ");
		student.name = sc.nextLine();

		for (int i = 1; i < 4; i++) {
			System.out.printf("Nota %d: ", i);
			student.sumGrade(sc.nextDouble());
		}
		
		System.out.println();
		student.showGrade();
		sc.close();
	}

}
