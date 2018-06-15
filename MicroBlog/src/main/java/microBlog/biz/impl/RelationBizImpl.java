package microBlog.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import microBlog.biz.RelationBiz;
import microBlog.entity.Relation;
import microBlog.mapper.RelationMapper;

@Service
public class RelationBizImpl implements RelationBiz{

	@Autowired
	private RelationMapper relationMapper;
	
	@Override
	public Relation UpdateFans(int userId, int byId) {
		return relationMapper.UpdateFans(userId, byId);
	}

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans.xml");
		RelationBiz r = ctx.getBean(RelationBiz.class);
		r.addreation(1,4);
	}

	@Override
	public List<Relation> findcount(int userId) {
		// TODO Auto-generated method stub
		return relationMapper.findcount(userId);
	}

	@Override
	public void addreation(int userId, int byId) {
		// TODO Auto-generated method stub
		relationMapper.addreation(userId, byId);
	}
}
