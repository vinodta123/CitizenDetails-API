package com.digitalworksolutions.model;



import org.hibernate.validator.constraints.NotBlank;

public class CitizenRequest {


	private String fname;
	private String lname;
	@NotBlank(message = "email can't empty!")
	private String email;
	@NotBlank(message = "mobile number can't empty!")
	private String mobile;
	
	

	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}



	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}



	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}



	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}








	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}



	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}



	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}



	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}




	

	public CitizenRequest() {
		
	}
	
}
