package microBlog.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import microBlog.biz.UserBiz;
import microBlog.entity.User;
import microBlog.mapper.UserMapper;

@Service
public class UserBizImpl implements UserBiz{

	@Autowired
	private UserMapper usermapper;
	
	@Override
	public User checkLogin(String email, String passWord) {
		return usermapper.checkLogin(email, passWord);
	}

	@Override
	public void register(User user) {
		usermapper.register(user);
	}

	@Override
	public User fetchUserByEmail(String email) {
		return usermapper.fetchUserByEmail(email);
	}

	@Override
	public User fetchById(int id) {
		return usermapper.fetchById(id);
	}

	@Override
	public void update(User user) {
		usermapper.update(user);
	}

	@Override
	public void updateStatus(int id, int status) {
		usermapper.updateStatus(id, status);
	}

}
