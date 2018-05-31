package microBlog.biz;


import microBlog.entity.User;

public interface UserBiz {
	User checkLogin(String email,String passWord);
	void register(User user);
	User fetchUserByEmail(String email);
	void updateStatus(int id,int status);
	User fetchById(int id);
	void update(User user);
}
