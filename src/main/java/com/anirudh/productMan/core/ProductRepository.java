/**
 * 
 */
package com.anirudh.productMan.core;

/**
 * @author aniru
 *
 */

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}