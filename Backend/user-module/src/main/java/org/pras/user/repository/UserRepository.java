package org.pras.user.repository;

import org.pras.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmailID(String emailID);
	
	User findByFirstName(String firstName);

}