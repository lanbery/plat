/**
 * Copyright © 2014 angler Holdings Limited. All rights reserved.
 * plat by lanbery
 * @CreateTme  2014年1月11日-上午10:20:02
 */
package com.angler.plat.mvcweb.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angler.plat.mvcweb.demo.dao.DictMapper;
import com.angler.plat.mvcweb.demo.service.DictService;
import com.angler.plat.mvcweb.demo.vo.Dict;

/**
 * @Annotation 业务接口实现
 * @author     wdcai
 * @Date       2014年1月11日-上午10:20:02
 */
@Service("dictService")
public class DictServiceImpl implements DictService {
	@Autowired
	private DictMapper dictMapper;

	/* (non-Javadoc)
	 * @see com.angler.plat.mvcweb.demo.service.DictService#getAll()
	 */
	@Override
	public List<Dict> getAll() {
		return dictMapper.getAll();
	}

	/* (non-Javadoc)
	 * @see com.angler.plat.mvcweb.demo.service.DictService#get(java.lang.String)
	 */
	@Override
	public Dict get(String id) {
		return dictMapper.get(id);
	}

}
