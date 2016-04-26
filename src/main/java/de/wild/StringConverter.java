package de.wild;
import java.util.Scanner;

public class StringConverter {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a sentence: ");
		String line = reader.nextLine();
		reader.close();

		System.out.println(line.toUpperCase());
	}

}
