package main;
import java.util.List;
import java.util.ArrayList;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		list.add("Maria");
		list.add("Patrícia");
		list.add("Eloane");
		list.add("Eduarda");
		list.add("Crisnanda");
		list.add("Elma");
		list.add("Elisangela");
		list.add("Natiele");
		
		list.add(1, "Lucas");
		list.remove("Lucas");
		
		for(String x : list) {
			System.out.println(x);
		}
	}

}
