package microBlog.mapper;


import org.apache.ibatis.annotations.Param;

import microBlog.entity.User;

public interface UserMapper {
	User checkLogin(@Param("email")String email,@Param("passWord")String passWord);
	void register(User user);
	User fetchUserByEmail(String email);
	void updateStatus(@Param("id")int id,@Param("status")int status);
	User fetchById(int id);
	//只可以改昵称密码
	void update(User user);
}
