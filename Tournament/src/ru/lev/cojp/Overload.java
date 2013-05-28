package ru.lev.cojp;

public class Overload {
	public void method(Object o) {
		System.out.println("Object");
	}

	public void method(java.io.IOException i) {
		System.out.println("IOException");
	}

	public void method(java.io.FileNotFoundException f) {
		System.out.println("FileNotFoundException111");
	}

	public static void main(String args[]) {
		Overload test = new Overload();
		test.method(null);
	}
}