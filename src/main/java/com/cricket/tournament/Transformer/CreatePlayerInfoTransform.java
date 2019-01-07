package com.cricket.tournament.Transformer;

import com.cricket.tournament.Entities.PlayerInfo;
import com.cricket.tournament.Models.CreatePlayerInformation;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CreatePlayerInfoTransform {

    public List<PlayerInfo> transformData(List<CreatePlayerInformation> createPlayerInfoRequest) {


        List<PlayerInfo> playerInfoList = new ArrayList<>();
        createPlayerInfoRequest.forEach(item->{
            PlayerInfo playerInfo  = new PlayerInfo();
        playerInfo.setPlayerName(item.getPlayerName());
        playerInfo.setCountry(item.getCountry());
        playerInfo.setDateOfBirth(item.getDateOfBirth());
        playerInfo.setBestScore(item.getBestScore());
        playerInfo.setJerseryNumber(item.getJerseryNumber());
        playerInfo.setOriginPlace(item.getOriginPlace());
        playerInfo.setPlayerType(item.getPlayerType());
        playerInfo.setLeagues(item.getLeagues());
        playerInfo.setRanking(item.getRanking());
            playerInfoList.add(playerInfo);
        });
        return playerInfoList;
    }
}
