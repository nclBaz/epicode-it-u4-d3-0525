package entities;

public class Circle {

	public static double x;
	// LISTA ATTRIBUTI
	public double radius;
	public double y;

	// LISTA COSTRUTTORI
	// Sono metodi speciali che si usano esclusivamente in fase di creazione dell'oggetto, e servono principalmente per inizializzare
	// gli attributi degli oggetti in fase di creazione. Nel nostro caso ad esempio possiamo creare un costruttore che assegni dei valori a
	// raggio, x, y

	// I COSTRUTTORE
	public Circle() { // new Circle();
	}

	// II COSTRUTTORE
	public Circle(double radius) { // new Circle(2.4);
		this.radius = radius;
		Circle.x = 0.0;
		this.y = 0.0;
	}

	// III COSTRUTTORE
	public Circle(double radius, double x, double y) { // new Circle(1.5, 0.0, 1.3);
		this.radius = radius;
		Circle.x = x;
		this.y = y;
	}

	public static double getX() {
		return x;
	}

	// LISTA METODI
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}

	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}

	public double getDiameter() {
		return 2 * this.radius;
	}

	public void printAreaAndPerimeter() {
		System.out.println("Il perimetro è: " + this.getPerimeter());
		System.out.println("L'area è: " + this.getArea());
	}
}
