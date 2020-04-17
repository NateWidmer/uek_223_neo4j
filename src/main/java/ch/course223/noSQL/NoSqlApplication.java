package ch.course223.noSQL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableNeo4jRepositories
public class NoSqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoSqlApplication.class, args);
	}

}
