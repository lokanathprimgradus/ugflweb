package com.elexyt.ugflweb.repository;

import com.elexyt.ugflweb.entity.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the LoanApplication entity.
 */
@SuppressWarnings("unused")
@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, String> {}
