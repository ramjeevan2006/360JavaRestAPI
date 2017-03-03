package com.bean;

public class Customer {
	
	public Customer(String name, String gender, String dob, String country, String fmlybook, long emId, String residence,
			String[] incList, boolean radiaBtn) {
		super();
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.country = country;
		this.fmlybook = fmlybook;
		this.emId = emId;
		this.residence = residence;
		IncList = incList;
		this.radiaBtn = radiaBtn;
	}
	public Customer(String[] incList, boolean radiaBtn) {
		super();
		IncList = incList;
		this.radiaBtn = radiaBtn;
	}

	
	private String name;
	private String gender;
	private String dob;
	private String country;
	private String fmlybook;
	private long emId;
	private String residence;
	private String[] IncList;
	private boolean radiaBtn;	
	
	public Customer() {
		super();
	}
	public boolean isRadiaBtn() {
		return radiaBtn;
	}


	public void setRadiaBtn(boolean radiaBtn) {
		this.radiaBtn = radiaBtn;
	}


	public String[] getIncList() {
		return IncList;
	}
	public void setIncList(String[] incList) {
		IncList = incList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFmlybook() {
		return fmlybook;
	}
	public void setFmlybook(String fmlybook) {
		this.fmlybook = fmlybook;
	}
	public long getEmId() {
		return emId;
	}
	public void setEmId(long emId) {
		this.emId = emId;
	}
	public String getResidence() {
		return residence;
	}
	public void setResidence(String residence) {
		this.residence = residence;
	}
	
	

}
