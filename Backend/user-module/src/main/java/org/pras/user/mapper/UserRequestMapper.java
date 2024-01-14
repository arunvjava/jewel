package org.pras.user.mapper;

import org.mapstruct.Mapper;
import org.pras.entity.user.User;
import org.pras.user.dto.request.UserRequestDTO;
import org.pras.user.dto.response.UserResponseDTO;

@Mapper
public interface UserRequestMapper {

	User userReqDTOToUser(UserRequestDTO userRequestDTO);

	UserRequestDTO userToUserReqDTO(User user);
	
	UserResponseDTO userToUserResponseDTO(User user);

}
