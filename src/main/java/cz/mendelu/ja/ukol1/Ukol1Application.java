package cz.mendelu.ja.ukol1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

//pro nacitani config z app yaml
@EnableConfigurationProperties

@SpringBootApplication
public class Ukol1Application {

    public static void main(String[] args) {
        SpringApplication.run(Ukol1Application.class, args);
    }

}
