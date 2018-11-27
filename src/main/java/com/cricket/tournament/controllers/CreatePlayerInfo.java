package com.cricket.tournament.controllers;

import com.cricket.tournament.Models.CreatePlayerInformation;
import com.cricket.tournament.Models.CreatePlayerInformationRespose;
import com.cricket.tournament.service.PlayerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreatePlayerInfo {

    @Autowired
    PlayerInfoService playerInfoService;

    @RequestMapping(value = "v1/createPlayerInfo", produces = {"application/json"}, consumes = {"application/json"}, method = RequestMethod.POST)
    public ResponseEntity<CreatePlayerInformationRespose> createPlayerInformation
            (@RequestBody CreatePlayerInformation createPlayerInfo){

        CreatePlayerInformationRespose response= playerInfoService.createPlayerInfo(createPlayerInfo);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
