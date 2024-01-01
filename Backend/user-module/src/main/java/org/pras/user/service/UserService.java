package org.pras.user.service;

import org.pras.user.dto.request.UserRequestDTO;
import org.pras.user.dto.response.UserResponseDTO;
import org.pras.user.exception.UserNotFoundException;

public interface UserService {

	public UserResponseDTO getUserByID(long userId) throws UserNotFoundException;

	public UserResponseDTO getUserByEmailID(String emaildID);

	public UserResponseDTO getUserByName(String name);

	public UserResponseDTO saveUser(UserRequestDTO user);

}
