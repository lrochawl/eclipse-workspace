package exercicio_Classes_Rectangle_Calc;

public class Calc {
	
	public double width, height;
	
	public double area() {
		return this.height * this.width;
	}
	public double perimeter() {
		return 2 * (this.width + this.height);
	}
	public double diagonal() {
		return Math.pow(this.height, 2) + Math.pow(this.width, 2);
	}

}
