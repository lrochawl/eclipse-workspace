package entities;

public class CadastraQuarto {
	
	private String name, email;
	private int quarto;

	public CadastraQuarto(String name, String email) {
		this.name = name;
		this.email = email;
		
	}
	
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	
	
}
