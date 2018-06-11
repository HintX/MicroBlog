package microBlog.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import microBlog.entity.Messages;

@Repository
public interface MessagesMapper {
	 Messages fetchByUserId(@Param("UserId")int UserId,
			   @Param("statrIndex")int statrIndex,
			   @Param("pageSize")int pageSize);
	 void addAgreenum(@Param("id")int id);
	 void delAgreenum(@Param("id")int id);
}
