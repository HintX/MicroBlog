package microBlog.biz;


import microBlog.entity.UserInfo;

public interface UserInfoBiz {
	UserInfo fetchById(int id);
	void update(UserInfo userInfo);
}
