package abc.springboot.study.distribution.session;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.jdbc.config.annotation.web.http.EnableJdbcHttpSession;

@SpringBootApplication
//@EnableRedisHttpSession
//@EnableJdbcHttpSession
public class DistributionSessionApplication {

    public static void main(String[] args) {
        SpringApplication.run(DistributionSessionApplication.class, args);
    }

}
