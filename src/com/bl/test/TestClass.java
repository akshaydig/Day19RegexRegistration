package com.bl.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bl.regex.RegexRegistration;

public class TestClass {
	@Test
	public void testFirstNameHappy() {
		RegexRegistration validation = new RegexRegistration();
		boolean output = validation.validateFirstName("Suhas");
		assertEquals(true, output);
	}

	@Test
	public void testFirstNameSad() {
		RegexRegistration validation = new RegexRegistration();
		boolean output = validation.validateFirstName("suhas");
		assertEquals(false, output);
	}

	@Test
	public void testLastNameHappy() {
		RegexRegistration validation = new RegexRegistration();
		boolean output = validation.validateLastName("Bhor");
		assertEquals(true, output);
	}

	@Test
	public void testLastNameSad() {
		RegexRegistration validation = new RegexRegistration();
		boolean output = validation.validateLastName("bhor");
		assertEquals(false, output);
	}

	@Test
	public void testEmailHappy() {
		RegexRegistration validation = new RegexRegistration();
		boolean output = validation.validateEmail("abc.xyz@bl.co.in");
		assertEquals(true, output);
	}

	@Test
	public void testEmailSad() {
		RegexRegistration validation = new RegexRegistration();
		boolean output = validation.validateEmail("abc.xyz@bl.co");
		assertEquals(false, output);
	}

	@Test
	public void testMobileNumberHappy() {
		RegexRegistration validation = new RegexRegistration();
		boolean output = validation.validateMobileNumber("91 1234567890");
		assertEquals(true, output);
	}

	@Test
	public void testMobileNumberSad() {
		RegexRegistration validation = new RegexRegistration();
		boolean output = validation.validateMobileNumber("91 123456789");
		assertEquals(false, output);
	}

	@Test
	public void testPasswordHappy() {
		RegexRegistration validation = new RegexRegistration();
		boolean output = validation.validatePassword("Abcde@123");
		assertEquals(true, output);
	}

	@Test
	public void testPasswordSad() {
		RegexRegistration validation = new RegexRegistration();
		boolean output = validation.validatePassword("Abc@123");
		assertEquals(false, output);
	}
}