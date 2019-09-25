package com.ngocnm.jwt.polls.repository;

import com.ngocnm.jwt.polls.model.Role;
import com.ngocnm.jwt.polls.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author NgocNM
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
