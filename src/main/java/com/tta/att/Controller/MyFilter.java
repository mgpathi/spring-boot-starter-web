package com.tta.att.Controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class MyFilter implements Filter {
 
public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
// place your code here
	try {
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)res;
		setResponseHeader(response,request);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
 // pass the request along the filter chain
chain.doFilter(req, res);
}
private void setResponseHeader(HttpServletResponse res,HttpServletRequest req){
	res.setHeader("Access-Control-Allow-Origin",req.getHeader("Origin"));
	res.setHeader("Access-Control-Allow-Credentials","true");
	res.setHeader("Access-Control-Allow-Methods","POST,GET,OPTIONS,DELETE,PUT");
	res.setHeader("Access-Control-Allow-Max-Age","3600");
	res.setHeader("Access-Control-Allow-Headers","Origin,Accept,X-Requested-With,Content-Type,Access-Control-Request-Method,Access-Control-Request-Headers,Authorization");
	} 
public void init(FilterConfig arg0) throws ServletException {}
public void destroy() {}
}