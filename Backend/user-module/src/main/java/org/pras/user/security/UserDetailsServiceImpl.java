package org.pras.user.security;

import org.pras.user.entity.User;
import org.pras.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	// @formatter:off
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByEmailID(username);
		return org.springframework.security.core.userdetails.User
							.builder()
								.username(user.getEmailID())
								.password(user.getPassword())
								.disabled(false)
								.build();
	}

	// @formatter:on

}
