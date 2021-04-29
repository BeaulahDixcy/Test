package com.tcs.Userdetails2;

public class Userdetails2 {
	private Long userId;
	private String username;
	private String phoneNo;
	private String email;
	private String address;

	public Userdetails2(Long userId, String username, String phoneNo, String email, String address) 
	{
		this.userId = userId;
		this.username = username;
		this.phoneNo = phoneNo;
		this.email = email;
		this.address = address;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
