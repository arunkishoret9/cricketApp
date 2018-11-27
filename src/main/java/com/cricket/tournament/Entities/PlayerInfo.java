package com.cricket.tournament.Entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name= "player_info")
public class PlayerInfo implements Serializable{

    @Id
    @Column(name="ID")
    @GeneratedValue
    private Integer id;

    @Column(name="player_name")
    private String PlayerName;

    @Column(name="date_of_birth")
    private String dateOfBirth;

    @Column(name="origin_place")
    private String originPlace;

    @Column(name="country")
    private String country;

    @Column(name="leagues")
    private String leagues;

    @Column(name="ranking")
    private int ranking;

    @Column(name="jersey_number")
    private int jerseryNumber;

    @Column(name="player_type")
    private String playerType;

    @Column(name="best_score")
    private String bestScore;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName(String playerName) {
        PlayerName = playerName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getOriginPlace() {
        return originPlace;
    }

    public void setOriginPlace(String originPlace) {
        this.originPlace = originPlace;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLeagues() {
        return leagues;
    }

    public void setLeagues(String leagues) {
        this.leagues = leagues;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public int getJerseryNumber() {
        return jerseryNumber;
    }

    public void setJerseryNumber(int jerseryNumber) {
        this.jerseryNumber = jerseryNumber;
    }

    public String getPlayerType() {
        return playerType;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public String getBestScore() {
        return bestScore;
    }

    public void setBestScore(String bestScore) {
        this.bestScore = bestScore;
    }
}
