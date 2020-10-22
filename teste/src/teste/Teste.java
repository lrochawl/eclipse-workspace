package teste;

public class Teste {

	public String nome;
	public int salario, id;
	
	public Teste(String nome, int id){
		this.nome = nome;
		this.id = id;
	}
	
	public void setAumento(int percentual) {
		this.salario = this.salario + this.salario * percentual / 100;
	}

}
