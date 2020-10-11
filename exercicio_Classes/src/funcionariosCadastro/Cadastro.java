package funcionariosCadastro;


import java.util.Scanner;
import java.util.Locale;
import cadastroEmployee.Employee;

public class Cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee func = new Employee();
		
		System.out.println("------ Cadastro de Funcionários ");
		System.out.println();
		
		System.out.print("Nome: ");
		func.name = sc.nextLine();
		System.out.print("Gross salary: ");
		func.grossSalary = sc.nextDouble();
		System.out.print("Tax:");
		func.tax = sc.nextDouble();
		System.out.println();
		System.out.printf("Employ: %s, %.2f%n", func.name, func.netSalary());
		System.out.println("----------------------*------------------------");
		System.out.print("Witch percentage to increse salary? ");
		double percentage = sc.nextDouble(); 
		func.increaseSalary(percentage);
		
		sc.close();
	}

}
