package application;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc  = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
 		
		System.out.println("How many employees will be registrad? ");
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			System.out.println("Emplyoee #" + (i+1)+": ");
			System.out.println("Id: ");
			Integer id = sc.nextInt();
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			list.add(emp);
			
			
		}
		
			System.out.println("Enter the emplyoee id that will have salary increase: ");
			int idSalary = sc.nextInt();  
			Integer pos = hasId(list, idSalary);
				if(pos == null) {
					System.out.println("This id does not exist! ");
				}else {
					System.out.println("Enter the percent: ");
					double percent = sc.nextDouble();
					list.get(pos).increaseSalary(percent);
				}
				
				System.out.println();
				System.out.println("List of employees: ");
			
		sc.close();

	}
	public static Integer hasId(List<Employee> list, int id) {
		for(int i =0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i ;
			}
			
		}
		
		return -1;
	
		
	}
	
}
