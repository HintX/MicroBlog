package microBlog.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import microBlog.biz.AgreeBiz;
import microBlog.entity.Agree;
import microBlog.mapper.AgreeMapper;
import microBlog.mapper.CommentsMapper;

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

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans.xml");
		AgreeMapper a = ctx.getBean(AgreeMapper.class);
		System.out.println(a.getAll(1, 1, 5).get(0).getUser().getNickName());
	}
}
