package com.bl.Interface;

import com.bl.regex.UserValidationException;

@FunctionalInterface
public interface I_ValidateMobileNumber {
	public boolean validateMobileNumber(String mobileNumber) throws UserValidationException;
}