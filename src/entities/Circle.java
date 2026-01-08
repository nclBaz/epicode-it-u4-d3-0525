package entities;

public class Circle {

	// LISTA ATTRIBUTI
	public double radius;
	public double x;
	public double y;

	// LISTA COSTRUTTORI
	// Sono metodi speciali che si usano esclusivamente in fase di creazione dell'oggetto, e servono principalmente per inizializzare
	// gli attributi degli oggetti in fase di creazione. Nel nostro caso ad esempio possiamo creare un costruttore che assegni dei valori a
	// raggio, x, y

//	public Circle() { // new Circle();
//	}

	public Circle(double radius, double x, double y) { // new Circle(1.5, 0.0, 1.3);
		this.radius = radius;
		this.x = x;
		this.y = y;
	}

	public Circle(double radius) { // new Circle(2.4);
		this.radius = radius;
		this.x = 0.0;
		this.y = 0.0;
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
