package com.glassProject.paging;

import com.glassProject.sort.sorter;

public class pageRequest implements pageble {
	
	private Integer page;
	private Integer maxPageItem;
	private sorter sort;
	
	

	public pageRequest(Integer page, Integer maxPageItem, sorter sort) {
		super();
		this.page = page;
		this.maxPageItem = maxPageItem;
		this.sort = sort;
	}

	public Integer getPage() {
		return this.getPage();
	}

	public Integer getOffset() {
		if (this.page != null && this.maxPageItem != null) {
			return (this.page - 1) * this.maxPageItem;
		}
		return null;
	}

	public Integer getLimit() {
		
		return this.maxPageItem;
	}

	public com.glassProject.sort.sorter getSorter() {
		if (sort != null) {
			return this.sort;
		}
		return null;
	}

	

	

}
