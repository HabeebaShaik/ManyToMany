package com.cglia.manytomany.model;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;
import jakarta.persistence.ManyToMany;

@Entity
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String password;
	@JsonManagedReference 
	 @ManyToMany(cascade=CascadeType.ALL)
	    @JoinTable(name = "user_role",
	            joinColumns = @JoinColumn(name = "user_id"),
	            inverseJoinColumns = @JoinColumn(name = "role_id"))
	    private Set<Role> roles = new HashSet<>();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	public Users(Long id, String name, String password, Set<Role> roles) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.roles = roles;
	}
	public Users() {}

}
