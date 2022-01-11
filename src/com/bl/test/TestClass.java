package com.bl.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bl.regex.RegexRegistration;
import com.bl.regex.RegexRegistrationException;

public class TestClass {

	RegexRegistration validation;

	@Test
	public void testFirstNameHappy() throws RegexRegistrationException {
		validation = new RegexRegistration();
		boolean output = validation.validateFirstName("Suhas");
		assertEquals(true, output);
	}

	@Test
	public void testFirstNameSad() throws RegexRegistrationException {
		validation = new RegexRegistration();
		boolean output = validation.validateFirstName("suhas");
		assertEquals(false, output);
	}

	@Test
	public void testLastNameHappy() throws RegexRegistrationException {
		validation = new RegexRegistration();
		boolean output = validation.validateLastName("Bhor");
		assertEquals(true, output);
	}

	@Test
	public void testLastNameSad() throws RegexRegistrationException {
		validation = new RegexRegistration();
		boolean output = validation.validateLastName("bhor");
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
	@Test
	public void testEmailHappy() throws RegexRegistrationException {
		validation = new RegexRegistration();
		boolean output = validation.validateEmail("abc.xyz@bl.co.in");
		assertEquals(true, output);
	}

	@Test
	public void testEmailSad() throws RegexRegistrationException {
		validation = new RegexRegistration();
		boolean output = validation.validateEmail(".abc@abc.com");
		assertEquals(false, output);
	}

	@Test
	public void testMobileNumberHappy() throws RegexRegistrationException {
		validation = new RegexRegistration();
		boolean output = validation.validateMobileNumber("91 1234567890");
		assertEquals(true, output);
	}

	@Test
	public void testMobileNumberSad() throws RegexRegistrationException {
		validation = new RegexRegistration();
		boolean output = validation.validateMobileNumber("91 123456789");
		assertEquals(false, output);
	}

	@Test
	public void testPasswordHappy() throws RegexRegistrationException {
		validation = new RegexRegistration();
		boolean output = validation.validatePassword("Abcde@123");
		assertEquals(true, output);
	}

	@Test
	public void testPasswordSad() throws RegexRegistrationException {
		validation = new RegexRegistration();
		boolean output = validation.validatePassword("Abc@123");
		assertEquals(false, output);
	}
}