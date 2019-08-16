package de.viadee.oauth2.authorization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
public class AuthorizationServer {

    public static void main(String[] args) {
        SpringApplication.run(AuthorizationServer.class, args);
    }

    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create().url("jdbc:mysql://localhost:3306/oauth2?useSSL=false")
                .username("oauth2").password("oauth2").driverClassName("com.mysql.jdbc.Driver").build();
    }
}
