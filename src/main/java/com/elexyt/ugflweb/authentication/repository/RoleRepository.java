package com.elexyt.ugflweb.authentication.repository;



import com.elexyt.ugflweb.authentication.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, String>{
	Role findByRoleId(String roleId);
	Role  findByRoleName(String roleName);

}
