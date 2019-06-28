package com.cg.doctor.exception;

public class PaitentException extends Exception
{

	String message;
	
	public PaitentException(String message)
	{
		this.message=message;
	}
	
	@Override
	public String getMessage()
	{
		return this.message;
		
	}

}
