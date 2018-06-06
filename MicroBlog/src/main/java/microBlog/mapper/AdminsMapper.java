package microBlog.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import microBlog.entity.Admins;

@Repository
public interface AdminsMapper {
	Admins checkLogin(@Param("userName")String userName,@Param("passWord")String passWord);
	void register(Admins Admins);
	void update(Admins admins);
	void updateState(@Param("id")int id,@Param("state")int state);
	Admins fetchById(@Param("id")int id);
	Admins fetchByUserName(@Param("userName")String userName);
}
