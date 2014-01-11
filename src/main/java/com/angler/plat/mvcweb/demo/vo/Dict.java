/**
 * Copyright © 2014 angler Holdings Limited. All rights reserved.
 * plat by lanbery
 * @CreateTme  2014年1月11日-上午10:10:28
 */
package com.angler.plat.mvcweb.demo.vo;

/**
 * @Annotation dict entity
 * @author     wdcai
 * @Date       2014年1月11日-上午10:10:28
 */
public class Dict {

    private int id;
    
    private String code;
    
    private String name;
    
    private String des;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the des
	 */
	public String getDes() {
		return des;
	}

	/**
	 * @param des the des to set
	 */
	public void setDes(String des) {
		this.des = des;
	}
}
