package com.glassProject.model;

public class userModel extends abtractModel<userModel> {
	private Long userId;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	private Long roleId;
	private String metaKeyword;
	private String metaDescription;
	private roleModel role = new roleModel();
	
	
	
	public userModel() {
		super();
		
	}
	public userModel(Long userId, String userName, String password, String firstName, String lastName, String address,
			String email, Long roleId, String metaKeyword, String metaDescription) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.roleId = roleId;
		this.metaKeyword = metaKeyword;
		this.metaDescription = metaDescription;
	
	}
	
	

	
	public roleModel getRole() {
		return role;
	}
	public void setRole(roleModel role) {
		this.role = role;
	}
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getMetaKeyword() {
		return metaKeyword;
	}

	public void setMetaKeyword(String metaKeyword) {
		this.metaKeyword = metaKeyword;
	}

	public String getMetaDescription() {
		return metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

}
