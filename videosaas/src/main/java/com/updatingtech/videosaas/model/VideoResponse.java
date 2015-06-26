package com.updatingtech.videosaas.model;

public class VideoResponse {
	private boolean status;
	private String message;
	private String data;
	
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean b) {
		this.status = b;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
}
