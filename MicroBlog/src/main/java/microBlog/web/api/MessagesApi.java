package microBlog.web.api;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import microBlog.biz.MessagesBiz;
import microBlog.entity.Messages;

@Controller
@RequestMapping("/api/Messages")
public class MessagesApi {
	
	@Autowired
	private MessagesBiz messagesBiz;
	
	@ResponseBody
	@RequestMapping("orderfind")
	public List<Messages> orderfind() {
		return messagesBiz.orderfind();
	}
	
	@ResponseBody
	@RequestMapping("addAgreenum")
	public void addAgreenum(int id,int userId) {
		 messagesBiz.addAgreenum(id, userId);
	}
	
	
}
