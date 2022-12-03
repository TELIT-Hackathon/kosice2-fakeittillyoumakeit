package com.example.housingtinder;

import com.example.housingtinder.services.*;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EntityScan(basePackages = "com.example.housingtinder.entyties.renter")
public class HousingTinderApplication {

    public static void main(String[] args) {
        SpringApplication.run(HousingTinderApplication.class, args);
    }

    @Bean
    public DataService dataService(){return new DataService();}
    @Bean
    public IRenterService renterService(){ return new RenterService(); }
    @Bean
    public GroupService groupService(){ return new GroupService(); }
    @Bean
    public MatchService matchService(){ return new MatchService(); }
}
