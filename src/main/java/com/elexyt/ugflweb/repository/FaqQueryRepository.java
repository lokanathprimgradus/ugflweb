package com.elexyt.ugflweb.repository;

import com.elexyt.ugflweb.entity.FaqQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the FaqQuery entity.
 */
@SuppressWarnings("unused")
@Repository
public interface FaqQueryRepository extends JpaRepository<FaqQuery, String> {}
