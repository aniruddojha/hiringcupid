package com.hiringcupid.webpage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
	
	@GetMapping("/rest")
	public String resumeUpload() {
		return "ResumeUploaded";
	}
}
