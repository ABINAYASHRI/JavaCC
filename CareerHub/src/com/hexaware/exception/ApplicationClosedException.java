package com.hexaware.exception;

public class ApplicationClosedException extends Exception{
	 public ApplicationClosedException(String message) {
	        super(message);
	    }
	 public String toString() {
			return "ApplicationClosedException[]";
		}
}
