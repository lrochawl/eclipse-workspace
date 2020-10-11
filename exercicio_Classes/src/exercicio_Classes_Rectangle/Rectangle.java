package exercicio_Classes_Rectangle;

import java.util.Locale;
import java.util.Scanner;
import exercicio_Classes_Rectangle_Calc.Calc;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Calc retangulo = new Calc();
		
		System.out.println("Enter rectangle with and height: ");
		retangulo.height = sc.nextDouble();
		retangulo.width  = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", retangulo.area());
		System.out.printf("PERIMETER = %.2f%n", retangulo.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());
		
		sc.close();
	}

}
