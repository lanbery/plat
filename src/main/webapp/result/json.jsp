<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String json = (String)request.getAttribute("json");
	//System.out.println(json);
	response.getWriter().print(json);
 %>