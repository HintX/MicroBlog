package microBlog.biz;


import microBlog.entity.Admins;

public interface AdminsBiz {
	Admins checkLogin(String userName,String passWord);
	void register(Admins Admins);
	void update(Admins admins);
	void updateState(int id,int state);
	Admins fetchById(int id);
	Admins fetchByUserName(String userName);
}
