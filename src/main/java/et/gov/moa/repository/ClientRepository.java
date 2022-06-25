package et.gov.moa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import et.gov.moa.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
	//Custom query
	 @Query(value = "select * from clients s where s.first_name like %:keyword% or s.last_name like %:keyword% or s.to_whome like %:keyword%", nativeQuery = true)
	 List<Client> findByKeyword(@Param("keyword") String keyword);
	}

