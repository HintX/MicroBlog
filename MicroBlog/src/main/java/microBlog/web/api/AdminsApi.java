package microBlog.web.api;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import microBlog.biz.AdminsBiz;
import microBlog.entity.Admins;

@Controller
@RequestMapping("/api/Admins")
public class AdminsApi {
	
	@Autowired
	private AdminsBiz adminsBiz;
	
	@ResponseBody
	@RequestMapping("checkLogin")
	public boolean checkLogin(String userName,String passWord,HttpSession session) {
		boolean isTrue = false;
		Md5PasswordEncoder md5 = new Md5PasswordEncoder();
		String Md5Name = md5.encodePassword(passWord,userName);
		Admins admins = adminsBiz.checkLogin(userName, Md5Name);
		if(admins!=null) {
			 session.setAttribute("admins", admins);
			 isTrue = true;
		}else {
			 isTrue = false;
		}
		return isTrue;
	}
	
	@ResponseBody
	@RequestMapping("logOut")
	public boolean loginOut(HttpSession session) {
		session.setAttribute("admins", null);
		return true;
	}
	
	@ResponseBody
	@RequestMapping("register")
	public boolean register(Admins admins) {
		boolean isTrue = false;
		Md5PasswordEncoder md5 = new Md5PasswordEncoder();
		String Md5Name = md5.encodePassword(admins.getPassWord(),admins.getUserName());
		admins.setPassWord(Md5Name);
		adminsBiz.register(admins);
		if(admins.getId()!=0) {
			isTrue = true;
		}else{
			isTrue = false;
		}
		return isTrue;
	}
}
