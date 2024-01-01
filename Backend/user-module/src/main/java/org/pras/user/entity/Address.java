package org.pras.user.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.pras.user.utils.AddressTypes;
import org.pras.user.utils.Constants;

import lombok.Data;

@Data
@Entity
@Table(schema = Constants.JEWEL_SCHEMA, name = "m_addrs_dtls")
public class Address {

	@Id
	@Column(name = "addr_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "addrs_seq")
	@SequenceGenerator(schema = Constants.JEWEL_SCHEMA, name = "addrs_seq", allocationSize = 1, initialValue = 1000)
	private long addrId;
	@Enumerated(EnumType.STRING)
	@Column(name = "addr_type", length = 10)
	private AddressTypes addressType;
	@Column(name = "addr_line_1")
	private String addrsLine1;
	@Column(name = "addr_line_2")
	private String addrsLine2;
	@Column(name = "addr_line_3")
	private String addrsLine3;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "country")
	private String country;
	@Column(name = "pincode")
	private String pincode;

	@ManyToOne
	@JoinColumn(name = "user_id")
	@JsonIgnoreProperties("address")
	private User user;

}
