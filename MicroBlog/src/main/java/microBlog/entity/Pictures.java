package microBlog.entity;

public class Pictures {
	public Pictures() {
		
	}
	public Pictures(int id) {
		super();
		this.id = id;
	}
	private int id;
	private String url;
	private String type;
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
