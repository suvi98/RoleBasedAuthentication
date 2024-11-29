package com.role.implementation.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.role.implementation.model.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

	//@Query("SELECT * FROM Role r WHERE r.role = ?1")
	Role findByRole(String role);
}
