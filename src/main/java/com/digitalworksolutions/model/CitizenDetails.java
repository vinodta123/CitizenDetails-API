package com.digitalworksolutions.model;
	
public class CitizenDetails {

	

	private long id;
	private String fname;
	private String lname;
	private String dateofbirth;
	private String dateofdeath;
	private String photo;
	private String type;
	private String identityNumber;
	private String Status;
	private String married;
	private String email;
	private String mobile;
	private String phone;
	private int age;
	private CitizenAddress citizenAddress;
	
	

	public CitizenDetails() {
		
	}
	
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}



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
	 * @return the dateofbirth
	 */
	public String getDateofbirth() {
		return dateofbirth;
	}



	/**
	 * @param dateofbirth the dateofbirth to set
	 */
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}



	/**
	 * @return the dateofdeath
	 */
	public String getDateofdeath() {
		return dateofdeath;
	}



	/**
	 * @param dateofdeath the dateofdeath to set
	 */
	public void setDateofdeath(String dateofdeath) {
		this.dateofdeath = dateofdeath;
	}



	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}



	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}



	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}



	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}



	/**
	 * @return the identityNumber
	 */
	public String getIdentityNumber() {
		return identityNumber;
	}



	/**
	 * @param identityNumber the identityNumber to set
	 */
	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}



	/**
	 * @return the status
	 */
	public String getStatus() {
		return Status;
	}



	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		Status = status;
	}



	/**
	 * @return the married
	 */
	public String getMarried() {
		return married;
	}



	/**
	 * @param married the married to set
	 */
	public void setMarried(String married) {
		this.married = married;
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



	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}



	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}



	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}



	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}



	/**
	 * @return the citizenAddress
	 */
	public CitizenAddress getCitizenAddress() {
		return citizenAddress;
	}



	/**
	 * @param citizenAddress the citizenAddress to set
	 */
	public void setCitizenAddress(CitizenAddress citizenAddress) {
		this.citizenAddress = citizenAddress;
	}



	/**
	 * @param id
	 * @param fname
	 * @param lname
	 * @param dateofbirth
	 * @param dateofdeath
	 * @param photo
	 * @param type
	 * @param identityNumber
	 * @param status
	 * @param married
	 * @param email
	 * @param mobile
	 * @param phone
	 * @param age
	 * @param citizenAddress
	 */
	public CitizenDetails(long id, String fname, String lname, String dateofbirth, String dateofdeath, String photo,
			String type, String identityNumber, String status, String married, String email, String mobile,
			String phone, int age, CitizenAddress citizenAddress) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.dateofbirth = dateofbirth;
		this.dateofdeath = dateofdeath;
		this.photo = photo;
		this.type = type;
		this.identityNumber = identityNumber;
		Status = status;
		this.married = married;
		this.email = email;
		this.mobile = mobile;
		this.phone = phone;
		this.age = age;
		this.citizenAddress = citizenAddress;
	}



	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CitizenDetails [id=" + id + ", fname=" + fname + ", lname=" + lname + ", dateofbirth=" + dateofbirth
				+ ", dateofdeath=" + dateofdeath + ", photo=" + photo + ", type=" + type + ", identityNumber="
				+ identityNumber + ", Status=" + Status + ", married=" + married + ", email=" + email + ", mobile="
				+ mobile + ", phone=" + phone + ", age=" + age + ", citizenAddress=" + citizenAddress + "]";
	}




	

}
