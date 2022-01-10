package com.bl.regex;

import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
		RegexRegistration regex = new RegexRegistration();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Your Email: ");
		String email = scan.nextLine();
		
		regex.validateEmail(email);
		
	}
}