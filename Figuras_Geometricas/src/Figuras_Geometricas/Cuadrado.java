package Figuras_Geometricas;

public class Cuadrado extends FigurasGeometrica {
	
	public Cuadrado(double valor1) {
		super(valor1);
		
		
	}
	
	public double getArea() {
		
		return Math.pow(this.valor1, 2);
	}
	
	
	public double getPerimetro() {
		return this.valor1*4;
		
		
		
	}
	

}
