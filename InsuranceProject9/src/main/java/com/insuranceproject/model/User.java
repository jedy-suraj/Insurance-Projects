package com.insuranceproject.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

//User entity class

@Entity
@Table(name = "user")
public class User {

	// id,name,email
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	//one user has multiple policies
	@OneToMany(mappedBy = "userID")
	private List<Policy> policyList;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Policy> getPolicyList() {
		return policyList;
	}
	public void setPolicyList(List<Policy> policyList) {
		this.policyList = policyList;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", policyList=" + policyList + "]";
	}

	

}
