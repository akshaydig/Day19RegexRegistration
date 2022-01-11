package com.bl.Interface;

import com.bl.regex.UserValidationException;

@FunctionalInterface
public interface I_ValidatePassword {
	public boolean validatePassword(String password) throws UserValidationException;
}