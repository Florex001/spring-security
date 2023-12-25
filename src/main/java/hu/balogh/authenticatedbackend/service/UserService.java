package hu.balogh.authenticatedbackend.service;

import hu.balogh.authenticatedbackend.entity.ApplicationUser;
import hu.balogh.authenticatedbackend.entity.Role;
import hu.balogh.authenticatedbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService implements UserDetailsService {

    private final PasswordEncoder encoder;
    private final UserRepository userRepository;

    @Autowired
    public UserService(PasswordEncoder encoder, UserRepository userRepository) {
        this.encoder = encoder;
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        System.out.println("User details service");

        return userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("A felhasználónév vagy jelszó helytelen."));
    }
}
