package com.bl.Interface;

import com.bl.regex.UserValidationException;

@FunctionalInterface
public interface I_ValidateFirstName {
	public boolean validateFirstName(String firstName) throws UserValidationException;
}