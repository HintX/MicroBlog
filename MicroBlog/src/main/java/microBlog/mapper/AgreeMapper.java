package microBlog.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import microBlog.entity.Agree;

@Repository
public interface AgreeMapper {
	 void add(Agree agree);
	 void del(@Param("id")int id);
	 Agree fetchByUserIdAndMessagesId(@Param("userId")int userId,@Param("messagesId")int messagesId);
	 List<Agree> getAll(@Param("mUserId")int mUserId,
			 	@Param("statrIndex")int statrIndex,
			    @Param("pageSize")int pageSize);
}
