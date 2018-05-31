package microBlog.web.api;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import microBlog.biz.impl.AdminsBizImpl;
import microBlog.entity.Admins;

@RestController
@RequestMapping("/api/Admins")
public class AdminsApi {
	
	@Autowired
	private AdminsBizImpl adminsBizImpl;
	
	@RequestMapping("checkLogin")
	public boolean checkLogin(String userName,String passWord,HttpSession session) {
		boolean isTrue = false;
		Md5PasswordEncoder md5 = new Md5PasswordEncoder();
		String Md5Name = md5.encodePassword(passWord,userName);
		Admins admins = adminsBizImpl.checkLogin(userName, Md5Name);
		if(admins!=null) {
			 session.setAttribute("admins", admins);
			 isTrue = true;
		}else {
			 isTrue = false;
		}
		return isTrue;
	}
	
	@RequestMapping("logOut")
	public boolean loginOut(HttpSession session) {
		session.setAttribute("admins", null);
		return true;
	}
}
