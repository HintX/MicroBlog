package microBlog.biz;

import java.util.List;

import microBlog.entity.Collections;


public interface CollectionsBiz {
	List<Collections> getAll();
	void delete(int id);
	void add(Collections collections);
}
