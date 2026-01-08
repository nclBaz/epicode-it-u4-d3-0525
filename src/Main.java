import entities.Circle;
import entities.Student;
import entities.StudentType;

public class Main {
	public static void main(String[] args) {
		Circle c1 = new Circle(); // I COSTRUTTORE
		System.out.println(c1);
		System.out.println(c1.radius);
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getArea());
//
//		Circle c2 = new Circle(2.4); // II COSTRUTTORE
//		System.out.println(c2.radius);
//		System.out.println(c2.getPerimeter());
//		System.out.println(c2.getArea());
//
//		Circle c3 = new Circle(1.5, 1.0, 0.0); // III COSTRUTTORE
//		System.out.println(c3.radius);
//		System.out.println(c3.getPerimeter());
//		System.out.println(c3.getArea());
//		System.out.println(c3.getDiameter());
//
//		Circle c4 = new Circle(20, 100.0, 0.4); // III COSTRUTTORE
//		System.out.println(c4.radius);
//		c4.radius = 1000;
//		System.out.println(c4.getDiameter());
//		System.out.println(c4.getPerimeter());
//		System.out.println(c4.getArea());
//		c4.printAreaAndPerimeter();
//
//
//		System.out.println(Circle.x);
//		Circle.x = 10;
//		System.out.println(Circle.x);
//
//		Circle.getX();

		Student s1 = new Student("Aldo", "Baglio", true, StudentType.BACKEND);
		Student s2 = new Student("Giovanni", "Storti", false, StudentType.FRONTEND);
		Student s3 = new Student("Giacomo", "Poretti", true, StudentType.ALTRO);

		// ------------------------------------------------ STAMPA IN CONSOLE DI OGGETTI ----------------
		// Il comportamento di default di Java è quello di stampare l'oggetto rappresentato con
		// nomepackage.NomeClasse@identificativoOggetto entities.Student@5b480cf9
		// Se non mi sta bene questo comportamento devo andare a definire un metodo .toString() nella classe

		System.out.println(s1); // quando passo un oggetto ad un println verrà invocato automaticamente il suo metodo .toString()
		System.out.println(s2);
		System.out.println(s3);

		// ---------------------------------------------------- COMPARAZIONE TRA 2 OGGETTI --------------------
		// La maniera corretta di comparare 2 oggetti è, come per le Stringhe, usare .equals() (e non ==)
		// L'operatore == confronta le celle di memoria, se i 2 oggetti sono nella stessa cella, allora == tornerà true
		Student s4 = new Student("Giacomo", "Poretti", true, StudentType.ALTRO);
		//Student s4 = s3;

		// if (s3 == s4) System.out.println("Gli studenti sono uguali");
		if (s3.equals(s4)) System.out.println("Gli studenti sono uguali");
		else System.out.println("Sono diversi");


	}

//	public static boolean checkAnnoBisestile(int anno) {
//		return true;
//	}
}
