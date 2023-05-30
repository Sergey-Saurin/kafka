package TestProject.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableKafka
@EnableScheduling
@PropertySource({
		"classpath:kafka.properties"
})
public class KafkaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaServerApplication.class, args);
	}

}
