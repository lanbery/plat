/**
 * Copyright © 2014 angler Holdings Limited. All rights reserved.
 * plat by lanbery
 * @CreateTme  2014年1月11日-下午2:07:39
 */
package com.angler.plat.mvcweb.demo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.angler.plat.mvcweb.demo.service.DictService;
import com.angler.plat.mvcweb.demo.vo.Dict;

/**
 * @Annotation //TODO
 * @author     wdcai
 * @Date       2014年1月11日-下午2:07:39
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:**/*.xml,")
public class DictServiceTest {
	@Autowired
	DictService dictService;
	
	@Test
	public void testGetAll(){
		List<Dict> l = dictService.getAll();
		System.out.println(l.size());
	}

}
