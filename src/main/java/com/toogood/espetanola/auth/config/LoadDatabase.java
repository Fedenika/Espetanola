package com.toogood.espetanola.auth.config;

//import com.toogood.espetanola.auth.config.jwt.AuthEntryPointJwt;
//import com.toogood.espetanola.auth.model.ERole;
//import com.toogood.espetanola.auth.model.Role;
//import com.toogood.espetanola.auth.repository.RoleRepository;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//class LoadDatabase {
//
//    private static Logger logger = LogManager.getLogger(AuthEntryPointJwt.class);
//
//    @Bean
//    CommandLineRunner initDatabase(RoleRepository repository) {
//
//        return args -> {
//            logger.info("Preloading " + repository.save(new Role(ERole.ROLE_USER)));
//            logger.info("Preloading " + repository.save(new Role(ERole.ROLE_MODERATOR)));
//            logger.info("Preloading " + repository.save(new Role(ERole.ROLE_ADMIN)));
//        };
//    }
//}