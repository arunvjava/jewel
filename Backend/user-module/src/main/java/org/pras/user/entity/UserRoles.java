package org.pras.user.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.pras.user.utils.Constants;

import lombok.Data;

@Data
@Entity
@Table(name = "m_user_roles", schema = Constants.JEWEL_SCHEMA)
public class UserRoles {

	@Id
	@Column(name = "role_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_role_seq")
	@SequenceGenerator(schema = Constants.JEWEL_SCHEMA, name = "user_role_seq", allocationSize = 1, initialValue = 1000)
	private long roleId;
	@Column(name = "user_role")
	private String userRole;
	@Column(name = "role_weightage")
	private int weightage;

	@ManyToMany(mappedBy = "userRoles")
	private List<User> user;

}
