package com.aws.codestar.projecttemplates.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Basic Spring web service controller that handles all GET requests.
 */
@RestController

public class HelloWorldController {

    @PostMapping("/")
    public String my() {
    	return ("<h1>Hello</h1>");
    }
}
