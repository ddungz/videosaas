package com.updatingtech.videosaas.model;

import java.util.Date;

public class Video implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long videoId;
	private String videoName;
	private String videoSize;
	private String category;
	private int level;
	private int viewPermission;
	private Date uploadDate;
	
	/* Constructor */
	public Video() { }
	
	public Video(String videoName, String videoSize, String category, int level, int viewPermission, Date uploadDate) {
		this.videoName = videoName;
		this.videoSize = videoSize;
		this.category = category;
		this.level = level;
		this.viewPermission = viewPermission;
		this.uploadDate = uploadDate;
	}
	
	/* Getters Setters */
	public Long getVideoId() {
		return videoId;
	}

	public void setVideoId(Long videoId) {
		this.videoId = videoId;
	}

	public String getVideoName() {
		return videoName;
	}

	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	public String getVideoSize() {
		return videoSize;
	}

	public void setVideoSize(String videoSize) {
		this.videoSize = videoSize;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getViewPermission() {
		return viewPermission;
	}

	public void setViewPermission(int viewPermission) {
		this.viewPermission = viewPermission;
	}

	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
}
