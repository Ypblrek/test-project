package com.tms.Sesurity.Service;

import com.tms.Domain.Role;
import com.tms.Domain.UserInfo;
import com.tms.Repository.UserRepository;
import com.tms.Sesurity.Domain.RegistrationDTO;
import com.tms.Sesurity.SecurityController.SecurityCredentials;
import com.tms.Sesurity.SecurityController.SecurityCredentialsRepository;
import com.tms.Sesurity.Domain.AuthRequest;
import com.tms.Sesurity.JwtUtils;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class SecurityService {
    private final PasswordEncoder passwordEncoder;
    private final SecurityCredentialsRepository securityCredentialsRepository;
    private final JwtUtils jwtUtils;
    private final UserInfo userInfo;
    private final SecurityCredentials securityCredentials;
    private final UserRepository userRepository;

    public SecurityService(PasswordEncoder passwordEncoder, SecurityCredentialsRepository securityCredentialsRepository, JwtUtils jwtUtils, UserInfo userInfo, SecurityCredentials securityCredentials, UserRepository userRepository) {
        this.passwordEncoder = passwordEncoder;
        this.securityCredentialsRepository = securityCredentialsRepository;
        this.jwtUtils = jwtUtils;
        this.userInfo = userInfo;
        this.securityCredentials = securityCredentials;
        this.userRepository = userRepository;
    }

    public String generateToken(AuthRequest authRequest){
        Optional<SecurityCredentials> credentials = securityCredentialsRepository.findByUserLogin(authRequest.getLogin());
        if (credentials.isPresent() && passwordEncoder.matches(authRequest.getPassword(),credentials.get().getUserPassword())){
           return jwtUtils.generateJwtToken(authRequest.getLogin());
        }
        return "";
    }
    @Transactional(rollbackFor = Exception.class)
    public  void registration(RegistrationDTO registrationDTO){
        userInfo.setFirstName(registrationDTO.getFirstName());
        userInfo.setLastName(registrationDTO.getLastName());
        userInfo.setCreatedAt(LocalDateTime.now());
        userInfo.setUpdatedAt(LocalDateTime.now());
        UserInfo userInfoResult = userRepository.save(userInfo);

        securityCredentials.setUserLogin(registrationDTO.getUserLogin());
        securityCredentials.setUserPassword(passwordEncoder.encode(registrationDTO.getUserPassword()));
        securityCredentials.setUserRole(Role.USER);
        securityCredentials.setUserid(userInfoResult.getId());

        userRepository.save(userInfo);
        securityCredentialsRepository.save(securityCredentials);

    }
}
