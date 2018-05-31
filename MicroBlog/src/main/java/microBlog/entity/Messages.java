package microBlog.entity;

import java.util.Date;

public class Messages {
	public Messages() {
		
	}
	public Messages(int id) {
		super();
		this.id = id;
	}
	private int id;
	private Pictures pictures;
	private User user;
	private String info;
	private Date time;
	private int collectnum;
	private int commentnum;
	private int agreenum;
	private int state;
	private Topic topic;
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Pictures getPictures() {
		return pictures;
	}
	public void setPictures(Pictures pictures) {
		this.pictures = pictures;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public int getCollectnum() {
		return collectnum;
	}
	public void setCollectnum(int collectnum) {
		this.collectnum = collectnum;
	}
	public int getCommentnum() {
		return commentnum;
	}
	public void setCommentnum(int commentnum) {
		this.commentnum = commentnum;
	}
	public int getAgreenum() {
		return agreenum;
	}
	public void setAgreenum(int agreenum) {
		this.agreenum = agreenum;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
}
