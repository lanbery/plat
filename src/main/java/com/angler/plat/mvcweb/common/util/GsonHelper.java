/**
 * Copyright © 2014 angler Holdings Limited. All rights reserved.
 * plat by lanbery
 * @CreateTme  2014年1月11日-上午10:28:33
 */
package com.angler.plat.mvcweb.common.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * @Annotation JSON CONVERT HELPER
 * @author     wdcai
 * @Date       2014年1月11日-上午10:28:33
 */
public class GsonHelper {
	
	private static Gson gson;
	
	static {
		gson = new Gson();
	}
	
	public static String Object2Json(Object src){
		return gson.toJson(src);
	}

	/**
	 * @Annotation 
	 * @CreateBy   wdcai
	 * @param args
	 */
	public static void main(String[] args) {
		List<Map> l = new ArrayList<Map>();
		Map m;
		for(int i=0;i<5;i++){
			String id = "id_"+i;
			String name = "name_"+i;
			m = new HashMap();
			m.put(id, name);
			l.add(m);
		}
		String s =gson.toJson(l, new TypeToken<List<Map>>(){}.getType());
		System.out.println(s);
		System.out.println(GsonHelper.Object2Json(l));
	}

}
