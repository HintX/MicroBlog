package microBlog.web.api;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import microBlog.biz.UserBiz;
import microBlog.entity.User;

@Controller
@RequestMapping("/api/User")
public class UserApi {
	
	@Autowired
	private UserBiz userBiz;
	
	@ResponseBody
	@RequestMapping("checkLogin")
	public boolean checkLogin(String email,String passWord,HttpSession session) {
		boolean isTrue = false;
		Md5PasswordEncoder md5 = new Md5PasswordEncoder();
		String Md5Name = md5.encodePassword(passWord,email);
		User user = userBiz.checkLogin(email, Md5Name);
		if(user!=null) {
			 session.setAttribute("user", user);
			 isTrue = true;
		}else {
			 isTrue = false;
		}
		return isTrue;
	}
	
	@ResponseBody
	@RequestMapping("logOut")
	public boolean loginOut(HttpSession session) {
		session.setAttribute("user", null);
		return true;
	}	
	
	@ResponseBody
	@RequestMapping("register")
	public boolean register(User user) {
		boolean isTrue = false;
		Md5PasswordEncoder md5 = new Md5PasswordEncoder();
		String Md5Name = md5.encodePassword(user.getPassWord(),user.getEmail());
		user.setPassWord(Md5Name);
		userBiz.register(user);
		if(user.getId()!=0) {
			isTrue = true;
		}else{
			isTrue = false;
		}
		return isTrue;
	}
}
