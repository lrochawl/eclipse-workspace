
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String categoria, descricao, marca, caracteristicas, sintoma, descreveSintoma;
		
		categoria = "Eletroeletronico (Video)";
		descricao = "Smart TV";
		marca	  = "Sony";
		caracteristicas = "fonte externa";
		sintoma			= "n�o liga";
		descreveSintoma	= "pisca 3x";
		
		
		
		if(categoria != "") {
			System.out.printf("*********** Bem vindo ao Sr. Avaliador ***********%n%n");
			System.out.printf("Selecionado a categoria %s %n", categoria);
			
			if(descricao != "") {
				System.out.printf("Informe agora a marca da sua %s %n", descricao);
				
				if(marca != "") {
					System.out.printf("Para realizar a analise de funcionamento de um aparelho %s preciso de algumas caracteristicas de funciomaneto do aparelho %n%n", marca);
					if(caracteristicas != "") {
						System.out.printf("---------- Ufa, s�o muitas perguntas n�o � verdade? ------ %n");
						System.out.printf("mas n�o se preocupe estamos na reta final");
						System.out.printf("Agora preciso do sintoma que esta sendo apresentado pelo aparelho informado %n");
						if(sintoma != "") {
							if(descreveSintoma != "") {
								
							}else {
								
							}
						}else {
							
						}
					}else {
						System.out.printf("Pode informar se qual a tens�o de funcionamento (110v, 220v ou automantica), cabo de for�a fixo ou removivel, fonte interna ou externa");
						System.out.printf("Me passando mais detalhes sobre a forma de funcionamento do aparelho posso ajudar melhor a resolver o problema...");
					}
				}else {
					System.out.printf("Especifique a marca do aparelho para continuar");
				}
			}else {
				System.out.printf("Informe a descri��o do aparelho para continuar");
			}
		}else {
			System.out.printf("Comece informando a categoria do aparelho");
		}
	
	}

}
