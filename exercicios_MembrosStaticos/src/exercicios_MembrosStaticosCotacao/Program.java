package exercicios_MembrosStaticosCotacao;

import java.util.Locale;
import java.util.Scanner;
import util.Calc;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Calc dolar = new Calc();
		
		System.out.println("What is the dollar price? ");
		double cotar = sc.nextDouble();
		System.out.println("How many dollars will be  bought? ");
		double quantity = sc.nextDouble();
		
		double real = dolar.covertDolar(cotar, quantity);
		
		System.out.println("Amount to be paid in reais = " + real);
		sc.close();
	}

}
