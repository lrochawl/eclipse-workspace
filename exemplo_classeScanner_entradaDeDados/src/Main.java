import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		char x;
		x = sc.next().charAt(1);
		System.out.printf("Voce digitou: %s", x);

		sc.close();
	}

}
