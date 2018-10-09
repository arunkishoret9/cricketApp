package com.cricket.tournament.cricket.controllers;

import com.cricket.tournament.cricket.Models.CreatePlayerInformation;
import com.cricket.tournament.cricket.Models.CreatePlayerInformationRespose;
import com.cricket.tournament.cricket.service.PlayerInfoService;
import io.swagger.annotations.ApiParam;
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
    PlayerInfoService playerInfoService;

    @RequestMapping(value = "v1/createPlayerInfo", produces = {"application/json"}, consumes = {"application/json"}, method = RequestMethod.POST)
    public ResponseEntity<CreatePlayerInformationRespose> createPlayerInformation
            (@RequestBody CreatePlayerInformation createPlayerInfo){

        CreatePlayerInformationRespose response= playerInfoService.createPlayerInfo(createPlayerInfo);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
