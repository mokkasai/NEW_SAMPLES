package com.sample.check;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleCheckController {
	
	@GetMapping("/sample")
	public String  msg() {
		return "saple appliction runninggg";
	}

}
