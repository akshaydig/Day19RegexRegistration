package com.bl.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexRegistration {
	String userFirstName = "^[A-Z][a-zA-Z]{3,}";
	String userLastName = "^[A-Z][a-zA-Z]{3,}";

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
}