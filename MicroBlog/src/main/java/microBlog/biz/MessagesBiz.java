package microBlog.biz;

import microBlog.entity.Messages;

public interface MessagesBiz {
	Messages fetchByUserId(int UserId,int pageNum,int pageSize);

}
