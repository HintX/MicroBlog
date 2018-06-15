package microBlog.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import microBlog.entity.Collections;

@Repository
public interface CollectionsMapper {
	List<Collections> getAll();
	void delete(@Param("id")int id);
	void add(Collections collections);
}
