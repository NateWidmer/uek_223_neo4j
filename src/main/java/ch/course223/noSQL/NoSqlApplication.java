package ch.course223.noSQL;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@EnableTransactionManagement
public class NoSqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoSqlApplication.class, args);
	}

	@Bean
	public Driver neo4jDriver() {
		return GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic( "neo4j", "secret" ));
	}
}
