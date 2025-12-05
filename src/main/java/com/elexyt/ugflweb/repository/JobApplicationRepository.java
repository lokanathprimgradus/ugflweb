package com.elexyt.ugflweb.repository;

import com.elexyt.ugflweb.entity.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the JobApplication entity.
 */
@SuppressWarnings("unused")
@Repository
public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {}
