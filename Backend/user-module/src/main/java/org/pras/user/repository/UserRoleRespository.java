package org.pras.user.repository;

import org.pras.user.entity.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRespository extends JpaRepository<UserRoles, Long> {

}
