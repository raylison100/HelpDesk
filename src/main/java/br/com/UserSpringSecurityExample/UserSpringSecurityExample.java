package br.com.UserSpringSecurityExample;

import br.com.UserSpringSecurityExample.api.security.entity.User;
import br.com.UserSpringSecurityExample.api.security.enums.ProfileEnun;
import br.com.UserSpringSecurityExample.api.repository.UserRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;


@SpringBootApplication
public class UserSpringSecurityExample {

    public static void main(String[] args) {
        SpringApplication.run(UserSpringSecurityExample.class, args);
    }

    @Bean
    CommandLineRunner init(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            initUsers(userRepository, passwordEncoder);
        };

    }

    private void initUsers(UserRepository userRepository, PasswordEncoder passwordEncoder){

        User admin = new User();
        admin.setEmail("admin@security.com");
        admin.setPassword(passwordEncoder.encode("123456"));
        admin.setProfile(ProfileEnun.ROLE_ADMIN);

        User find = userRepository.findByEmail("admin@security.com");
        if (find == null) {
            userRepository.save(admin);
        }
    }
}
