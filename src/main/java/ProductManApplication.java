

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.*;
@SpringBootApplication
public class ProductManApplication {
	private static final Logger logger = LoggerFactory.getLogger(ProductManApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ProductManApplication.class, args);
		logger.info("Started");
	}
	

}
