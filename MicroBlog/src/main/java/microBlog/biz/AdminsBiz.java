package microBlog.biz;

import org.apache.ibatis.annotations.Param;

import microBlog.entity.Admins;

public interface AdminsBiz {
	Admins checkLogin(String userName,String passWord);
	void register(Admins Admins);
	void update(Admins admins);
	void updateState(@Param("id")int id,@Param("state")int state);
	Admins fetchById(int id);
	Admins fetchByUserName(String userName);
}
