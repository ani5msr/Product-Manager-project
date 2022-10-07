/**
 * 
 */
package com.anirudh.productMan.core;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author aniru
 *
 */
import java.util.*;
import org.springframework.data.repository.CrudRepository;
@RepositoryRestResource
public interface ProductRepository extends CrudRepository<Product, Long> {
	@Query("SELECT p FROM Product p where p.company = ?1")
	List<Product> findByCompany(@Param("company") String company);

	 // Fetch cars by color
	List<Product> findByBatchNo(@Param("batchNo") int batchNo);

	 // Fetch cars by year

}