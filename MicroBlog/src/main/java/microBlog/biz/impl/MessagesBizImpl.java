package microBlog.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import microBlog.biz.MessagesBiz;
import microBlog.entity.Messages;
import microBlog.mapper.MessagesMapper;

@Service
public class MessagesBizImpl implements MessagesBiz{

	@Autowired
	private MessagesMapper messagesMapper;
	
	@Override
	public Messages fetchByUserId(int UserId, int pageNum, int pageSize) {
		return messagesMapper.fetchByUserId(UserId, (pageNum-1)*pageSize, pageSize);
	}

}
