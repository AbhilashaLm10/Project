package com.cg.doctor.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import co.cg.doctor.dto.Paitent;
import com.cg.doctor.dao.PaitentDao;
import com.cg.doctor.dao.PaitentDaoImpl;
import com.cg.doctor.exception.PaitentException;
import com.cg.doctor.service.PaitentServiceImpl;



public class PaitentTest
{
	
	PaitentServiceImpl service;
	PaitentDao dao=new PaitentDaoImpl();
	
	@Before
	public void init()
	{
		dao=new PaitentDaoImpl();
		service=new PaitentServiceImpl();
		service.setdao(dao);
	}
	
	  
	@Test
	public void testGetAllPaitent() throws PaitentException // returns arraylist
	{
		ArrayList<Paitent> list=service.getallPaitent();
		assertNotNull(list);
		
	}
	
	@Test
	public void testAddPaitent() throws PaitentException
	{
		Paitent pa=new Paitent();
	    pa.setName("Dipesh");
		pa.setAdd_date(LocalDate.of(1988,Month.MAY,29));
		pa.setPhoneno("9098767687");
		pa.setAddress("Mumbai");
		
		int id=service.addPaitent(pa);
		assertNotSame(id,0);
	}
	
	@Test
	public void testDeletePaitent() throws PaitentException
	{
		Paitent pa=service.removePaitent(102);
		assertNotNull(pa);
	}
	
	@Test
	public void updatePaitent() throws PaitentException
	{
		Paitent emp=service.updatePaitent(700,"Uma");
		assertNotNull(emp);
	}
	@After
	public void destroy()
	{
		dao=null;
		service=null;
	}

}
