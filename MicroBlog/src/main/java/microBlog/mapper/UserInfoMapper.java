package microBlog.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import microBlog.entity.UserInfo;

@Repository
public interface UserInfoMapper {
	UserInfo fetchById(@Param("id")int id);
	void update(UserInfo userInfo);
}
