package com.ar.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class TestController {

	private static final Logger log = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping(path = "/log", method = RequestMethod.GET)
	public ResponseEntity<?> test() {
		
		System.out.println("Testing!");
		
		log.error("ERROR level");
		log.warn("WARN level");
		log.info("INFO level");
		log.debug("DEBUG level");
		
		return new ResponseEntity<>("body", null, HttpStatus.OK);
	}
}
