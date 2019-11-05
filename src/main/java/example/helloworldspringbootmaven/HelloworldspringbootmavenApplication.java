package example.helloworldspringbootmaven;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldspringbootmavenApplication {

    private static final Logger LOG = LoggerFactory.getLogger(HelloworldspringbootmavenApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(HelloworldspringbootmavenApplication.class, args);
        LOG.info("..::HELLO WORLD SPRING-MAVEN::..");
    }

}
