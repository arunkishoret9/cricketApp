package com.cricket.tournament.DAO;

import com.cricket.tournament.Entities.PlayerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerInfoDAO extends JpaRepository<PlayerInfo, Long> {

    PlayerInfo findByRanking(Integer ranking);
}

