package tcs.micheleilliano.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import tcs.micheleilliano.service.HelloWorldService;

@RestController
public class HelloWorldController {

	@Autowired
	private HelloWorldService helloWorldService;
	
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping("/hello")
	public String getHello() {
		return helloWorldService.getHello();
	}
}
