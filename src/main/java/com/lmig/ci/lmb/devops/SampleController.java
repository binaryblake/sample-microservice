package com.lmig.ci.lmb.devops;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hello(){
		return "hello World!"; 
	}
}
