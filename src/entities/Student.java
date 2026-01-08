package entities;

import java.util.Objects;
import java.util.Random;

public class Student {
	// Attributi statici
	public static int numStudentiCreati = 0;
	// Attributi di istanza
	public int id;
	public String name;
	public String surname;
	public boolean isFullTime;
	public StudentType studentType;

	// Costruttori
	public Student(String name, String surname, boolean isFullTime, StudentType studentType) {
		this.name = name;
		this.surname = surname;
		this.isFullTime = isFullTime;
		this.studentType = studentType;
		Random rndm = new Random();
		this.id = rndm.nextInt(1, 10000);
		numStudentiCreati++;
	}

	// Metodi statici
	// Metodi di istanza

	// Per farlo generare automaticamente ad intelliJ
	// Tasto dx -> generate -> toString()
	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", isFullTime=" + isFullTime +
				", studentType=" + studentType +
				'}';
	}

	// Per farlo generare automaticamente ad intelliJ
	// Tasto dx -> generate -> equals() and hashCode() (quest'ultimo però non ci serve)

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return id == student.id &&
				isFullTime == student.isFullTime &&
				Objects.equals(name, student.name) &&
				Objects.equals(surname, student.surname) &&
				studentType == student.studentType;
	}

}
