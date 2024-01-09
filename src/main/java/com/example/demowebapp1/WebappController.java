package com.example.demowebapp1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebappController {
	
	@GetMapping("/getUser")
	public String getCall() {
		return "hello XyZ.......";
	}

}
