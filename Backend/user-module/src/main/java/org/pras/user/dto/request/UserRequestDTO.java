package org.pras.user.dto.request;

import java.util.ArrayList;
import java.util.List;

import org.pras.user.entity.Address;
import org.pras.user.entity.UserRoles;

import lombok.Data;

@Data
public class UserRequestDTO {

	private long userId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String primaryContactNumber;
	private String secondaryContactNumber;
	private List<UserRoles> userRoles;

	private List<Address> address = new ArrayList<>();
}