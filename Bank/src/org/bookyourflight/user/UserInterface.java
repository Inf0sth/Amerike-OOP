package org.bookyourflight.user;

import java.time.LocalDate;

import org.bookyourflight.flights.Destination;

public interface UserInterface {
//Interface	defines the behavior of the class 
	public String getFullName();
	public void setFullName(String fullName) throws UserException;
	public String getEmail();
	public void setEmail(String email) throws UserException; 
	public String getPhoneNumber();
	public void setPhoneNumber(String phoneNumber) throws UserException;
	public Destination getCountry();
	public void setCountry(Destination country);
	public int getAge();
	public void setAge(int age);
	public char getGender();
	public void setGender(char gender);
	public LocalDate getBirthDate();
	public void setBirthDate(int [] dateArray);
	
	
	
	
	
	
	
}