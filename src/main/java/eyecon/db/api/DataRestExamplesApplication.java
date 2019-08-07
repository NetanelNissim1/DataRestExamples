package eyecon.db.api;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataRestExamplesApplication implements CommandLineRunner {

	@Autowired
	DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(DataRestExamplesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("DataSource = " + dataSource);
	}
}
