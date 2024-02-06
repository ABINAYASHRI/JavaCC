package com.hexaware.exception;

public class DatabaseException extends Exception{
	 public DatabaseException(String message) {
	        super(message);
	    }
	 public String toString() {
			return "DatabaseException[]";
		}
}
