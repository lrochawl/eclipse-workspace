import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		/*
		 double largura, comprimento, valor, resultValor, tamanho;
		System.out.println("Informe a largura e comprimento do terreno em (m) ");
		largura = sc.nextDouble();
		comprimento = sc.nextDouble();
		System.out.println("Informe a o valor cobrado por metro (R$) ");
		valor = sc.nextDouble();
		tamanho = largura * comprimento;
		resultValor = tamanho * valor;
		System.out.printf("A area do terreno � de %.2f e o valor total do terreno � de R$ %.2f %n %n", tamanho,
				resultValor);
		
		//------------------------------ exercicio 1-------------------------------------
		
		int n1, n2, n3, n4, n5, n6, r1, r2,r3;
		
		System.out.println("Informe dois numeros:");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		System.out.println("Pouco, informe mais dois n�meros");
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		System.out.println("Ta pegando leve, informe mais dois");
		n5 = sc.nextInt();
		n6 = sc.nextInt();
		
		r1 = n1 + n2;
		r2 = n3 + n4;
		r3 = n5 + n6;
		
		System.out.println("-------------- Saida ------------------");
		System.out.printf("SOMA = %d %n", r1);
		System.out.printf("SOMA = %d %n", r2);
		System.out.printf("SOMA = %d %n %n", r3);
		
		//-----------------------------Exerciocio 2 -------------------------------
		
		double pi, raio, area; 
		pi = Math.PI;
		
		System.out.println("Informe o Raio deste circulo que eu calcularei a area");
		raio = sc.nextDouble();
		area = pi * Math.pow(raio, 2);
		System.out.println("PI = " + pi);
		System.out.printf("A = %.4f", area);
		
		*/
		
		//------------------------------ Exercicio 3 -----------------------------------
		/*
		 int A, B, C, D, R;
		
		System.out.println("Informe quatro numeros: ");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		R = (A * B) - (C * D);
		System.out.println("DIFEREN�A = " + R);
		

	

		
		// ------------------------------ Exerciocio 4 ---------------------------------------
		int func;
		double H, V, TA;
		
		System.out.println("N�mero do funcionario, horas trabalhadas, valor da hora");
		func = sc.nextInt();
		H	 = sc.nextDouble();
		V	 = sc.nextDouble();
		TA	 = H * V;
		System.out.printf("NUMBER = %d %nSALARY = U$ %.2f", func, TA);
	
		// ------------------------------ Exerciocio 5 ---------------------------------------
		
		int c1, qP1, c2, qP2;
		double vP1, vTP1, vP2, vTP2, vT;
		
		System.out.println("Codigo da pe�a, numero da pe�a, pre�o (R$)");
		
		c1   = sc.nextInt();
		qP1  = sc.nextInt();
		vP1  = sc.nextDouble();
		vTP1 = qP1 * vP1;
		
		System.out.println("Codigo da pe�a, numero da pe�a, pre�o (R$)");
		
		c2   = sc.nextInt();
		qP2  = sc.nextInt();
		vP2  = sc.nextDouble();
		vTP2 = qP2 * vP2;
		
		vT = vTP1 + vTP2;
		
		System.out.printf("VALOR TOTAL A PAGAR: R$ %.2f", vT);
		
		*/
		
		//------------------------------ Exercicio 6 ---------------------------------------
		
		double A, B, C;
		double pi = Math.PI;
		double aTriangulo, aCirculo, aTrapezio, aQuadrado, aRetangulo; 
		
		System.out.println("Informe tres valores");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		aTriangulo = (A * C) / 2 ;
		aCirculo   = pi * Math.pow(C, 2) ;
		aTrapezio  = (A+B)/2 * C ;
		aQuadrado  = Math.pow(B, 2);
		aRetangulo = A * B;
		
		System.out.printf("TRI�NGULO: %.3f %nCIRCULO: %.3f %nTRAPEZ�O: %.3f %nQUADRADO: %.3f %nRET�NGULO: %.3f", aTriangulo, aCirculo, aTrapezio, aQuadrado, aRetangulo);
		
		
		
		sc.close();
		
	}
}
