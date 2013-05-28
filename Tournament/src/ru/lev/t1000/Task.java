package ru.lev.t1000;

import java.io.PrintWriter;
import java.util.Scanner;

/***/
public class Task {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int a = in.nextInt();
		int b = in.nextInt();
		out.println(a + b);

		out.flush();
	}
}