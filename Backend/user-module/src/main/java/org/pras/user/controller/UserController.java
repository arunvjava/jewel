package org.pras.user.controller;

import javax.validation.Valid;

import org.pras.user.dto.request.UserRequestDTO;
import org.pras.user.service.UserService;
import org.pras.user.utils.Constants;
import org.pras.user.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Constants.API_V1_PREFIX)
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(path = "/{id}")
	public void getUserBasedOnId(@PathVariable long id) {

	}

	@PostMapping
	public ResponseEntity<Response<String>> saveUser(@RequestBody @Valid UserRequestDTO user) {
		Response<String> response = Response.<String>builder().message("Success").build();
		userService.saveUser(user);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
