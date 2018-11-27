package com.cricket.tournament.controllers;

import com.cricket.tournament.Models.PlayersInformation;
import com.cricket.tournament.service.PlayerInfoService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Team {

    @Autowired
    PlayerInfoService playerInfoService;

    @ApiOperation("This API return the player information")
    @ApiResponse(code = 200, message = "Successfull")
    @RequestMapping(value = "v1/playersInfo", produces = {"application/json"}, consumes = { "application/json" }, method = RequestMethod.GET)
    public ResponseEntity<PlayersInformation> getPlayerDetails(
            @ApiParam(value="ranking", required = true) @RequestParam(value = "ranking", required = true) int ranking) throws Exception {
        PlayersInformation playersInformation = null;
        try {
            playersInformation = playerInfoService.getPlayerDetails(ranking);
        } catch (Exception e) {
            throw new Exception("Exception occured");
        }
        return new ResponseEntity<>(playersInformation, HttpStatus.OK);
    }

}
