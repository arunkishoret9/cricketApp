package com.cricket.tournament.cricket.controllers;

import com.cricket.tournament.cricket.Models.PlayersInfo;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Team {

    @ApiOperation("This API return the player information")
    @ApiResponse(code = 200, message = "Successfull")
    @RequestMapping(value = "v1/playersInfo", produces = {"application/json"}, method = RequestMethod.GET)
    public ResponseEntity<PlayersInfo> getPlayerDetails(
            @ApiParam(value="Player name", required = true) @RequestParam(value = "Player name", required = true) String playerName
    ){
        PlayersInfo playersInfo = new PlayersInfo();
        return new ResponseEntity<>(playersInfo, HttpStatus.OK);
    }

}
