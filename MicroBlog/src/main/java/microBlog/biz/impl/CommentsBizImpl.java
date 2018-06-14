package microBlog.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import microBlog.biz.CommentsBiz;
import microBlog.entity.Comments;
import microBlog.mapper.CommentsMapper;
import microBlog.mapper.UserMapper;

@Service
public class CommentsBizImpl implements CommentsBiz{
	
	@Autowired
	private CommentsMapper commentsMapper;

	@Override
	public List<Comments> getAll(int mUserId, int statrIndex, int pageSize) {
		return commentsMapper.getAll(mUserId, (statrIndex-1)*pageSize, pageSize);
	}

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans.xml");
		CommentsMapper c = ctx.getBean(CommentsMapper.class);
		System.out.println(c.getAll(1, 0, 5).get(0).getUser().getNickName());
	}
}
