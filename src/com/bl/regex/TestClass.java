package com.bl.regex;

import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
		RegexRegistration regex = new RegexRegistration();
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Your Name: ");
		String firstName = scan.nextLine();

		regex.validateFirstName(firstName);

	}
}