import java.util.Scanner;

public class Main {
	// Exercicio 3
	public static void main(String[] args) {
		
		int code, alcool, gasolina, diesel;
		
		
		Scanner sr = new Scanner(System.in);
		
		code	 = 0;
		alcool   = 0;
		gasolina = 0;
		diesel	 = 0;
		while(code != 4) {
		
		System.out.println("Vota��o - preferencia de combustivel ");
		System.out.println("1.�lcool 2.Gasolina 3.Diesel 4.Fim ");
		code = sr.nextInt();
			
			while(code > 4) {
				System.out.println("c�digo inv�lido (fora da faixa de 1 a 4) ");
				code = sr.nextInt();
			}
		if(code == 1) {
			alcool += 1;
			System.out.println("Voc� selecionou �lcool");
		}
		if(code == 2) {
			gasolina += 1;
			System.out.println("Voc� selecionou Gasolina");
		}
		if(code == 3) {
			diesel += 1;
			System.out.println("Voc� selecionou Diesel");
		}
		
		}
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d%n", alcool);
		System.out.printf("Gasolina: %d%n", gasolina);
		System.out.printf("Diesel: %d%n", diesel);
		
		
	
		sr.close();
}
	
	
	// Exercicio 2
	/*
	public static void main(String[] args) {
		
		double x, y;
		String cord;
		
		Scanner sn = new Scanner(System.in);
		
		System.out.println(" Digite as coodenadas X e Y do plano cartesiano");
		x = sn.nextDouble();
		y = sn.nextDouble();
		
		while(x != 0 && y != 0) {
			
			
			if(x > 0 && y > 0) {
				System.out.println(" Primeiro");
			}
			if(x < 0 && y > 0) {
				System.out.println("Segundo");
							
			}
			if(x < 0 && y < 0) {
				
				System.out.println("Terceiro");
			}
			if(x > 0 && y < 0) {
				
				System.out.println("Quarto");
			}
			System.out.println(" Digite novas coodenadas X e Y do plano cartesiano");
			x = sn.nextDouble();
			y = sn.nextDouble();
			
		}
	}
	*/
	// Exercicio 1
	/*
	public static void main(String[] args) {
		
		int senha;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua senha");
		
		senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha Invalida");
			System.out.println("Digite a senha novamente");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso permitido");
	
		sc.close();
	}
*/
}
