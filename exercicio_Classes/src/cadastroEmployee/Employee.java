package cadastroEmployee;

public class Employee {
	public String name;
	public double grossSalary, tax;
	
	public double netSalary() {
		return this.grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		 this.grossSalary += this.grossSalary * percentage /100;
		 
		 System.out.printf("Updated data: %s, $%.2f", this.name, netSalary());
	}
}
