package com.elexyt.ugflweb.repository;



import com.elexyt.ugflweb.entity.ValidateOtp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValidateOtpRepository extends JpaRepository<ValidateOtp, String> {
    ValidateOtp findByUserName(String userName);
}
