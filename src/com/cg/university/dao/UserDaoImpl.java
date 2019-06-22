package com.cg.university.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.cg.university.bean.Users;
import com.cg.university.exception.ParticipantException;
import com.cg.university.util.DBUtil;

public class UserDaoImpl implements UserDao{

	Connection con;
	public UserDaoImpl()
	{
		con=DBUtil.getConnect();
		
	}
	
	@Override
	public Users validUser(String loginId, String password)
			throws ParticipantException {
		Users user=null;
		String query="Select Login_id,password from users";
		try
		{
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1,loginId);
			pstmt.setString(2,password);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
				String LoginId=rs.getString(1);
				String Password=rs.getString(2);
		       
		        
		        System.out.println("Enter LoginId");
		        Scanner sc=new Scanner(System.in);
		        String log=sc.next();
		        String pass=sc.next();
		        if((log.equals(LoginId)&&(pass.equals(Password))))
		        {
		        	System.out.println("You are Valid User !");
		        }
		        else
		        {
		        	System.out.println("You are UnAuthorized User !!");
		        }
		        user =new Users();
		        
			}
	
		  
		}
		catch(Exception e)
		{
			throw new ParticipantException(e.getMessage());
			
		}
		
		return user;
	}
	

}
