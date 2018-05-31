package microBlog.web.api;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import microBlog.biz.impl.UserBizImpl;
import microBlog.entity.User;

@RestController
@RequestMapping("/api/User")
public class UserApi {
	
	@Autowired
	private UserBizImpl userBizImpl;
	
	@RequestMapping("checkLogin")
	public boolean checkLogin(String email,String passWord,HttpSession session) {
		boolean isTrue = false;
		Md5PasswordEncoder md5 = new Md5PasswordEncoder();
		String Md5Name = md5.encodePassword(passWord,email);
		User user = userBizImpl.checkLogin(email, Md5Name);
		if(user!=null) {
			 session.setAttribute("user", user);
			 isTrue = true;
		}else {
			 isTrue = false;
		}
		return isTrue;
	}
	
	@RequestMapping("logOut")
	public boolean loginOut(HttpSession session) {
		session.setAttribute("user", null);
		return true;
	}
}
