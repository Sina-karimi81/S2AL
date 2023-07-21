package com.authentication.s2al.controller;

import com.authentication.s2al.dto.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/JWT")
public class JwtController {

    @PostMapping(value = "/Login")
    public ResponseEntity login(@RequestBody UserDTO userDTO){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping(value = "/validate")
    public ResponseEntity validate(String token){
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
