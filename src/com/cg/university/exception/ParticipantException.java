package com.cg.university.exception;

public class ParticipantException  extends Exception{
String message;
	
	public ParticipantException(String message)
	{
		this.message=message;
	}
	
	@Override
	public String getMessage()
	{
		return this.message;
		
	}


}
