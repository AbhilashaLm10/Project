package com.cg.doctor.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import co.cg.doctor.dto.Paitent;

import com.cg.doctor.exception.PaitentException;
import com.cg.doctor.logger.MyLogger;
import com.cg.doctor.util.DBUtil;



public class PaitentDaoImpl implements PaitentDao
{
	Connection con;
	Logger logger;
	
	 public PaitentDaoImpl ()
	 {
		 con=DBUtil.getConnect();
		 logger = MyLogger.getLogger();
	 }

	@Override
	public int addPaitent(Paitent pa) throws PaitentException 
	{
	
		logger.info("Adding Paitent"); 
		int id=0;
		    String qry="insert into doctorJEE values(no_seq.nextval,?,?,?,?)";
		    
		    String name=pa.getName();
		    
		    LocalDate bDate=pa.getAdd_date();
		    java.sql.Date date=java.sql.Date.valueOf(bDate);
		    
		    String phone=pa.getPhoneno();
		    
		    String address=pa.getAddress();
		    

		    try
		    {
		    	PreparedStatement pstmt=con.prepareStatement(qry);
		    	pstmt.setString(1, name);
		        pstmt.setDate(2, date);
		        pstmt.setString(3, phone);
		        pstmt.setString(4, address);
		        
		    	
		    	
		    	int row=pstmt.executeUpdate();
		    	
		    	if(row>0)
		    	{
		    		id=Paitentno();
		    		logger.info(" Paitent Added with id" + id); 
		    	}
		    	else
		    	{
		    		logger.info("Student not added");
		    		throw new PaitentException("Unable to insert "+pa);	
		    	}
		    }
		    catch(SQLException e)
		    {
		    	e.printStackTrace();
		    	logger.info(e.getMessage());
		    	
		    }
			return id;
		
		
		
		
	}

	private int Paitentno()
	{
		int id=0;
		String qry="Select no_seq.CURRVAL from dual";
		
		try {
			
			  Statement stmt=con.createStatement();
			  ResultSet rs=stmt.executeQuery(qry);
			  
			  if(rs.next())
					  {
				          id=rs.getInt(1);
					  }
		    } 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return id;
	}

	@Override
	public Paitent removePaitent(int no) throws PaitentException
	{
		Paitent pa=null;
		String qry="Delete from doctorJEE where no=?";
		try
		{
			PreparedStatement pstmt=con.prepareStatement(qry);
			pstmt.setInt(1,no);
			pa=getPaitentno(no);
			int row=pstmt.executeUpdate();
			if(pa==null)
			{
				System.out.println("emp with id "+no+"not found");
			}
			else if(row>0)
			{
				System.out.println("Deleted Employee with id "+no);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return pa;
	}

	@Override
	public Paitent getPaitentno(int no) throws PaitentException 
	{
		Paitent pa=null;
		String qry="Select * from doctorJEE where no=?";
		try
		{
			PreparedStatement pstmt=con.prepareStatement(qry);
			pstmt.setInt(1,no);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				Date date=rs.getDate(3);
				String phone=rs.getString(4);
				String adress=rs.getString(5);
				
				
				/*pstmt.setString(1, name);
		        pstmt.setDate(2, date);
		        pstmt.setString(3, phone);
		        pstmt.setString(4, address);
		        */
			
				
				pa =new Paitent();
			}
			else
			{
				throw new PaitentException("Student with id "+no +" not found");
			}
		}
		catch(Exception e)
		{
			throw new PaitentException(e.getMessage());
		}
		return null;
	
		
		
	}

	@Override
	public ArrayList<Paitent> getallPaitent() throws PaitentException
	{
		ArrayList<Paitent>list=new ArrayList<Paitent>();
		String qry="Select * from doctorJEE";
		try
		{
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(qry);
			while(rs.next())
			{
				int rollno=rs.getInt(1);
				String name=rs.getString(2);
				String phoneno=rs.getString(3);
				
				Paitent pa=new Paitent();
				list.add(pa);
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public Paitent updatePaitent(int no, String name) throws PaitentException
	{
		Paitent pa=getPaitentno(no);
		if(pa==null)
		{
			throw new PaitentException("doctorJEE with id "+no+"not found");
		}
		else
		{
			String qry="update PaitentJEE set name=? where no=?";
			try
			{
				PreparedStatement pstmt=con.prepareStatement(qry);
				pstmt.setString(1,pa.getName());
				pstmt.setInt(2,no);
				int row=pstmt.executeUpdate();
				if(row > 0)
				{
					System.out.println("Updated Successfully");
				     pa=getPaitentno(no);
					
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		
		return null;
	}

}
