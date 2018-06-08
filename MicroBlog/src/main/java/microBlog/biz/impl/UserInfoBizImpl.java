package microBlog.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import microBlog.biz.UserInfoBiz;
import microBlog.entity.UserInfo;
import microBlog.mapper.UserInfoMapper;

@Service
public class UserInfoBizImpl implements UserInfoBiz{

	@Autowired
	private UserInfoMapper userInfoMapper;
	
	@Override
	public UserInfo fetchById(int id) {
		return userInfoMapper.fetchById(id);
	}

	@Override
	public void update(UserInfo userInfo) {
		userInfoMapper.update(userInfo);
	}
}
