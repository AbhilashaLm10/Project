package com.cg.doctor.service;

import java.util.ArrayList;

import co.cg.doctor.dto.Paitent;

import com.cg.doctor.exception.PaitentException;

public interface PaitentService
{

	int addPaitent(Paitent pa) throws PaitentException; // return id
	  
	Paitent removePaitent(int no)throws PaitentException; //remove employee object
	  
	Paitent getPaitentno(int no)throws PaitentException; 
	  
	  
	  ArrayList<Paitent>getallPaitent()throws PaitentException; // give the details of employees
	  
	  Paitent updatePaitent(int no,String name)throws PaitentException;
	  
	  public boolean validateName(String name);
	  
	  public boolean validatePhone(String phonenno);
	  
	  boolean validatePaitent(Paitent emp);
}
