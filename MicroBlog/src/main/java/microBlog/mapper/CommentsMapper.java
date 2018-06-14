package microBlog.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import microBlog.entity.Comments;

@Repository
public interface CommentsMapper {
	 List<Comments> getAll(@Param("mUserId")int mUserId,
			 	@Param("statrIndex")int statrIndex,
			    @Param("pageSize")int pageSize);
}
