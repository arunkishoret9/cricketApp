package com.cricket.tournament.cricket.Transformer;

import com.cricket.tournament.cricket.Entities.PlayerInfo;
import com.cricket.tournament.cricket.Models.CreatePlayerInformation;
import org.springframework.stereotype.Component;

@Component
public class CreatePlayerInfoRequest {

    public PlayerInfo transformData(CreatePlayerInformation createPlayerInfoRequest) {

        PlayerInfo playerInfo = new PlayerInfo();

        playerInfo.setPlayerName(createPlayerInfoRequest.getPlayerName());
        playerInfo.setCountry(createPlayerInfoRequest.getCountry());
        playerInfo.setDateOfBirth(createPlayerInfoRequest.getDateOfBirth());
        playerInfo.setBestScore(createPlayerInfoRequest.getBestScore());
        playerInfo.setJerseryNumber(createPlayerInfoRequest.getJerseryNumber());
        playerInfo.setOriginPlace(createPlayerInfoRequest.getOriginPlace());
        playerInfo.setPlayerType(createPlayerInfoRequest.getPlayerType());
        playerInfo.setLeagues(createPlayerInfoRequest.getLeagues());
        playerInfo.setRanking(createPlayerInfoRequest.getRanking());

        return playerInfo;
    }
}
