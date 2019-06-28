package com.cg.doctor.service;

import java.util.ArrayList;
import java.util.regex.Pattern;

import com.cg.doctor.dao.PaitentDao;
import com.cg.doctor.dao.PaitentDaoImpl;
import com.cg.doctor.exception.PaitentException;

import co.cg.doctor.dto.Paitent;


public class PaitentServiceImpl implements PaitentService
{
	PaitentDao dao;
	 
	 public void setdao(PaitentDao dao)
	   {
		   this.dao=dao;
	   }
	 
	 public PaitentServiceImpl()
	 {
		 dao = new PaitentDaoImpl();
		 
	 }

	@Override
	public int addPaitent(Paitent pa) throws PaitentException 
	{
	    
		return dao.addPaitent(pa);
	}

	@Override
	public Paitent removePaitent(int no) throws PaitentException {
	
		return dao.removePaitent(no);
	}

	@Override
	public Paitent getPaitentno(int no) throws PaitentException {
		
		return dao.getPaitentno(no);
	}

	@Override
	public ArrayList<Paitent> getallPaitent() throws PaitentException {
		
		return dao.getallPaitent();
	}

	@Override
	public Paitent updatePaitent(int no, String name) throws PaitentException {
		
		return dao.updatePaitent(no, name);
	}

	@Override
	public boolean validateName(String name)

	{
		
		
		String pattern="[A-Z]{1}[a-z]{2,}";
		if (Pattern.matches(pattern,name))
		{
			return true;
		}
		else
		    return false;
	
	}

	@Override
	public boolean validatePaitent(Paitent emp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validatePhone(String phonenno)
{
		String pattern="[0-9]{10}";
		String phone=""+phonenno;
		if(Pattern.matches(pattern,phonenno))
		{
			return true;
		}else
		return false;
	}
	 

}
