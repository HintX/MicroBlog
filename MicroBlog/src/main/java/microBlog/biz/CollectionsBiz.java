package microBlog.biz;

import java.util.Collections;
import java.util.List;


public interface CollectionsBiz {
	List<Collections> getAll();
	void delete(int id);
	void add(Collections collections);
}
