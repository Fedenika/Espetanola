package com.toogood.espetanola.config;

import com.toogood.espetanola.dto.User;
import com.toogood.espetanola.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(UserRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new User("@main", "fesefawf", "fecla")));
            log.info("Preloading " + repository.save(new User("Frodo Baggins", "thief", "sad")));
        };
    }
}