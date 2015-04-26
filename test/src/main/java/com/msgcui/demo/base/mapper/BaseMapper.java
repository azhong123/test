package com.msgcui.demo.base.mapper;

import java.io.Serializable;
import java.util.Date;

import com.msgcui.demo.base.constant.Status;

public class BaseMapper implements Serializable{

	
	private int id;
	
	private Date inputTime;
	
	private Date modifyTime;
	
	private int inputUserId;
	
	private int modifyUserId;
	
	private String descript;
	
	private Status status;
	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getInputTime() {
		return inputTime;
	}

	public void setInputTime(Date inputTime) {
		this.inputTime = inputTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public int getInputUserId() {
		return inputUserId;
	}

	public void setInputUserId(int inputUserId) {
		this.inputUserId = inputUserId;
	}

	public int getModifyUserId() {
		return modifyUserId;
	}

	public void setModifyUserId(int modifyUserId) {
		this.modifyUserId = modifyUserId;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}
}
