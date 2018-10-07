package com.cricket.tournament.cricket.Transformer;

import com.cricket.tournament.cricket.Entities.PlayerInfo;
import com.cricket.tournament.cricket.Models.PlayersInformation;
import org.springframework.stereotype.Component;

@Component
public class PlayerInfoResponse {

    public PlayersInformation transformResponseInfo(PlayerInfo playerInfo){

        PlayersInformation playersInformation = new PlayersInformation();

        playersInformation.setPlayerName(playerInfo.getPlayerName());
        playersInformation.setCountry(playerInfo.getCountry());
        playersInformation.setDateOfBirth(playerInfo.getDateOfBirth());
        playersInformation.setBestScore(playerInfo.getBestScore());
        playersInformation.setJerseryNumber(playerInfo.getJerseryNumber());
        playersInformation.setOriginPlace(playerInfo.getOriginPlace());
        playersInformation.setPlayerType(playerInfo.getPlayerType());
        playersInformation.setLeagues(playerInfo.getLeagues());
        playersInformation.setRanking(playerInfo.getRanking());

        return playersInformation;

    }
}
