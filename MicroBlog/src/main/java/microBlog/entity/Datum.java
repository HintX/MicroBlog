package microBlog.entity;

public class Datum {
	public Datum() {
		
	}
	public Datum(int userId) {
		super();
		this.userId = userId;
	}
	private int userId;
	private String nickName;
	private UserInfo userInfo;
	private int messagesNum;
	private int attentionNum;
	private int fansNum;
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getMessagesNum() {
		return messagesNum;
	}
	public void setMessagesNum(int messagesNum) {
		this.messagesNum = messagesNum;
	}
	public int getAttentionNum() {
		return attentionNum;
	}
	public void setAttentionNum(int attentionNum) {
		this.attentionNum = attentionNum;
	}
	public int getFansNum() {
		return fansNum;
	}
	public void setFansNum(int fansNum) {
		this.fansNum = fansNum;
	}
}
