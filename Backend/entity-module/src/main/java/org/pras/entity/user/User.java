package org.pras.entity.user;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.pras.entity.utils.Constants;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
@Table(name = "m_user", schema = Constants.SCHEMA_JEWEL)
public class User {

	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
	@SequenceGenerator(schema = Constants.SCHEMA_JEWEL, name = "user_seq", allocationSize = 1, initialValue = 1000)
	private long userId;
	@Column(name = "password_v")
	private String password;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "middle_name")
	private String middleName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "primary_contact_number")
	private String primaryContactNumber;
	@Column(name = "secondary_contact_number")
	private String secondaryContactNumber;
	@Column(name = "email_id")
	private String emailID;
	@ManyToMany
	@JoinTable(schema = Constants.SCHEMA_JEWEL, name = "mp_user_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private List<UserRoles> userRoles;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("user")
	private List<Address> address = new ArrayList<>();
}
