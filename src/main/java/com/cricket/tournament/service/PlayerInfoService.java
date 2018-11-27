package com.cricket.tournament.service;

import com.cricket.tournament.DAO.PlayerInfoDAO;
import com.cricket.tournament.Entities.PlayerInfo;
import com.cricket.tournament.Models.CreatePlayerInformation;
import com.cricket.tournament.Models.CreatePlayerInformationRespose;
import com.cricket.tournament.Transformer.CreatePlayerInfoRequest;
import com.cricket.tournament.Transformer.PlayerInfoResponse;
import com.cricket.tournament.Models.PlayersInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerInfoService {

    @Autowired
    PlayerInfoDAO playerInfoDAO;

    @Autowired
    CreatePlayerInfoRequest createPlayerInfoRequest;


    @Autowired
    PlayerInfoResponse playerInfoResponse;

    public PlayersInformation getPlayerDetails(int ranking) throws Exception {

        PlayersInformation playersInformation = new PlayersInformation();
        PlayerInfo playerInfo = playerInfoDAO.findByRanking(ranking);
        if (playerInfo.equals(null)) {
            throw new Exception("No data found for this ranking");
        }
        playersInformation = playerInfoResponse.transformResponseInfo(playerInfo);
        return playersInformation;
    }

    public CreatePlayerInformationRespose createPlayerInfo(CreatePlayerInformation createPlayerInfo) {
        CreatePlayerInformationRespose respose = null;
        PlayerInfo playerInfo = createPlayerInfoRequest.transformData(createPlayerInfo);
        playerInfoDAO.save(playerInfo);
        respose.setSuccess(true);
        return respose;
    }

}

