package org.pras.user.service;

import org.pras.user.dto.request.UserRequestDTO;
import org.pras.user.entity.User;
import org.pras.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;

	public void saveUser(UserRequestDTO user) {

	}

}
