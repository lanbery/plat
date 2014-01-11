/**
 * Copyright © 2014 angler Holdings Limited. All rights reserved.
 * plat by lanbery
 * @CreateTme  2014年1月11日-下午7:02:29
 */
package com.angler.plat.mvcweb.demo.task;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Annotation //TODO
 * @author wdcai
 * @Date 2014年1月11日-下午7:02:29
 */
public class DemoJob {
	SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
	int i = 0;

	public void work() {
		
		System.out.println("DemoJob is work at Time : " +sdf.format(new Date()).toString());
	}
}
