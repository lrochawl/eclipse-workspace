package entities;

public class CadastraQuarto {
	
	private String name, email;
	private int quarto;

	public CadastraQuarto(String name, String email, int quarto ) {
		this.name = name;
		this.email = email;
		this.quarto = quarto;
	}
	
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	public int getQuarto() {
		return this.quarto;
	}
	
}
