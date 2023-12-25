package hu.balogh.authenticatedbackend.controler;

import hu.balogh.authenticatedbackend.controler.dto.LoginDto;
import hu.balogh.authenticatedbackend.controler.dto.LoginResponseDto;
import hu.balogh.authenticatedbackend.controler.dto.RegistrationDto;
import hu.balogh.authenticatedbackend.entity.ApplicationUser;
import hu.balogh.authenticatedbackend.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthenticationController {

    private final AuthenticationService authenticationService;
    @Autowired
    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/register")
    public ApplicationUser registerUser(@RequestBody RegistrationDto registrationDto){
        return authenticationService.registerUser(registrationDto.getUsername(), registrationDto.getPassword());
    }

    @PostMapping("/login")
    public LoginResponseDto loginUser(@RequestBody LoginDto loginDto){
        return authenticationService.loginUser(loginDto.getUsername(), loginDto.getPassword());
    }


}
