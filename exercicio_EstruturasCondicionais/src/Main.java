


public class Main {
	
	//----------------- Exercicio 8
	/*
	public static void main(String[] args) {
		double salario, IR, faixaSalario;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor do sal�rio: ");
		salario = sc.nextDouble();
		IR = 0;
		faixaSalario = 0;
		if(salario > 4500.00) {
			faixaSalario = salario - 4500;
			salario = salario - faixaSalario;
			IR = (faixaSalario * 28 / 100) + IR;
			
		}
		if(salario <= 4500 && salario > 3000) {
		
			faixaSalario = salario - 3000.00;
			salario = salario - faixaSalario;
			IR = (faixaSalario * 18 / 100) + IR;
			
		}
		if(salario <= 3000 && salario > 2000) {
			
			faixaSalario = salario - 2000.00;
			salario = salario - faixaSalario;
			IR = (faixaSalario * 8 / 100) + IR;
			
		}
		if(salario <= 2000) {
			
			
			IR = (faixaSalario * 0 / 100) + IR;
			
		}
		
		
		if(IR > 0) {
			System.out.printf("R$ %.2f", IR);
		}else {
			System.out.printf("Isento");
		}
		
		
		
		
		sc.close();
	}
	*/
	//----------------- Exercicio 7
	/*
	public static void main(String[] args) {
		double x,y;
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Informe o valor de X em sguida o valor de Y ");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if(x > 0 && y > 0) {
			System.out.println("Q1");
		}
		if(x < 0 && y > 0) {
			System.out.println("Q2");
		}
		if(x < 0 && y < 0) {
			System.out.println("Q3");
		}
		if(x > 0 && y < 0) {
			System.out.println("Q4");
		}
		if(x == 0 && y == 0) {
			System.out.println("Origem");
		}
		
		
		sc.close();
	}
	*/
	//----------------- Exercicio 6
	/*
	public static void main(String[] args) {
		double intervalo;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor entre 0 e 100 ");
		intervalo = sc.nextDouble();
		
		if(intervalo <= 25) {
			System.out.println("Intervalo 0 - 25");
		} else if(intervalo <= 50) {
			System.out.println("Intervalo 25 - 50");	
		} else if(intervalo <= 75) {
			System.out.println("Intervalo 50 - 75");
		} else if(intervalo <= 100) {
			System.out.println("Intervalo 75 - 100");
		}else {
			System.out.println("Fora do intervalo");
		}
		sc.close();
	}
	
	*/
	//----------------- Exercicio 5
	/*
	public static void main(String[] args) {
		
		int quantidade, code;
		double valor, total;
		String descricao;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o codigo e a quantidade de produtos ");
		code = sc.nextInt();
		quantidade = sc.nextInt();
		valor = 0;
		descricao="";
		if(code == 1) {
			descricao = "Cachorro quente";
			valor = 4.00;
		}
		if(code == 2) {
			descricao = "X-Salada";
			valor = 4.50;			
		}
		if(code == 3) {
			descricao = "X-Bacon";
			valor = 5.00;
		}
		if(code == 4) {
			descricao = "Torrada simples";
			valor = 2.00;
		}
		if(code == 5) {
			descricao = "Refrigerante";
			valor = 1.50;
		}
		
		total  = quantidade * valor;
		
		System.out.printf("Voc� comprou %d %s e o valor total � R$%.2f ", quantidade, descricao, total);
		
		sc.close();
	}
	
	*/
	//----------------- Exercicio 4
	/*
	public static void main(String[] args) {
		
		
		int h1, h2, horas;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hora de inicio e fim do jogo?");
		h1 = sc.nextInt();
		h2 = sc.nextInt();
		horas = (24 -h1) +h2;
		
		if(horas <= 24 && horas > 1) {
			System.out.printf("O JOGO DUROU %d HORA(S)", horas);
		}else if(horas > 24 && horas < 48) {
			System.out.printf("O JOGO DUROU 1 DIA E %d HORA(S)", horas -24);
		}else if(horas < 1) {
			System.out.printf("O JOGO N�O OBTEVE DURA��O MINIMA DE 1 HORA");
		}else {
			System.out.printf("O JOGO UTRAPASSOU A QUANTIDADE DE HORAS");
		}
		
		sc.close();
	}
	*/
	//----------------- Exercicio 3
	
	/*
	public static void main(String[] args) {
		
		int N1, N2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois n�meros inteiros em ordem decrescente");
		N1 = sc.nextInt();
		N2 = sc.nextInt();
		
		if(N1 < N2) {
			if(N2 % N1 == 0) {
				System.out.println("S�o multiplos");
			}else {
				System.out.println("N�o s�o multiplos");
			}
		
		}else {
			if(N1 % N2 == 0) {
				System.out.println("S�o multiplos");
			}else {
				System.out.println("N�o s�o multiplos");
			}
		}
	}
*/
	//----------------- Exercicio 2
	/*
	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro");
		n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		
	}
	*/
	
	
	//----------------- Exercicio 1
	
	/*
	public static void main(String[] args) {
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		n = sc.nextInt();
		
		if(n < 0) {
			System.out.println("NEGATIVO");
		}else if(n > 0) {
			System.out.println("N�O NEGATIVO");
		}else {
			System.out.println("NEUTRO");
		}
		
		sc.close();
	}
	*/
	
	
	//----------------------------- Exercicio youtube
	/*
	 * 
	 * import java.util.Locale;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1, nota2, total;
		
		Locale.setDefault(Locale.US);
		Scanner  sc = new Scanner(System.in);
				
		System.out.println("Primeira nota: ");
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		
		total = nota1 + nota2;
		
		if(total < 60.00) {
			System.out.printf("NOTA FINAL = %.1f %nREPROVADO", total);
		}else {
			System.out.printf("NOTA FINAL = %.1f", total);
		}
	}
*/
}
