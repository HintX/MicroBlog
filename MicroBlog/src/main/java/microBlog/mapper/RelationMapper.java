package microBlog.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import microBlog.entity.Relation;

@Repository
public interface RelationMapper {

	 Relation UpdateFans(@Param("userId")int userId,@Param("byId")int byId);
}

