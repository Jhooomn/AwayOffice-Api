package awayoffice.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.jdbc.Sql;

//Saved working directory and index state WIP on abduls: cd9206a Trigger Heroku deploy after enabling collectstatic
@SpringBootApplication
@Sql({"/data.sql"})
public class AwayofficeApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwayofficeApplication.class, args);
    }

}
