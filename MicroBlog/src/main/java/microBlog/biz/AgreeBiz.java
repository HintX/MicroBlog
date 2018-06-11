package microBlog.biz;


import java.util.List;


import microBlog.entity.Agree;

public interface AgreeBiz {
	void add(Agree agree);
	void del(int id);
	Agree fetchByUserIdAndMessagesId(int userId,int messagesId);
	List<Agree> getAll(int mUserId,int pageNum,int pageSize);
}
