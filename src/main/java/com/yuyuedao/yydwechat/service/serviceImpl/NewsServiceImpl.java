package com.yuyuedao.yydwechat.service.serviceImpl;


import com.yuyuedao.yydwechat.entity.*;
import com.yuyuedao.yydwechat.mapper.KeyMapper;
import com.yuyuedao.yydwechat.mapper.NewsMapper;
import com.yuyuedao.yydwechat.mapper.generator.WPGzhfMapper;
import com.yuyuedao.yydwechat.mapper.generator.WPNewsdetailsMapper;
import com.yuyuedao.yydwechat.service.NewsService;

import com.yuyuedao.yydwechat.util.FileUtil;
import com.yuyuedao.yydwechat.util.IUserConstants;
import com.yuyuedao.yydwechat.util.PublicMethod;
import com.yuyuedao.yydwechat.util.WxConstants;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Service
public class NewsServiceImpl extends PublicMethod implements NewsService {
	@Resource
	private NewsMapper newsMapper;

	@Resource
	private KeyMapper keyMapper;

	@Resource
	private WPGzhfMapper wpGzhfMapper;

	@Resource
	private WPNewsdetailsMapper wpNewsdetailsMapper;


	@Override
	public Map<String, Object> getList(String title, int start, int limit) {
		Map<String,Object> returnMap=new HashMap<String,Object>();
		returnMap.put("data", newsMapper.selectAll(title,start,limit));
		//returnMap.put("total", dao.getSeqBySql(sql));
		returnMap.put("status", true);
		return returnMap;
	}

	@Override
	public int addInfo(W_p_newsDetails newsDetails) {
		return newsMapper.addInfo(newsDetails);
	}

		public Map<String, Object> upLoad(HttpServletRequest request)  {
		Map<String, Object> rmap = new HashMap<String, Object>();
		String filepath=request.getSession().getServletContext().getRealPath("");
		String saveDir = request.getParameter("saveDir");

		return rmap;
	}

	@Override
	public int deleteInfo(Integer id) {
		 if(newsMapper.getCount(id)>0){
		 	return -1;
		 }

//				if(Integer.parseInt(dao.getSeqBySql(" select count(*) from w_p_news where itemsid='"+id+"' "))>0){
//
//			rmap.put("status", false);
//			rmap.put("message", "该素材正在使用不能删除!");


			ServletContext context = getRequest().getSession().getServletContext();
		    W_p_newsDetails news =newsMapper.getInfo(id);

		    if(news!=null){
				//String pic_path = dao.getSeqBySql("select picurl from w_p_newsitem where sid="+id+"");
				if(news.getPicUrl()!=null&&!news.getPicUrl().contains("resources")){

					String picRealPath = context.getRealPath(news.getPicUrl());
					FileUtil.deleteFile(picRealPath);
				}
				//String pic_path2= dao.getSeqBySql("select smallpic from w_p_newsitem where sid="+id+"");
				if(news.getPicUrl()!=null&&news.getSmallPic().contains("resources")){
					String picRealPath2 = context.getRealPath(news.getSmallPic());
					FileUtil.deleteFile(picRealPath2);
				}
			}



//			dao.executeSql("delete from W_p_newsitem where sid ="+id+" ");
//			log.log(menu_id, id, "删除");
//			rmap.put("status", true);
//			rmap.put("message", "操作成功!");


		return newsMapper.deleteItems(id);
	}

	@Override
	public List<W_p_newsDetails> getNewsList() {
		return newsMapper.selectByAccountId(getDataBySession(IUserConstants.accountid));
	}

	@Override
	public W_p_newsDetails getInfo(String sid) {
		return newsMapper.getInfo(Integer.parseInt(sid));
	}

	@Override
	public List<News> getByNewsId(String newSid) {
		return newsMapper.getByNewsId(newSid,getDataBySession(IUserConstants.accountid));
	}


	@Override
	public int saveNews(String sid, String[] items) {

		String newSid="";
		String accountId=getDataBySession(IUserConstants.accountid);

		if(sid==null||"".equals(sid)){
				newSid=keyMapper.getNewsId(sid);
				WPGzhf info=new WPGzhf();
				info.setAccountid(accountId);
				info.setStype(items[items.length-1]);
				info.setNewsid(newSid);
				info.setAddtime(new Date());
				wpGzhfMapper.insert(info);

		}else{

				newSid=keyMapper.getNewsId(sid);
				if(null!=newSid&&!"".equals(newSid)){
					int deleteCount= newsMapper.delete(newSid);
					if(deleteCount>0){
						if(items.length==1){
							//newsMapper.updateInfo(newSid,items[items.length-1],accountId);
							WPGzhf info=new WPGzhf();
							info.setStype(items[items.length-1]);
							info.setType("news");
							info.setNewsid(newSid);
							info.setSid(Integer.parseInt(sid));
							info.setAccountid(accountId);
							info.setAddtime(new Date());
							wpGzhfMapper.updateByPrimaryKey(info);
						}
					}else{
						return -2;
					}

				}else{
					newSid=keyMapper.getNewsId(null);
					WPGzhf info=new WPGzhf();
					info.setStype(items[items.length-1]);
					info.setType("news");
					info.setNewsid(newSid);
					info.setSid(Integer.parseInt(sid));
					info.setAccountid(accountId);
					info.setAddtime(new Date());
					wpGzhfMapper.updateByPrimaryKey(info);
				}




		}
		List<W_p_news> newsList=new ArrayList<>();
		for(int i=1;i<items.length;i++){

			W_p_news news=new W_p_news();
			news.setNewSid(newSid);
			news.setItemSid(items[i-1]);
			news.setAccountId(accountId);
			news.setOrders(i);
			newsList.add(news);
		}

		return newsMapper.add(newsList);
		//log.log(menu_id, newsid, "关键字图文回复");
	}

	@Override
	public int editInfo(WPNewsdetails wpNewsdetails) {
		wpNewsdetails.setOpdate(new Date());
		return wpNewsdetailsMapper.updateByPrimaryKeySelective(wpNewsdetails);
	}


	public void deletefile(String srch_nr, HttpServletRequest request) {
		// 保存文件 文件夹路径
		String rootPath = WxConstants.fileurl+srch_nr;
		FileUtil.deleteFile(rootPath);
	}



}
