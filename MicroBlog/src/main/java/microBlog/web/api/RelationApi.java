package microBlog.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import microBlog.biz.MessagesBiz;
import microBlog.biz.RelationBiz;
import microBlog.entity.Messages;

@Controller
@RequestMapping("/api/Relation")
public class RelationApi {
	@Autowired
	private RelationBiz relationBiz;
	
	@ResponseBody
	@RequestMapping("findcount")
	public int findcount(int userid) {
		return relationBiz.findcount(userid).size();
	}
	
	@ResponseBody
	@RequestMapping("addreation")
	public void addreation(int userid,int byId) {
		relationBiz.addreation(userid, byId);
	}
}
