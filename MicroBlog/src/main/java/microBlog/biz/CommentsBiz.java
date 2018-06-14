package microBlog.biz;

import java.util.List;
import microBlog.entity.Comments;

public interface CommentsBiz {
	List<Comments> getAll(int mUserId,int statrIndex,int pageSize);
}
