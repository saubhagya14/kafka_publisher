package ed.api_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafakaPublisherApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafakaPublisherApplication.class, args);
	}

}
