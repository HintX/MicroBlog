package microBlog.biz;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import microBlog.entity.Relation;

public interface RelationBiz {
	 Relation UpdateFans(int userId,int byId);

	 List<Relation> findcount(@Param("userId")int userId);
	 
	 void addreation(@Param("userId")int userId,@Param("byId")int byId);
}
