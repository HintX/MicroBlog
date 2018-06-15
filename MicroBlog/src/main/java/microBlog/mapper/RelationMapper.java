package microBlog.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import microBlog.entity.Relation;

@Repository
public interface RelationMapper {

	 Relation UpdateFans(@Param("userId")int userId,@Param("byId")int byId);
	 
	 List<Relation> findcount(@Param("userId")int userId);
	 
	 void addreation(@Param("userId")int userId,@Param("byId")int byId);
}

