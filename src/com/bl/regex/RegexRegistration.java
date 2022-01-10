package com.bl.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexRegistration {
	String userFirstName = "^[A-Z][a-zA-Z]{3,}";
	String userLastName = "^[A-Z][a-zA-Z]{3,}";
	String userEmail = "^[A-Za-z0-9_-]+([.][A-Za-z0-9_-]+)@[A-Za-z]+[A-Za-z]+([.][A-Za-z]+)$";
	String userMobileNumber = "^[0-9]{2}[\\s][0-9]{10}";
	String userPassword = "^(?=.*[0-9])(?=.*[!@#$%&^*)_(+}{?>:<]){1}+(?=.*[A-Z])([0-9A-Za-z]).{8,}$";

	public void validateFirstName(String firstName) {
		Pattern pattern = Pattern.compile(userFirstName);
		Matcher matcher = pattern.matcher(firstName);
		System.out.println(matcher.matches());
	}

	public void validateLastName(String lastName) {
		Pattern pattern = Pattern.compile(userLastName);
		Matcher matcher = pattern.matcher(lastName);
		System.out.println(matcher.matches());
	}

	public void validateEmail(String email) {
		Pattern pattern = Pattern.compile(userEmail);
		Matcher matcher = pattern.matcher(email);
		System.out.println(matcher.matches());
	}

	public void validateMobileNumber(String mobileNumber) {
		Pattern pattern = Pattern.compile(userMobileNumber);
		Matcher matcher = pattern.matcher(mobileNumber);
		System.out.println(matcher.matches());
	}

	public void validatePassword(String password) {
		Pattern pattern = Pattern.compile(userPassword);
		Matcher matcher = pattern.matcher(password);
		System.out.println(matcher.matches());
	}
}