/**
 * Copyright © 2014 angler Holdings Limited. All rights reserved.
 * plat by lanbery
 * @CreateTme  2014年1月11日-上午10:15:39
 */
package com.angler.plat.mvcweb.demo.service;

import java.util.List;

import com.angler.plat.mvcweb.demo.vo.Dict;

/**
 * @Annotation 业务处理接口
 * @author     wdcai
 * @Date       2014年1月11日-上午10:15:39
 */
public interface DictService {
	/**
	 * 
	 * @Annotation 查询所有Dict 列表
	 * @CreateBy   wdcai
	 * @return
	 */
	List<Dict> getAll();
	
	Dict get(String id);
}
