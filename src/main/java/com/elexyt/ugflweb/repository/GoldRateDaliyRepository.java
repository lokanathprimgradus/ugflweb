package com.elexyt.ugflweb.repository;

import com.elexyt.ugflweb.entity.GoldRateDaliy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the GoldRateDaliy entity.
 */
@SuppressWarnings("unused")
@Repository
public interface GoldRateDaliyRepository extends JpaRepository<GoldRateDaliy, Long> {}
