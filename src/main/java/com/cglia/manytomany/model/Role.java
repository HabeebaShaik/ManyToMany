package com.cglia.manytomany.model;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
public class Role {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    @JsonBackReference
	    @ManyToMany(mappedBy = "roles", cascade=CascadeType.ALL)
	    private Set<Users> users = new HashSet<>();
	    
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
		public Set<Users> getUsers() {
			return users;
		}
		public void setUsers(Set<Users> users) {
			this.users = users;
		}
		public Role(Long id, String name, Set<Users> users) {
			super();
			this.id = id;
			this.name = name;
			this.users = users;
		}
		public Role() {}

}
