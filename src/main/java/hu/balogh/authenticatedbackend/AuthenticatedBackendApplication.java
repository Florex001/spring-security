package hu.balogh.authenticatedbackend;

import hu.balogh.authenticatedbackend.entity.ApplicationUser;
import hu.balogh.authenticatedbackend.entity.Role;
import hu.balogh.authenticatedbackend.repository.RoleRepository;
import hu.balogh.authenticatedbackend.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class AuthenticatedBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthenticatedBackendApplication.class, args);
    }

}
