/**
 * Copyright © 2014 angler Holdings Limited. All rights reserved.
 * plat by lanbery
 * @CreateTme  2014年1月11日-下午2:41:09
 */
package com.angler.plat.mvcweb.common;

/**
 * @Annotation //TODO
 * @author     wdcai
 * @Date       2014年1月11日-下午2:41:09
 */
public enum ResultType {
	
	JSON("result/json.jsp"),ERROR("result/error.jsp"),ERROR404("result/404.jsp");
	
	private String path;
	
	ResultType(String path){
		this.path = path;
	}
	@Override
	public String toString(){
		return path;
	}
}
