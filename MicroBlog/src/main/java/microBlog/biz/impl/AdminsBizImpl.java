package microBlog.biz.impl;

import org.springframework.stereotype.Service;

import microBlog.biz.AdminsBiz;
import microBlog.entity.Admins;
import microBlog.mapper.AdminsMapper;

@Service
public class AdminsBizImpl implements AdminsBiz{

	private AdminsMapper adminsMapper;
	
	@Override
	public Admins checkLogin(String userName, String passWord) {
		return adminsMapper.checkLogin(userName, passWord);
	}

	@Override
	public void register(Admins Admins) {
		adminsMapper.register(Admins);
	}

	@Override
	public void update(Admins admins) {
		adminsMapper.update(admins);
	}

	@Override
	public Admins fetchById(int id) {
		return adminsMapper.fetchById(id);
	}

	@Override
	public Admins fetchByUserName(String userName) {
		return adminsMapper.fetchByUserName(userName);
	}

	@Override
	public void updateState(int id, int state) {
		adminsMapper.updateState(id, state);
	}

}
