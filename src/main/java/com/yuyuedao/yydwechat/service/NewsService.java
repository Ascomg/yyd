package com.yuyuedao.yydwechat.service;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.yuyuedao.yydwechat.entity.News;
import com.yuyuedao.yydwechat.entity.WPNewsdetails;
import com.yuyuedao.yydwechat.entity.W_p_newsDetails;


public interface NewsService {

	
	 Map<String,Object> getList(String title, int start, int limit);

	 int addInfo(W_p_newsDetails newsDetails);


	 Map<String, Object> upLoad(HttpServletRequest request);


	 int deleteInfo(Integer id);

	 List<W_p_newsDetails> getNewsList();

	 W_p_newsDetails getInfo(String sid);


	 List<News> getByNewsId(String newSid);


	int saveNews(String sid, String[] items);

	int editInfo(WPNewsdetails wpNewsdetails);


	void deletefile(String srch_nr, HttpServletRequest request);


}
