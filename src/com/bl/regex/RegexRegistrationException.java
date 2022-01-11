package com.bl.regex;

public class RegexRegistrationException extends Exception {
	public ExpectedType type;

	public enum ExpectedType {
		FIRSTNAME, LASTNAME, MOBILENUMBER, EMAIL, PASSWORD
	}

	public RegexRegistrationException(String message, ExpectedType type) {
		super(message);
		this.type = type;
	}
}