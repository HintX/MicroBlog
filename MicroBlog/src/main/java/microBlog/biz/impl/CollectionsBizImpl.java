package microBlog.biz.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import microBlog.biz.CollectionsBiz;
import microBlog.mapper.CollectionsMapper;

@Service
public class CollectionsBizImpl implements CollectionsBiz{

	@Autowired
	private CollectionsMapper collectionsMapper;
	
	@Override
	public List<Collections> getAll() {
		return collectionsMapper.getAll();
	}

	@Override
	public void delete(int id) {
		collectionsMapper.delete(id);
	}

	@Override
	public void add(Collections collections) {
		collectionsMapper.add(collections);
	}

}
