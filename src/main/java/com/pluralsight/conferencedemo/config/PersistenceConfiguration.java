package com.pluralsight.conferencedemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;


@ConfigurationProperties(prefix = "spring.datasource")
public class PersistenceConfiguration {
    @Bean
    @Primary
    public DataSource dataSource(){

        return DataSourceBuilder.create().url("").username("").password("").build();
        /*builder.url("jdbc:mysql://localhost:3306/conference_demo");
        builder.username("root");
        builder.password("Manchester83!");
        System.out.println("Bean has been initialised");

        return builder.build();
         */
}
}
