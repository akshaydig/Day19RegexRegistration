package com.bl.regex;

import com.bl.Interface.I_ValidateEmail;
import com.bl.Interface.I_ValidateMobileNumber;
import com.bl.Interface.I_ValidatePassword;
import com.bl.Interface.I_ValidateFirstName;
import com.bl.Interface.I_ValidateLastName;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bl.regex.UserValidationException.ExpectedType;

public class UserValidation {
	String userFirstName = "^[A-Z][a-zA-Z]{3,}";
	String userLastName = "^[A-Z][a-zA-Z]{3,}";
	String userEmail = "^[A-Za-z0-9]+(.[A-Za-z0-9]+)*@[^_\\W]+(.[^_\\W]+)?(?=(.[^_\\W]{3,}$|.[a-zA-Z]{2}$)).*$";
	String userMobileNumber = "^[0-9]{2}[\\s][0-9]{10}";
	String userPassword = "^(?=.*[0-9])(?=.*[!@#$%&^*)_(+}{?>:<]){1}+(?=.*[A-Z])([0-9A-Za-z]).{8,}$";

	// Validate First Name We use Lambda Function We Use Interface We use Exception
	// To Catch Error
	public I_ValidateFirstName validateFirstName = (String firstName) -> {
		Pattern pattern = Pattern.compile(userFirstName);
		Matcher matcher = pattern.matcher(firstName);
		try {
			if (matcher.matches()) {
				return true;
			} else {
				throw new UserValidationException("Enter Valid First Name ", ExpectedType.FIRSTNAME);
			}
		} catch (UserValidationException e) {
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	};

	// Validate last Name We use Lambda Function We Use Interface We use Exception
	// To Catch Error
	public I_ValidateLastName validateLastName = (String lastName) -> {
		Pattern pattern = Pattern.compile(userLastName);
		Matcher matcher = pattern.matcher(lastName);
		try {
			if (matcher.matches()) {
				return true;
			} else {
				throw new UserValidationException("Enter Valid Last Name ", ExpectedType.LASTNAME);
			}
		} catch (UserValidationException e) {
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	};

	// Validate Email We use Lambda Function We Use Interface We use Exception To
	// Catch Error
	public I_ValidateEmail validateEmail = (String email) -> {
		Pattern pattern = Pattern.compile(userEmail);
		Matcher matcher = pattern.matcher(email);
		try {
			if (matcher.matches()) {
				return true;
			} else {
				throw new UserValidationException("Enter Valid Email", ExpectedType.EMAIL);
			}
		} catch (UserValidationException e) {
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	};

	// Validate Mobile Number We use Lambda Function We Use Interface We use
	// Exception To Catch Error
	public I_ValidateMobileNumber validateMobileNumber = (String mobileNumber) -> {
		Pattern pattern = Pattern.compile(userMobileNumber);
		Matcher matcher = pattern.matcher(mobileNumber);
		try {
			if (matcher.matches()) {
				return true;
			} else {
				throw new UserValidationException("Enter Valid MobileNumber", ExpectedType.MOBILENUMBER);
			}
		} catch (UserValidationException e) {
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	};

	// Validate Password We use Lambda Function We Use Interface We use Exception To
	// Catch Error
	public I_ValidatePassword validatePassword = (String password) -> {
		Pattern pattern = Pattern.compile(userPassword);
		Matcher matcher = pattern.matcher(password);
		try {
			if (matcher.matches()) {
				return true;
			} else {
				throw new UserValidationException("Enter Valid Password", ExpectedType.PASSWORD);
			}
		} catch (UserValidationException e) {
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	};
}