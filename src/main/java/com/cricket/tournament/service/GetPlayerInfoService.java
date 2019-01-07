package com.cricket.tournament.service;

import com.cricket.tournament.DAO.PlayerInfoDAO;
import com.cricket.tournament.Entities.PlayerInfo;
import com.cricket.tournament.Transformer.CreatePlayerInfoTransform;
import com.cricket.tournament.Transformer.GetPlayerInfoTransform;
import com.cricket.tournament.Models.PlayersInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetPlayerInfoService {

    @Autowired
    PlayerInfoDAO playerInfoDAO;

    @Autowired
    GetPlayerInfoTransform playerInfoResponse;

    public PlayersInformation getPlayerDetails(int ranking) throws Exception {

        PlayersInformation playersInformation = new PlayersInformation();
        PlayerInfo playerInfo = playerInfoDAO.findByRanking(ranking);
        if (playerInfo.equals(null)) {
            throw new Exception("No data found for this ranking");
        }
        playersInformation = playerInfoResponse.transformResponseInfo(playerInfo);
        return playersInformation;
    }
}

