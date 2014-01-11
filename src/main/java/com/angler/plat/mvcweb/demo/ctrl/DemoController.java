/**
 * Copyright © 2014 angler Holdings Limited. All rights reserved.
 * plat by lanbery
 * @CreateTme  2014年1月11日-上午9:54:36
 */
package com.angler.plat.mvcweb.demo.ctrl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.angler.plat.mvcweb.common.ResultType;
import com.angler.plat.mvcweb.common.util.GsonHelper;
import com.angler.plat.mvcweb.demo.service.DictService;
import com.angler.plat.mvcweb.demo.vo.Dict;

/**
 * @Annotation REST DEMO
 * @author     wdcai
 * @Date       2014年1月11日-上午9:54:36
 */
@Controller
@RequestMapping("/demo")
public class DemoController {
	@Autowired
	private DictService dictService;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET
	)
	public @ResponseBody Dict testGet(@PathVariable("id") String id ){	
		Dict dict = dictService.get(id);
		System.out.println("lst>>"+GsonHelper.Object2Json(dict));
		System.out.println("id="+id);
		return dict;
	}
	
	@RequestMapping(value="/dict",method=RequestMethod.GET)
	public String testQuery(HttpServletRequest request){
		List<Dict> lst = dictService.getAll();
		//System.out.println("lst>>"+GsonHelper.Object2Json(lst));
		request.setAttribute("json", GsonHelper.Object2Json(lst));
		
		return ResultType.JSON.toString();
	}
	
	
}
