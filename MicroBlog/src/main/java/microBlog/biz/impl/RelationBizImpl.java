package microBlog.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
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

}
