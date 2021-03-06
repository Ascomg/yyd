package com.yuyuedao.yydwechat.controller;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.yuyuedao.yydwechat.entity.GridRequestDto;
import com.yuyuedao.yydwechat.entity.WPNewsdetails;
import com.yuyuedao.yydwechat.entity.W_p_newsDetails;
import com.yuyuedao.yydwechat.service.NewsService;
import com.yuyuedao.yydwechat.util.FileUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


@Controller
@RequestMapping("/news")
public class NewsController {

	@Resource
	private NewsService newsService;

	@RequestMapping(value = "/gridlist", method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> gridlist(@Param("title") String title, GridRequestDto dto) {
		int index=dto.getPageIndex()-1;
		int size=dto.getPageSize();
		int start = index * size, limit = start + size;
		Map<String,Object> map=null;
		Map<String,Object> rmap=null;
		try{

			 rmap =newsService.getList(title,start,limit);
		}catch(Exception e){
			e.printStackTrace();
			rmap=new HashMap<String,Object>();
			rmap.put("message", e.getMessage());
			rmap.put("status", false);
		}
		return rmap; 
	}


	@RequestMapping(value = "/additem", method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> additem(W_p_newsDetails newsDetails){
		Map<String,Object> returnMap=null;
		try{
			if(newsDetails!=null){
				returnMap=new HashMap<>();
				Integer count=newsService.addInfo(newsDetails);
				if(count>0){
					returnMap.put("status", true);
					returnMap.put("message", "新增信息成功！");
				}else{
					returnMap.put("status", false);
					returnMap.put("message", "没有新增的信息!");
				}

			}else{
				returnMap.put("status", false);
				returnMap.put("message", "没有新增的信息!");
			}
		}catch(Exception e){
			e.printStackTrace();
			returnMap.put("message", e.getMessage());
			returnMap.put("status", false);
		}

		return returnMap;
	}

	@RequestMapping(value = "/edititem", method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> edititem(WPNewsdetails newsDetails){
		Map<String,Object> returnMap=new HashMap<>();
		try{
			if(newsDetails!=null){
				Integer count=newsService.editInfo(newsDetails);
				if(count>0){
					returnMap.put("status", true);
					returnMap.put("message", "修改信息成功！");
				}else{
					returnMap.put("status", false);
					returnMap.put("message", "没有新增的信息!");
				}

			}else{
				returnMap.put("status", false);
				returnMap.put("message", "没有新增的信息!");
			}
		}catch(Exception e){
			e.printStackTrace();
			returnMap.put("message", e.getMessage());
			returnMap.put("status", false);
		}

		return returnMap;
	}

	@RequestMapping(value = "/uploadold", method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> uploadold(HttpServletRequest request) {
		Map<String,Object> rmap =null;
	    try {
	      rmap = newsService.upLoad(request);
	    } catch (Exception e) {
	    	e.printStackTrace();
		  	rmap=new HashMap<String,Object>();
			rmap.put("message", e.getMessage());
			rmap.put("status", false);
			rmap.put("code", 2);
			rmap.put("msg", e.getMessage());
	    }
	    return rmap;
	}


	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> projectPictureUpload(@RequestParam(value = "projectImg",required = true) MultipartFile file) throws FileNotFoundException {
		Map<String,Object> rmap =null;
		//将图片上传到服务器
		if(file.isEmpty()){
			rmap=new HashMap<String,Object>();
			rmap.put("message","项目图片不能为空");
			rmap.put("status", false);
			rmap.put("code", 2);
			rmap.put("msg", "项目图片不能为空");
			return rmap;
		}
		//原始文件名
		String originalFilename = file.getOriginalFilename();
		//文件后缀
		String suffix = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
		//图片名称为uuid+图片后缀防止冲突
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		String fileName = formatter.format(date)+"."+suffix;
		//String fileName = UUID.randomUUID().toString()+"."+suffix;
		String os = System.getProperty("os.name");
		//文件保存路径
		String filePath="";
		//if(os.toLowerCase().startsWith("win")){
			//windows下的路径
			String classpath = ResourceUtils.getFile("classpath:").getAbsolutePath();
			filePath="D:/work/yydwechat/src/main/resources/static/imgs/";

//		}else {
//			//linux下的路径
//			filePath="/root/pictureUpload/project/";
//		}
		try {
			//写入图片
			Boolean writePictureflag = FileUtil.uploadFile(file.getBytes(),filePath,fileName);
			if(writePictureflag == false){
				//上传图片失败
				rmap=new HashMap<String,Object>();
				rmap.put("message","上传图片失败");
				rmap.put("status", false);
				rmap.put("code", 2);
				rmap.put("msg", "上传图片失败");
				return rmap;
			}
			//上传成功后，将可以访问的完整路径返回
			String fullImgpath = "imgs/"+fileName;
			rmap=new HashMap<String,Object>();
			rmap.put("newName",fullImgpath);
			rmap.put("message","上传图片成功");
			rmap.put("status", true);
			rmap.put("code", 2);
			rmap.put("msg", "上传图片成功");
			return rmap;
		} catch (Exception e) {
			e.printStackTrace();
			//上传图片失败
			rmap=new HashMap<String,Object>();
			rmap.put("message","上传图片失败");
			rmap.put("status", false);
			rmap.put("code", 2);
			rmap.put("msg", "上传图片失败");
			return rmap;
		}
	}

	@RequestMapping(value = "deleteitem", method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> deleteItem(@Param("id") Integer id){
		Map<String,Object> returnMap=new HashMap<String,Object>();
		try{
			Integer count=newsService.deleteInfo(id);
			if(count==-1){
				returnMap.put("status",false);
				returnMap.put("message", "该素材正在使用不能删除!");
				return returnMap;
			}
			if(count>0){
				returnMap.put("status",true);
				returnMap.put("message", "删除成功");
			}else{
				returnMap.put("status",false);
				returnMap.put("message", "删除失败");
			}
		}catch(Exception e){
			e.printStackTrace();
			//上传图片失败
			returnMap.put("message",e.getMessage());
			returnMap.put("status", false);
		}

		return returnMap;
	}


	@RequestMapping(value = "/getNewsList", method = RequestMethod.GET)
	public @ResponseBody
	Map<String,Object> getNewsList()  {
		Map<String,Object> returnMap=new HashMap<String,Object>();
		try{
			List<W_p_newsDetails>  newsDetailsList=newsService.getNewsList();
			if(newsDetailsList.size()>0){
				returnMap.put("code",newsDetailsList);
				returnMap.put("status",true);
			}else{
				returnMap.put("status",false);
			}
		}catch(Exception e){
			e.printStackTrace();
			returnMap.put("status",false);
			returnMap.put("message",e.getMessage());
		}

		return returnMap;
	}


	@RequestMapping(value = "/saveNews", method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> saveNews(@RequestParam(value = "sid",required = false) String sid, @RequestParam ("parms") String newsList){
		Map<String,Object> returnMap=new HashMap<String,Object>();
		String[] items=newsList.split("-");
		try{
			if(newsList!=null&&newsList.length()>0){
				Integer count=newsService.saveNews(sid,items);
				if(count>0){
					returnMap.put("status", true);
					returnMap.put("message", "新增成功!");
				}
				if(count==-1){
					returnMap.put("status", false);
					returnMap.put("message", "关键字图文回复已存在!");
				}
				if(count==-2){
					returnMap.put("status", false);
					returnMap.put("message", "删除失败!");
				}

			}else{
				returnMap.put("status", false);
				returnMap.put("message", "没有新增的信息!");
			}
		}catch(Exception e){
			e.printStackTrace();

			returnMap.put("message", e.getMessage());
			returnMap.put("status", false);
		}

		return returnMap;
	}


	@RequestMapping(value = "/getBySid", method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> getBySid(@RequestParam("sid") String sid)  {
		Map<String,Object> returnMap =new HashMap<String,Object>();
		try{
			if(sid!=null&&sid.length()>0){
				returnMap.put("data",newsService.getInfo(sid));
				returnMap.put("status", true);
			}else{
				returnMap.put("status", false);
				returnMap.put("message", "请选择需要修改的记录!");
			}
		}catch(Exception e){
			e.printStackTrace();
			returnMap.put("message", e.getMessage());
			returnMap.put("status", false);
		}
		return returnMap;
	}



	@RequestMapping(value = "/deletefile", method = RequestMethod.POST)
	@ResponseBody
	public boolean deletefile(HttpServletRequest request, HttpServletResponse response){
		String srch_nr = request.getParameter("srch_nr");// 文件夹路径
		newsService.deletefile(srch_nr,request);
		return true;
	}




}
