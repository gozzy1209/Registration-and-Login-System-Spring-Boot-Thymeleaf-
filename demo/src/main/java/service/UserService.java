package service;

import org.springframework.security.core.userdetails.UserDetailsService;

import model.User;
import webDto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
