package com.bl.Interface;

import com.bl.regex.UserValidationException;

@FunctionalInterface
public interface I_ValidateEmail {
	public boolean validateEmail(String email) throws UserValidationException;
}