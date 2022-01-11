package com.bl.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bl.regex.UserValidation;
import com.bl.regex.UserValidationException;

public class TestClass {

	UserValidation validation; // Create Object Of Class

	// Test First Name Is Valid or Invalid
	@Test
	public void testFirstNameHappy() throws UserValidationException {
		validation = new UserValidation();
		boolean output = validation.validateFirstName.validateFirstName("Suhas");
		assertEquals(true, output);
	}

	@Test
	public void testFirstNameSad() throws UserValidationException {
		validation = new UserValidation();
		boolean output = validation.validateFirstName.validateFirstName("suhas");
		assertEquals(false, output);
	}

	// Test Last Name Is Valid or Invalid
	@Test
	public void testLastNameHappy() throws UserValidationException {
		validation = new UserValidation();
		boolean output = validation.validateLastName.validateLastName("Bhor");
		assertEquals(true, output);
	}

	@Test
	public void testLastNameSad() throws UserValidationException {
		validation = new UserValidation();
		boolean output = validation.validateLastName.validateLastName("bhor");
		assertEquals(false, output);
	}

	/*
	 * @Parameters(name="inputs()") public static Collection inputs() { return
	 * Arrays.asList(new Object[][] { {"abc@yahoo.com" , true}, {"abc-100@yahoo.com"
	 * , true}, {"abc.100@yahoo.com" , true}, {"abc111@abc.com" , true},
	 * {"abc-100@abc.net" , true}, {"abc.100@abc.com.au" , true}, {"abc@1.com" ,
	 * true}, {"abc@gmail.com.com" , true}, {"abc+100@gmail.com.com" , true},
	 * {"abc+100@gmail.com" , true}, {"abc@.com.com" , false}, {"abc123@gmail.a" ,
	 * false}, {"abc123@.com" , false}, {"abc123@.com.com" , false}, {".abc@abc.com"
	 * , false}, {"abc()*@gmail.com" , false}, {"abc@%*.com" , false},
	 * {"abc..2002@gmail.com" , false}, {"abc.@gmail.com" , false},
	 * {"abc@abc@gmail.com" , false}, {"abc@gmail.com.1a" , false},
	 * {"abc@gmail.com.aa.au^$" , false} } ); }
	 * 
	 * @Test public void testEmail() throws RegexRegistrationException { validation
	 * = new RegexRegistration(); boolean output = validation.validateEmail(input);
	 * assertEquals(expectedResult , output); }
	 */

	// Test Email Is Valid or Invalid
	@Test
	public void testEmailHappy() throws UserValidationException {
		validation = new UserValidation();
		boolean output = validation.validateEmail.validateEmail("abc.xyz@bl.co.in");
		assertEquals(true, output);
	}

	@Test
	public void testEmailSad() throws UserValidationException {
		validation = new UserValidation();
		boolean output = validation.validateEmail.validateEmail(".abc@abc.com");
		assertEquals(false, output);
	}

	// Test Mobile Number Is Valid or Invalid
	@Test
	public void testMobileNumberHappy() throws UserValidationException {
		validation = new UserValidation();
		boolean output = validation.validateMobileNumber.validateMobileNumber("91 1234567890");
		assertEquals(true, output);
	}

	@Test
	public void testMobileNumberSad() throws UserValidationException {
		validation = new UserValidation();
		boolean output = validation.validateMobileNumber.validateMobileNumber("91 123456789");
		assertEquals(false, output);
	}

	// Test Password Is Valid or Invalid
	@Test
	public void testPasswordHappy() throws UserValidationException {
		validation = new UserValidation();
		boolean output = validation.validatePassword.validatePassword("Abcde@123");
		assertEquals(true, output);
	}

	@Test
	public void testPasswordSad() throws UserValidationException {
		validation = new UserValidation();
		boolean output = validation.validatePassword.validatePassword("Abc@123");
		assertEquals(false, output);
	}
}