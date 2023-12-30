package org.pras.user.controller;

import org.pras.user.utils.Constants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Constants.API_V1_PREFIX)
public class UserController {

	@GetMapping(path = "/test")
	public String getTest() {
		return "TestData";
	}

}
