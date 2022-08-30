package Figuras_Geometricas;

public class Principal {

	
	public static void main(String[] args) {
		
		FigurasGeometrica figura;
		
		figura = new Circulo(5);
		System.out.println(figura.getClass());
		System.out.println("Area: "+figura.getArea());
		System.out.println ("Perimetro  "+figura.getPerimetro());
		figura = new Cuadrado(5);
		System.out.println(figura.getClass());
		System.out.println("Area: "+figura.getArea());
		System.out.println ("Perimetro  "+figura.getPerimetro());
		figura = new Rectangulo(5,2);
		System.out.println(figura.getClass());
		System.out.println("Area: "+figura.getArea());
		System.out.println ("Perimetro  "+figura.getPerimetro());
		figura = new Triangulo(5,2);
		System.out.println(figura.getClass());
		System.out.println("Area: "+figura.getArea());
		System.out.println ("Perimetro  "+figura.getPerimetro());
		figura = new Cubo(5);
		System.out.println(figura.getClass());
		System.out.println("Area: "+figura.getArea());
		System.out.println ("Perimetro  "+figura.getPerimetro());
		
		
		
	}
}
