package com.hexaware.exception;

public class InvalidEmaiException extends Exception{
	 public InvalidEmaiException(String message) {
	        super(message);
	    }
	 public String toString() {
			return "InvalidEmaiException[]";
		}
}
