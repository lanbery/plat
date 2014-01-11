/**
 * Copyright © 2014 angler Holdings Limited. All rights reserved.
 * plat by lanbery
 * @CreateTme  2014年1月11日-上午10:05:42
 */
package com.angler.plat.mvcweb.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.angler.plat.mvcweb.demo.vo.Dict;
import com.googlecode.ehcache.annotations.Cacheable;

/**
 * @Annotation Dict mapper
 * @author     wdcai
 * @Date       2014年1月11日-上午10:05:42
 */
@Repository
public interface DictMapper {
	@Cacheable(cacheName="baseCache")
	List<Dict> getAll();
	@Cacheable(cacheName="baseCache")
	Dict get(String id);
	
	
}
