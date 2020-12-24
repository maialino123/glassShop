package com.glassProject.model;

public class roleModel extends abtractModel<roleModel> {
	private Long roleId;
	private String roleName;
	private String code;
	private String metaKeyword;
	private String metaDescription;
	
	

	public roleModel() {
		super();
		
	}

	public roleModel(Long roleId, String roleName, String code, String metaKeyword, String metaDescription) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.code = code;
		this.metaKeyword = metaKeyword;
		this.metaDescription = metaDescription;
	}



	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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
