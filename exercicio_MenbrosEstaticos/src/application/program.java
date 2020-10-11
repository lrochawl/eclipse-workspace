package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calc;
public class program {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Radius: ");
		double radius = sc.nextDouble();
		
		double c = Calc.circumference(radius);
		
		double v = Calc.volume(radius);
		
		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calc.PI);
		
		sc.close();
	}
	
	

}
