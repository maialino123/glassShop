package com.glassProject.model;

public class menuModel {
	private Long menuId;
	private String text;
	private String link;
	private int displayOrder;
	private String target;
	private boolean status;
	private int menuTypeId;
	private int menuParentId;

	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public int getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(int displayOrder) {
		this.displayOrder = displayOrder;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getMenuTypeId() {
		return menuTypeId;
	}

	public void setMenuTypeId(int menuTypeId) {
		this.menuTypeId = menuTypeId;
	}

	public int getMenuParentId() {
		return menuParentId;
	}

	public void setMenuParentId(int menuParentId) {
		this.menuParentId = menuParentId;
	}

}
