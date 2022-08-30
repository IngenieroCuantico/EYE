package Figuras_Geometricas;

public class Circulo extends FigurasGeometrica{
	
	public Circulo(double valor1) {
		
		super(valor1);
	}

	
	public double getArea() {
		return Math.PI*Math.pow(this.valor1, 2);
	}
	
	
	public double getPerimetro() {
		return Math.PI+this.valor1;
	}
}
