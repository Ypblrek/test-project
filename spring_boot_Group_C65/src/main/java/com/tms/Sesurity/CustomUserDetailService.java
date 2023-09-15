package com.tms.Sesurity;

import com.tms.Sesurity.SecurityController.SecurityCredentials;
import com.tms.Sesurity.SecurityController.SecurityCredentialsRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailService implements UserDetailsService {
    private  final   SecurityCredentialsRepository securityCredentialsRepository;

    public CustomUserDetailService(SecurityCredentialsRepository securityCredentialsRepository) {
        this.securityCredentialsRepository = securityCredentialsRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<SecurityCredentials> securityCredentials = securityCredentialsRepository.findByUserLogin(username);
        if(securityCredentials.isEmpty()){
            throw new UsernameNotFoundException(username);
        }
        return User
                .withUsername(securityCredentials.get().getUserLogin())
                .password(securityCredentials.get().getUserPassword())
                .roles(securityCredentials.get().getUserRole().toString())
                .build();
    }
}
