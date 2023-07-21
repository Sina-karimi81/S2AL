package com.authentication.s2al.controllerTest;

import com.authentication.s2al.controller.JwtController;
import com.authentication.s2al.controller.OtpController;
import com.authentication.s2al.controller.PasswordController;
import com.authentication.s2al.dto.UserDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest
public class ControllerTests {

    @Autowired
    JwtController jwtController;

    @Autowired
    PasswordController passwordController;

    @Autowired
    OtpController otpController;

    @Test
    void getResponseFromJWTLoginEndpoint(){

        ResponseEntity response = jwtController.login(new UserDTO());
        System.out.println(response.getStatusCode());
        Assertions.assertEquals(HttpStatus.OK , response.getStatusCode());

    }

    @Test
    void getResponseFromJWTValidateEndpoint(){

        ResponseEntity response = jwtController.validate("");
        System.out.println(response.getStatusCode());
        Assertions.assertEquals(HttpStatus.OK , response.getStatusCode());

    }

    @Test
    void getResponseFromPasswordLoginEndpoint(){

        ResponseEntity response = passwordController.login(new UserDTO());
        System.out.println(response.getStatusCode());
        Assertions.assertEquals(HttpStatus.OK , response.getStatusCode());

    }

    @Test
    void getResponseFromOTPLoginEndpoint(){

        ResponseEntity response = otpController.login(new UserDTO());
        System.out.println(response.getStatusCode());
        Assertions.assertEquals(HttpStatus.OK , response.getStatusCode());

    }

    @Test
    void getResponseFromOTPValidateEndpoint(){

        ResponseEntity response = otpController.validate("");
        System.out.println(response.getStatusCode());
        Assertions.assertEquals(HttpStatus.OK , response.getStatusCode());

    }

}
