package microBlog.biz;


import microBlog.entity.Messages;

public interface MessagesBiz {
	 Messages fetchByUserId(int UserId,int pageNum,int pageSize);
	 void addAgreenum(int id,int userId);
	 void delAgreenum(int id,int userId);
}
