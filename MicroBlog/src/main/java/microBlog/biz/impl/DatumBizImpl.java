package microBlog.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import microBlog.biz.DatumBiz;
import microBlog.entity.Datum;
import microBlog.mapper.DatumMapper;

@Service
public class DatumBizImpl implements DatumBiz{

	@Autowired
	private DatumMapper datumMapper;
	
	@Override
	public Datum gerenziliao(int userId) {
		return datumMapper.gerenziliao(userId);
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans.xml");
		DatumMapper b = ctx.getBean(DatumMapper.class);
		System.out.println(b.gerenziliao(1));
	}
}
