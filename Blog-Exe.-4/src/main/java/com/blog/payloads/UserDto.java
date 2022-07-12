package com.blog.payloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



public class UserDto {

	private int id;
	
	@NotEmpty
	@Size(min = 4, message = "Name Must be of Minimum of 4 charactors")
	private String name;
	@Email(message = "please provide valid email")
	private String email;
	@NotEmpty
	@Size(min = 8,max = 12, message = "password must be of minimum 8 characters & max of 12 charatores")
	private String password;
	@NotEmpty(message = "Details should be correct & valid ")
	private String aboute;
	
	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDto(int id, String name, String email, String password, String aboute) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.aboute = aboute;
	}
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAboute() {
		return aboute;
	}
	public void setAboute(String aboute) {
		this.aboute = aboute;
	}
	@Override
	public String toString() {
		return "UserDto [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", aboute="
				+ aboute + "]";
	}
	
}
