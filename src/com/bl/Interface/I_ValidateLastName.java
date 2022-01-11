package com.bl.Interface;

import com.bl.regex.UserValidationException;

@FunctionalInterface
public interface I_ValidateLastName {
	public boolean validateLastName(String lastName) throws UserValidationException;
}