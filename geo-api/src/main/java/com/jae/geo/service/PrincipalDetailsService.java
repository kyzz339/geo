package com.jae.geo.service;

import com.jae.geo.common.exception.CustomException;
import com.jae.geo.common.exception.ErrorCode;
import com.jae.geo.core.entity.User;
import com.jae.geo.core.repository.UserRepository;
import com.jae.geo.core.security.PrincipalDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PrincipalDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email){
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new CustomException(ErrorCode.USER_NOT_FOUND));

        return new PrincipalDetails(user);
    }

}
