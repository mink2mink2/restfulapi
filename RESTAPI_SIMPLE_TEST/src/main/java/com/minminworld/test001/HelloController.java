package com.minminworld.test001;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/hello")
	public String hi() {
		System.out.println("hello???");
		return "hi there~";
	}
	
	@RequestMapping(value = "/jsonTest", method = RequestMethod.GET)
	public @ResponseBody HashMap<String, Object> jsonTest() throws Exception {
		System.out.println("Json Web print Test");
		
		HashMap<String, Object> resMap = new HashMap<String, Object>();
		
		resMap.put("userId", "hello");
		resMap.put("id", "hello.");
		resMap.put("title", "hello?");
		
		return resMap;
	}

}
