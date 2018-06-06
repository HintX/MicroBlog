package microBlog.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import microBlog.entity.Topic;

@Repository
public interface TopicMapper {
	void add(Topic topic);
	void updateState(@Param("id")int id,@Param("state")int state);
	void update(Topic topic);
	Topic fetchById(@Param("id")int id);
	
	//根据自己需求写下面的方法  需要分页或者条件自己加
	List<Topic> getAll();
	List<Topic> fetchByName(@Param("name")String name);
}
