package cn.luxh.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	private static Logger log = LoggerFactory.getLogger(IndexController.class);
	
	
	
	@RequestMapping(value="/index")
	public String index(){
		log.info("index.......");
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		WebAuthenticationDetails webAuth = (WebAuthenticationDetails) auth.getDetails();
		log.info("当前登录用户ip:"+webAuth.getRemoteAddress());
		log.info("当前登录用户的sessionId:"+webAuth.getSessionId());
		User user = (User) auth.getPrincipal();
		
		log.info("当前登录用户权限："+user.getAuthorities());
		return "index";
	}
	
	@RequestMapping(value="/common")
	public String myJsp(){
		log.info("common.......");
		return "common";
	}
	
	@RequestMapping(value="/admin")
	public String admin(){
		log.info("admin.......");
		return "admin";
	}
}
