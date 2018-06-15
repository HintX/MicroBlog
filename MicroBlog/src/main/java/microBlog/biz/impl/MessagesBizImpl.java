package microBlog.biz.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import microBlog.biz.MessagesBiz;
import microBlog.entity.Agree;
import microBlog.entity.Messages;
import microBlog.entity.User;
import microBlog.mapper.AgreeMapper;
import microBlog.mapper.MessagesMapper;

@Service
public class MessagesBizImpl implements MessagesBiz{

	@Autowired
	private MessagesMapper messagesMapper;
	@Autowired
	private AgreeMapper agreeMapper;
	
	@Override
	public Messages fetchByUserId(int UserId, int pageNum, int pageSize) {
		return messagesMapper.fetchByUserId(UserId, (pageNum-1)*pageSize, pageSize);
	}

	@Override
	public void addAgreenum(int id,int userId) {
		Agree agree = new Agree();
		agree.setMessages(new Messages(id));
		agree.setTime(new Date());
		agree.setUser(new User(userId));
		agreeMapper.add(agree);
		messagesMapper.addAgreenum(id);
	}

	@Override
	public void delAgreenum(int id,int userId) {
		Agree agrer = agreeMapper.fetchByUserIdAndMessagesId(userId, id);
		agreeMapper.del(agrer.getId());
		messagesMapper.delAgreenum(id);
	}

	@Override
	public List<Messages> orderfind() {
		// TODO Auto-generated method stub
		return messagesMapper.orderfind();
	}

	@Override
	public void updatecollectnum(int id) {
		// TODO Auto-generated method stub
		messagesMapper.updatecollectnum(id);
	}

}
