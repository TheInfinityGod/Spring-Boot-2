package com.application.springboot2.TestControllers;

import java.net.http.HttpHeaders;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;



@RestController
@RequestMapping("api/v1")
public class TestController{
    
    @GetMapping("/hello")
    public ResponseEntity<String>get(){
        return ResponseEntity.ok("okay water man");
    }
    
    @RequestMapping(value = {"/Amt"}, method = {RequestMethod.POST}, produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> retrieve(@Valid @RequestBody(required = true) RetrieveFormsRequest retrieveFormsRequest,@RequestHeader HttpHeaders httpHeaders) {
    String ind = ("IND");
    RetrieveFormsResponse retrieveFormsResponse = myManagementhandler.myMethod(retrieveFormsRequest, ind);
    return new ResponseEntity<RetrieveFormsResponse>(retrieveFormsResponse, HttpStatus.OK);

    }


}