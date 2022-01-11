package com.bl.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bl.regex.RegexRegistrationException.ExpectedType;

public class RegexRegistration {
	String userFirstName = "^[A-Z][a-zA-Z]{3,}";
	String userLastName = "^[A-Z][a-zA-Z]{3,}";
	String userEmail = "^[A-Za-z0-9]+(.[A-Za-z0-9]+)*@[^_\\W]+(.[^_\\W]+)?(?=(.[^_\\W]{3,}$|.[a-zA-Z]{2}$)).*$";
	String userMobileNumber = "^[0-9]{2}[\\s][0-9]{10}";
	String userPassword = "^(?=.*[0-9])(?=.*[!@#$%&^*)_(+}{?>:<]){1}+(?=.*[A-Z])([0-9A-Za-z]).{8,}$";
	
	public boolean validateFirstName(String firstName) throws RegexRegistrationException {
		Pattern pattern = Pattern.compile(userFirstName);
		Matcher matcher = pattern.matcher(firstName);
		try {
			if(matcher.matches()) {
				return true;
			}else {
				throw new RegexRegistrationException("Enter Valid First Name ",ExpectedType.FIRSTNAME);
			}
		} catch (RegexRegistrationException e) {
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean validateLastName(String lastName) throws RegexRegistrationException {
		Pattern pattern = Pattern.compile(userLastName);
		Matcher matcher = pattern.matcher(lastName);
		try {
			if(matcher.matches()) {
				return true;
			}else {
				throw new RegexRegistrationException("Enter Valid Last Name ",ExpectedType.LASTNAME);
			}
		} catch (RegexRegistrationException e) {
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean validateEmail(String email) throws RegexRegistrationException {
		Pattern pattern = Pattern.compile(userEmail);
		Matcher matcher = pattern.matcher(email);
		try {
			if(matcher.matches()) {
				return true;
			}else {
				throw new RegexRegistrationException("Enter Valid Email",ExpectedType.EMAIL);
			}
		} catch (RegexRegistrationException e) {
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean validateMobileNumber(String mobileNumber) throws RegexRegistrationException {
		Pattern pattern = Pattern.compile(userMobileNumber);
		Matcher matcher = pattern.matcher(mobileNumber);
		try {
			if(matcher.matches()) {
				return true;
			}else {
				throw new RegexRegistrationException("Enter Valid MobileNumber",ExpectedType.MOBILENUMBER);
			}
		} catch (RegexRegistrationException e) {
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean validatePassword(String password) throws RegexRegistrationException {
		Pattern pattern = Pattern.compile(userPassword);
		Matcher matcher = pattern.matcher(password);
		try {
			if(matcher.matches()) {
				return true;
			}else {
				throw new RegexRegistrationException("Enter Valid Password",ExpectedType.PASSWORD);
			}
		} catch (RegexRegistrationException e) {
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	}
}