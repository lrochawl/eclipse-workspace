package exercicio_JavaList;

import java.util.ArrayList;
import java.util.List; 

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> alunos = new ArrayList<>();
		
		alunos.add("Patricia");
		alunos.add("Crisnanda");
		alunos.add("Eloane");
		alunos.add("Leticia");
		alunos.add("Elma");
		alunos.add("Elisangela");
		alunos.add("Jaqueline");
		alunos.add("Ana Gabriela");
		alunos.add("Ingrid Daiane");
		alunos.add("Lucas Rocha");
		
		System.out.println("Número de alunos " + alunos.size() + "\n");
		int i = 0;
		for (String aluno : alunos) {
			i++;
			System.out.printf("Aluno %d: %s\n",i ,aluno);
		}
		
		System.out.println();
		System.out.println("*****************************************");
		System.out.println();
		
		alunos.removeIf(x -> x.charAt(0) == 'A');
		i = 0;
		for (String aluno : alunos) {
			i++;
			System.out.printf("Aluno %d: %s\n",i ,aluno);
		}
		System.out.println();
		System.out.println("*****************************************");
		System.out.println();
				
		System.out.println("A aluna Patricia está que qual posição da lista? " + (alunos.indexOf("Patricia")+1));
		System.out.println("A aluna Eloane esta em qual posição da lista? " + (alunos.indexOf("Eloane") + 1));
		System.out.println();
		System.out.println("******************************************");
		
		List<String> result = alunos.stream().filter(aluno -> aluno.charAt(0) == 'A').collect(Collectores.toList);
		for (String aluno : result) {
			i++;
			System.out.printf("Aluno %d: %s\n",i ,aluno);
		}
		
		

	}

}
