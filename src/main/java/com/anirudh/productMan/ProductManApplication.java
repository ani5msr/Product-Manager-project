package com.anirudh.productMan;
import java.util.Arrays;

import javax.transaction.Transactional;

import org.springframework.boot.SpringApplication;
import com.anirudh.productMan.core.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.*;
@SpringBootApplication
@Transactional
public class ProductManApplication implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(ProductManApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ProductManApplication.class, args);
		logger.info("Started");
	}
	@Autowired
	private SellerRepository selrepository;
	@Autowired
    private ProductRepository repository;
	@Override
	public void run(String... args) throws Exception {
		// Add owner objects and save these to db 
		Seller seller1 = new Seller("John" , "Johnson");
		Seller seller2 = new  Seller("Mary" , "Robinson");
		selrepository.saveAll(Arrays.asList(seller1, seller2));

		// Add car object and link to owners and save these to db
		Product pro1 = new Product("Kellogs", "March/2014", "August/2016", 
				"GHT-1121", 2014, 59, seller1);
		Product pro2 = new Product("Amul", "February/2021", "August/2021", 
				"SSJ-3002", 2021, 29, seller2);
		Product pro3 = new Product("Soyalite", "January/2020", "March/2020", 
				"K5O-0212", 2020, 39, seller2);
		repository.saveAll(Arrays.asList(pro1, pro2, pro3));
                  
		for (Product pro : repository.findAll()) {
			logger.info(pro.getCompany() + " " + pro.getSeller());
		}
	}

}
