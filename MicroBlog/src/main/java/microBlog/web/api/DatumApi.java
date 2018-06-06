package microBlog.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import microBlog.biz.DatumBiz;
import microBlog.entity.Datum;

@Controller
@RequestMapping("/api/ Datum")
public class DatumApi {

	@Autowired
	private  DatumBiz  datumBiz;
	
	@ResponseBody
	@RequestMapping("gerenziliao")
	public Datum gerenziliao(int userId) {
		Datum datum = datumBiz.gerenziliao(userId);
		return datum;
	}
}
