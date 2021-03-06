package com.vr.domain;
// Generated 2017-7-20 15:29:22 by Hibernate Tools 4.3.5.Final

/**
 * News generated by hbm2java
 */
public class News implements java.io.Serializable {

	private Integer id;
	private String author;
	private Integer downvote;
	private Integer editorId;
	private Integer isPush;
	private String lastEditTime;
	private String newsAbstract;
	private String path;
	private String picLocation;
	private String source;
	private String tag;
	private String title;
	private Integer upvote;
private String content;

	public String getContent() {
	return content;
}

public void setContent(String content) {
	this.content = content;
}

	public News() {
	}

	public News(String author, Integer downvote, Integer editorId, Integer isPush, String lastEditTime,
			String newsAbstract, String path, String picLocation, String source, String tag, String title,
			Integer upvote) {
		this.author = author;
		this.downvote = downvote;
		this.editorId = editorId;
		this.isPush = isPush;
		this.lastEditTime = lastEditTime;
		this.newsAbstract = newsAbstract;
		this.path = path;
		this.picLocation = picLocation;
		this.source = source;
		this.tag = tag;
		this.title = title;
		this.upvote = upvote;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getDownvote() {
		return this.downvote;
	}

	public void setDownvote(Integer downvote) {
		this.downvote = downvote;
	}

	public Integer getEditorId() {
		return this.editorId;
	}

	public void setEditorId(Integer editorId) {
		this.editorId = editorId;
	}

	public Integer getIsPush() {
		return this.isPush;
	}

	public void setIsPush(Integer isPush) {
		this.isPush = isPush;
	}

	public String getLastEditTime() {
		return this.lastEditTime;
	}

	public void setLastEditTime(String lastEditTime) {
		this.lastEditTime = lastEditTime;
	}

	public String getNewsAbstract() {
		return this.newsAbstract;
	}

	public void setNewsAbstract(String newsAbstract) {
		this.newsAbstract = newsAbstract;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPicLocation() {
		return this.picLocation;
	}

	public void setPicLocation(String picLocation) {
		this.picLocation = picLocation;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getUpvote() {
		return this.upvote;
	}

	public void setUpvote(Integer upvote) {
		this.upvote = upvote;
	}

}
