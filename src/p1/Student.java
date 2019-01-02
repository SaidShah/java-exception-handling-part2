package p1;

import java.util.Scanner;

public class Student {
	private String name;
	private double gpa;
	private Scanner keyboard = new Scanner(System.in);
	private Grade[] coursesTook;//
	private Grade[] coursesToTake;
	private Grade[] coursesTaking;
	private final double MAX_GPA = 4.0;
	private final double MIN_GPA = 0.0;

	public Student(String name, double gpa) {
		super();
		this.name = name;
		checkGpa(gpa);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		checkGpa(gpa);
	}

	private void checkGpa(double gpa) {
		/*
		 * if (gpa < MIN_GPA) { try { throw new
		 * GpaTooSmallException("Invalid GPA! Gpa is less than 0.0"); } catch
		 * (GpaTooSmallException e) { // e.printStackTrace();
		 * System.out.println(e.getMessage()); } } else if (gpa > MAX_GPA) { try
		 * { throw new
		 * GpaTooBigException("Invalid GPA! Gpa is larger than 4.0"); } catch
		 * (GpaTooBigException e) { // e.printStackTrace();
		 * System.out.println(e.getMessage()); } } else { this.gpa = gpa; }
		 */
		if (gpa < MIN_GPA) {
			try {
				throw new InvalidGpaException("Gpa entered is too Small");
			} catch (InvalidGpaException e) {
				System.out.println(e.getMessage());
				getNewGpa();
			}
		} else if (gpa > MAX_GPA) {
			try {
				throw new InvalidGpaException("Gpa entered is too big");
			} catch (InvalidGpaException e) {
				System.out.println(e.getMessage());
				getNewGpa();
			}
		} else {
			this.gpa = gpa;
		}
	}

	private void getNewGpa() {
		double tempGpa = 0.0;
		do {
			System.out.println("Please re-enter a valid the GPA ");
			tempGpa = keyboard.nextDouble();
		} while (tempGpa < 0.0 || tempGpa > 4.0);
		this.gpa = tempGpa;
	}

	@Override
	public String toString() {
		return "Student Name: " + name + ", GPA: " + gpa;
	}

}
