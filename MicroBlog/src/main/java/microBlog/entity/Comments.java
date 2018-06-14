package microBlog.entity;

import java.util.Date;

public class Comments {
	public Comments() {
		
	}
	public Comments(int id) {
		super();
		this.id = id;
	}
	private int id;
	private String info;
	private Messages messages;
	private User user;
	private Date time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Messages getMessages() {
		return messages;
	}
	public void setMessages(Messages messages) {
		this.messages = messages;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
}
