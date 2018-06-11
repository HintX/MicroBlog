package microBlog.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import microBlog.biz.AgreeBiz;
import microBlog.entity.Agree;
import microBlog.mapper.AgreeMapper;

@Service
public class AgreeBizImpl implements AgreeBiz{

	@Autowired
	private AgreeMapper agreeMapper;
	
	@Override
	public void add(Agree agree) {
		agreeMapper.add(agree);
	}

	@Override
	public void del(int id) {
		agreeMapper.del(id);
	}

	@Override
	public Agree fetchByUserIdAndMessagesId(int userId, int messagesId) {
		return agreeMapper.fetchByUserIdAndMessagesId(userId, messagesId);
	}

	@Override
	public List<Agree> getAll(int mUserId, int pageNum, int pageSize) {
		return agreeMapper.getAll(mUserId, (pageNum-1)*pageSize, pageSize);
	}

}
