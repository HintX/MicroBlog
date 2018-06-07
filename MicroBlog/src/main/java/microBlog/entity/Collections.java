package microBlog.entity;

import java.util.Date;

public class Collections {
	public Collections() {
		
	}
	public Collections(int id) {
		super();
		this.id = id;
	}
	private int id;
	private User user;
	private Messages messages;
	private Date time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Messages getMessages() {
		return messages;
	}
	public void setMessages(Messages messages) {
		this.messages = messages;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
}
