package com.msgcui.demo.menus.mapper;

import com.msgcui.demo.base.mapper.BaseMapper;

public class MenusMapper extends BaseMapper{

	private String name;
	
	private String path;
	
	private int menuId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

}
