package com.rohith.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class WelcomeController {

	

	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String gotoWelcomepage(ModelMap model) {
		model.put("name","rohith");
		return "welcome";
	}
	
	
}
