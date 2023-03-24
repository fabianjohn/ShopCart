package org.emailverification.repo;

import java.util.List;

import org.emailverification.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{
	
	@Query("SELECT a FROM Product a WHERE a.name=?1")
    public List<Product> FindAllWithDescriptionQuery();
	
	@Query("SELECT a FROM Product a WHERE a.id=?1")
	
	public List<Product> FindAllWithDescriptionQuery1();

	

	public Product save(int randomCode);

	

	
}
