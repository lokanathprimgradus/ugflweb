package com.elexyt.ugflweb.authentication.repository;



import com.elexyt.ugflweb.authentication.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, String> {
	Login findByUsername(String username);
	Login findByLoginId (String loginId);
    Boolean existsByEmail(String email);

}
