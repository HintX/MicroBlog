package microBlog.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import microBlog.entity.Topic;

public interface TopicMapper {
	void add(Topic topic);
	void updateState(@Param("id")int id,@Param("state")int state);
	void update(Topic topic);
	Topic fetchById(int id);
	
	//根据自己需求写下面的方法  需要分页或者条件自己加
	List<Topic> getAll();
	List<Topic> fetchByName(String name);
}
