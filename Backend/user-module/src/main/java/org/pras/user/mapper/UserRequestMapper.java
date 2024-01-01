package org.pras.user.mapper;

import org.mapstruct.Mapper;
import org.pras.user.dto.request.UserRequestDTO;
import org.pras.user.dto.response.UserResponseDTO;
import org.pras.user.entity.User;

@Mapper
public interface UserRequestMapper {

	User userReqDTOToUser(UserRequestDTO userRequestDTO);

	UserRequestDTO userToUserReqDTO(User user);
	
	UserResponseDTO userToUserResponseDTO(User user);

}
