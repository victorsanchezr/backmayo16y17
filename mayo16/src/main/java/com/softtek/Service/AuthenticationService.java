package com.softtek.Service;


import com.softtek.dao.response.JwtAuthenticationResponse;
import com.softtek.dao.request.SignInRequest;
import com.softtek.dao.request.SignUpRequest;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SignInRequest request);

}