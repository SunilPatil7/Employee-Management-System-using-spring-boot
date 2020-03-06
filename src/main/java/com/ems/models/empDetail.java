package com.ems.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "empdetails")
public class empDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long e_id;
	
	private String e_name;

	private String e_email;
	
	private String e_mobile;
	
	private String e_add;

	public long getE_id() {
		return e_id;
	}

	public void setE_id(long e_id) {
		this.e_id = e_id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public String getE_email() {
		return e_email;
	}

	public void setE_email(String e_email) {
		this.e_email = e_email;
	}

	public String getE_mobile() {
		return e_mobile;
	}

	public void setE_mobile(String e_mobile) {
		this.e_mobile = e_mobile;
	}

	public String getE_add() {
		return e_add;
	}

	public void setE_add(String e_add) {
		this.e_add = e_add;
	}
	
	

}
