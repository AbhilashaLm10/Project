package com.cg.doctor.dao;

import java.util.ArrayList;

import com.cg.doctor.exception.PaitentException;

import co.cg.doctor.dto.Paitent;



public interface PaitentDao
{
	int addPaitent(Paitent pa) throws PaitentException; // return id
	  
	Paitent removePaitent(int no)throws PaitentException; //remove employee object
	  
	Paitent getPaitentno(int no)throws PaitentException; 
	  
	  
	  ArrayList<Paitent>getallPaitent()throws PaitentException; // give the details of employees
	  
	  Paitent updatePaitent(int no,String name)throws PaitentException;
	  
}
