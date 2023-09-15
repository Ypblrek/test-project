package com.tms.Sesurity.SecurityController;

import com.tms.Sesurity.Domain.AuthRequest;

import com.tms.Sesurity.Domain.AuthResponse;
import com.tms.Sesurity.Domain.RegistrationDTO;
import com.tms.Sesurity.Service.SecurityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping
public class SecurityController {
    private final SecurityService securityService;

    public SecurityController(SecurityService securityService) {
        this.securityService = securityService;
    }
    @PostMapping("/registration")
    public ResponseEntity<HttpStatus> registration(@RequestBody RegistrationDTO registrationDTO){
        securityService.registration(registrationDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/authentication")
    public ResponseEntity<AuthResponse> generateToken (@RequestBody AuthRequest authRequest){
       String token = securityService.generateToken(authRequest);
       if (token.isBlank()){
           return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
       }
        return new ResponseEntity<>(new AuthResponse(token), HttpStatus.OK);
    }
}
