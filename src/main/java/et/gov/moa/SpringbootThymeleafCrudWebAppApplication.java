package et.gov.moa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.extras.java8time.dialect.Java8TimeDialect;

@SpringBootApplication
public class SpringbootThymeleafCrudWebAppApplication {

	
	 @Bean
	    public Java8TimeDialect java8TimeDialect() {
	        return new Java8TimeDialect();
	    }
	public static void main(String[] args) {
		SpringApplication.run(SpringbootThymeleafCrudWebAppApplication.class, args);
		System.out.println();
	}

}
