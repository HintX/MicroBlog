package microBlog.mapper;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import microBlog.entity.User;

@Repository
public interface UserMapper {
	User checkLogin(@Param("email")String email,@Param("passWord")String passWord);
	void register(User user);
	User fetchUserByEmail(@Param("email")String email);
	void updateStatus(@Param("id")int id,@Param("status")int status);
	User fetchById(@Param("id")int id);
	//只可以改昵称密码
	void update(User user);
}
