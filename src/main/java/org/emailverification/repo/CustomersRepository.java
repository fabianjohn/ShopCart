package org.emailverification.repo;

import org.emailverification.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface CustomersRepository extends JpaRepository<Customers, Long>{
//	@Query("SELECT u FROM Customers u WHERE u.email=?1")
//	Customers findByEmail(String email);

}
