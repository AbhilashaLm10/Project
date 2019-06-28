package com.cg.doctor.pl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import com.cg.doctor.exception.PaitentException;
import com.cg.doctor.service.PaitentService;
import com.cg.doctor.service.PaitentServiceImpl;

import co.cg.doctor.dto.Paitent;


public class PaitentMainClass {
	
	static PaitentService service = 
			new PaitentServiceImpl();

	public static void main(String[] args) 
	{
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Welcome to Hospital");
		 
		 System.out.println("1. Add details of new Paitient \n 2. Delete record of paitient with respective no. \n 3. Get Details of paitient with respective no. \n 4. Get record sof all paitient \n 5. Update paitient name with respective no.");
		 
		 int choice=sc.nextInt();
		 
		 switch(choice)
		 {
		  
		 
	     case 1 :
	    	
	    	 Paitent   stu= acceptdetails();
		  
	       if(stu!=null)
	       {
	         try
	            {
		            int id = service.addPaitent(stu);
		            System.out.println("inserted and id = "+id);
	            }
	         catch(PaitentException e)
	            {
		           e.printStackTrace();
	            }
	       }
	    break;
	    
	     case 2:
				System.out.println("Enter to id to Student::");
				int id = sc.nextInt();
				try
				{
					Paitent stu1 = service.removePaitent(id);
					System.out.println("removed Student "+stu1);
				}
				catch(PaitentException e)
				{
					System.out.println(e.getMessage());
				}
				break;
	    
				   
	     case 3 : 
             System.out.println("Enter id to search Student ::");
             int eid = sc.nextInt();
             try
                 {
            	 Paitent ref = service.getPaitentno(eid);
                    System.out.println("emp "+ref);
                  }
             catch(PaitentException e)
                  {
                      System.out.println(e.getMessage());
                  }
             break;
             
             
	     case 4 : 
				try{ArrayList<Paitent>list = 
				service.getallPaitent();
				for(Paitent obj1 : list)
				{
					System.out.println(obj1);
				}
				}
				catch(PaitentException e)
				{
					e.printStackTrace();
				}
				break;
				
	     case 5:
             
		        System.out.println("Enter id::");
             String name = sc.next();
              int ide = sc.nextInt();
              try{
            	  Paitent eObj = service.updatePaitent(ide,name);
	                    System.out.println("updated = "+eObj);
                 }
              catch(PaitentException e)
                {
                 	System.out.println(e.getMessage());
                }
             break;
					
				
				
	    
		 }
		 
		
		
	}
	public static Paitent  acceptdetails()
	{
		
		Paitent emp = null;
		Scanner sc = new Scanner(System.in);
		String name = null;
		String addres=null;
		String phone=null;
		boolean whileFlag = true;
		boolean nameflag = true;
		boolean dateflag= true;
		boolean phoneflag = true;
		boolean addressflag = true;
		
		
		while(whileFlag)
		{
		if(nameflag)
		{
		System.out.println("Enter name:: ");
		name = sc.next();
		nameflag = !service.validateName(name);
		continue;
		}
		
		
		
		if(phoneflag)
		{
			System.out.println("Enter phone no :: ");
			phone = sc.next();
			phoneflag = !service.validatePhone(phone);
			continue;
		
		}
		
		if(addressflag)
		{

			System.out.println("Enter address :: ");
			addres = sc.next();
			addressflag = !service.validateName(addres);
			continue;
		
			
		}
		
		if(dateflag)
		{
			
		
			LocalDate today=LocalDate.now();
			
			if(today !=null)
			{
				emp=new Paitent();
				emp.setName(name);
				emp.setAdd_date(today);
				emp.setPhoneno(phone);
				emp.setAddress(addres);
			}
			System.out.println("Counsultation date is :: "+today);
			dateflag=false;
			whileFlag=false;
			
		}
		
		
		
		
	}
		return emp;
	
	}
}


