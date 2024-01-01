package org.pras.user.service.impl;

import java.util.Optional;

import org.pras.user.dto.request.UserRequestDTO;
import org.pras.user.dto.response.UserResponseDTO;
import org.pras.user.entity.User;
import org.pras.user.exception.AlreadyExistException;
import org.pras.user.exception.UserNotFoundException;
import org.pras.user.mapper.UserRequestMapper;
import org.pras.user.mapper.UserRequestMapperImpl;
import org.pras.user.repository.UserRepository;
import org.pras.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepo;

	private UserRequestMapper userRequestMapper = new UserRequestMapperImpl();

	/*
	 * Saves the user in the database
	 */
	public UserResponseDTO saveUser(UserRequestDTO userRequestDTO) {

		if (userRepo.findByEmailID(userRequestDTO.getEmailID()) != null) {
			throw new AlreadyExistException(
					String.format("User already exist with same email id :%s", userRequestDTO.getEmailID()));
		}

		User user = userRepo.save(userRequestMapper.userReqDTOToUser(userRequestDTO));

		return userRequestMapper.userToUserResponseDTO(user);
	}

	/**
	 * Get's the users based on user id
	 */
	public UserResponseDTO getUserByID(long userId) {
		Optional<User> user = userRepo.findById(userId);
		if (!user.isPresent()) {
			throw new UserNotFoundException(String.format("User not found for the provided id :%d", userId));
		}

		return userRequestMapper.userToUserResponseDTO(user.get());
	}

	/**
	 * Get user based on email id
	 */
	public UserResponseDTO getUserByEmailID(String emaildID) {
		User user = userRepo.findByEmailID(emaildID);
		if (user == null) {
			throw new UserNotFoundException(String.format("User not found for the provide email :%s", emaildID));
		}

		return userRequestMapper.userToUserResponseDTO(user);
	}

	public UserResponseDTO getUserByName(String name) {
		User user = userRepo.findByFirstName(name);
		if (user == null) {
			throw new UserNotFoundException(String.format("User not found with first name :%s", name));
		}

		return userRequestMapper.userToUserResponseDTO(user);
	}

}
