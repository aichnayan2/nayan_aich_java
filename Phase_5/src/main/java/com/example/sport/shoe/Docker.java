package com.example.sport.shoe;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Docker {
@ResponseBody
@RequestMapping("/user")
	public String user() {
	
	return "Hi users";
	}
}
