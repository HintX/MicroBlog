package microBlog.biz;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import microBlog.entity.Messages;

public interface MessagesBiz {
	 Messages fetchByUserId(int UserId,int pageNum,int pageSize);
	 void addAgreenum(int id,int userId);
	 void delAgreenum(int id,int userId);
	 List<Messages> orderfind();
	 void updatecollectnum(@Param("id")int id); 
}
