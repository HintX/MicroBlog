package microBlog.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import microBlog.biz.CollectionsBiz;
import microBlog.biz.MessagesBiz;
import microBlog.entity.Collections;
import microBlog.entity.Messages;

@Controller
@RequestMapping("/api/Collections")
public class CollectionsApi {
	@Autowired
	private CollectionsBiz collectionsBiz;
	@Autowired
	private MessagesBiz messagesBiz;
	
	@ResponseBody
	@RequestMapping("addcollections")
	public void orderfind(Collections c) {
		messagesBiz.updatecollectnum(c.getMessages().getId());
		collectionsBiz.add(c);
	}
}
