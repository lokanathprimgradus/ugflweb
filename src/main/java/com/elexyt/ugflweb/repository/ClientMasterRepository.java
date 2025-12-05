package com.elexyt.ugflweb.repository;



import com.elexyt.ugflweb.entity.ClientMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ClientMasterRepository extends JpaRepository<ClientMaster,String> {
	
	List<ClientMaster> findAll();

}
