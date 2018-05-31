package microBlog.mapper;

import java.util.List;

import microBlog.entity.Topic;

public interface TopicMapper {
	void add(Topic topic);
	void updateState(int id,int state);
	void update(Topic topic);
	Topic fetchById(int id);
	
	
	List<Topic> getAll();
	List<Topic> fetchByName(String name);
}
