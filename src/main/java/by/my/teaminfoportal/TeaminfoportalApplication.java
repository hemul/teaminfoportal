package by.my.teaminfoportal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TeaminfoportalApplication {
	private static final Logger LOG = LoggerFactory.getLogger(TeaminfoportalApplication.class);

	public static void main(String[] args) {

		LOG.debug("APP START");
		SpringApplication.run(TeaminfoportalApplication.class, args);
		LOG.debug("APP SEND");
	}
}
