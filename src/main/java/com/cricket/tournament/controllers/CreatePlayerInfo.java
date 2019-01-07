package com.cricket.tournament.controllers;

import com.cricket.tournament.Models.CreatePlayerInformation;
import com.cricket.tournament.Models.CreatePlayerInformationRespose;
import com.cricket.tournament.service.CreatePlayerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CreatePlayerInfo {

    @Autowired
    CreatePlayerInfoService createPlayerInfoService;

    @RequestMapping(value = "v1/createPlayerInfo", produces = {"application/json"}, consumes = {"application/json"}, method = RequestMethod.POST)
    public ResponseEntity<CreatePlayerInformationRespose> createPlayerInformation
            (@RequestBody List<CreatePlayerInformation> createPlayerInfo){

        CreatePlayerInformationRespose response= createPlayerInfoService.createPlayerInfo(createPlayerInfo);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
