package org.pras.user.dto.response;

import java.util.ArrayList;
import java.util.List;

import org.pras.entity.user.Address;
import org.pras.entity.user.UserRoles;

import lombok.Data;

@Data
public class UserResponseDTO {

	private long userId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String emailID;
	private String primaryContactNumber;
	private String secondaryContactNumber;
	private List<UserRoles> userRoles;

	private List<Address> address = new ArrayList<>();
}