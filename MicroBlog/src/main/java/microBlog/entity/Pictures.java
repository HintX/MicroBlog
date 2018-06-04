package microBlog.entity;

public class Pictures {
	public Pictures() {
		
	}
	public Pictures(int id) {
		super();
		this.id = id;
	}
	private int id;
	private Messages messages;
	private String url;
	private String type;
	public Messages getMessages() {
		return messages;
	}
	public void setMessages(Messages messages) {
		this.messages = messages;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
