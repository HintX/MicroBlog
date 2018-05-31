package microBlog.entity;

import java.util.Date;

public class Relation {
	public Relation() {
	
	}	
	public Relation(int id) {
		super();
		this.id = id;
	}
	private int id;
	private User user;
	private User byUser;
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
	public User getByUser() {
		return byUser;
	}
	public void setByUser(User byUser) {
		this.byUser = byUser;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
}
