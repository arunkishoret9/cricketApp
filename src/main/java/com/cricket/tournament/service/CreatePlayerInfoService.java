package com.cricket.tournament.service;

import com.cricket.tournament.DAO.PlayerInfoDAO;
import com.cricket.tournament.Entities.PlayerInfo;
import com.cricket.tournament.Models.CreatePlayerInformation;
import com.cricket.tournament.Models.CreatePlayerInformationRespose;
import com.cricket.tournament.Transformer.CreatePlayerInfoTransform;
import com.cricket.tournament.Transformer.GetPlayerInfoTransform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreatePlayerInfoService {

    @Autowired
    PlayerInfoDAO playerInfoDAO;

    @Autowired
    CreatePlayerInfoTransform createPlayerInfoRequest;

    public CreatePlayerInformationRespose createPlayerInfo(List<CreatePlayerInformation> createPlayerInfo) {
        CreatePlayerInformationRespose respose = null;
        List<PlayerInfo> playerInfo = createPlayerInfoRequest.transformData(createPlayerInfo);
        playerInfoDAO.saveAll(playerInfo);
        respose.setSuccess(true);
        return respose;
    }
}
