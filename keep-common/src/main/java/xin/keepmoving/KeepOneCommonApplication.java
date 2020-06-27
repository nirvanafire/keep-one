package xin.keepmoving;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import xin.keepmoving.config.CustomProperties;

/**
 * Hello world!
 * @author Nirvana Fire
 */
@SpringBootApplication
@EnableConfigurationProperties(value = {CustomProperties.class})
public class KeepOneCommonApplication {

    public static void main(String[] args) {

        SpringApplication.run(KeepOneCommonApplication.class, args);
    }
}
