package com.myspring.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin
@RestController
@RequestMapping("test")
public class TestController {

	
	@RequestMapping(value="/map")
	public Object myTest(@RequestBody  Map<String,Object> map) {
		return map;
	}
}
