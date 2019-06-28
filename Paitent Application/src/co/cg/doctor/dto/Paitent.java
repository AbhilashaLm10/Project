package co.cg.doctor.dto;

import java.time.LocalDate;

public class Paitent
{
	private int no;
	private String name;
	private LocalDate add_date;
	private String phoneno;
	private String address;
	
	
	public Paitent()
	{
		
	}

	

	public int getNo() {
		return no;
	}



	public void setNo(int no) {
		this.no = no;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public LocalDate getAdd_date() {
		return add_date;
	}



	public void setAdd_date(LocalDate add_date) {
		this.add_date = add_date;
	}



	public String getPhoneno() {
		return phoneno;
	}



	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Paitent [no=" + no + ", name=" + name + ", add_date="
				+ add_date + ", phoneno=" + phoneno + ", address=" + address
				+ "]";
	}
	
	
	
	

}
