package com.cricket.tournament.cricket.service;

import com.cricket.tournament.cricket.DAO.PlayerInfoDAO;
import com.cricket.tournament.cricket.Entities.PlayerInfo;
import com.cricket.tournament.cricket.Models.CreatePlayerInformation;
import com.cricket.tournament.cricket.Models.CreatePlayerInformationRespose;
import com.cricket.tournament.cricket.Models.PlayersInformation;
import com.cricket.tournament.cricket.Transformer.CreatePlayerInfoRequest;
import com.cricket.tournament.cricket.Transformer.PlayerInfoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

