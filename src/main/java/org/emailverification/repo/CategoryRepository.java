package org.emailverification.repo;


import java.util.List;

import org.emailverification.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	@Query("SELECT u FROM Category u WHERE u.productName=?1")
	Category findByProductName(String ProductName);

	List<Category> findByCatName(String catName);
	
	/*
	@Query("SELECT a FROM Category a LEFT JOIN Product b on a.productName=b.productName")
    public List<Category> FindAllWithDescriptionQuery();
 */
}
