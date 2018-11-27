package com.cricket.tournament.Models;

import lombok.Data;

@Data
public class PlayersInformation {

    private String PlayerName;
    private String dateOfBirth;
    private String originPlace;
    private String country;
    private String leagues;
    private int ranking;
    private int jerseryNumber;
    private String playerType;
    private String bestScore;

    public String getPlayerName() {
        return PlayerName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getOriginPlace() {
        return originPlace;
    }

    public String getCountry() {
        return country;
    }

    public String getLeagues() {
        return leagues;
    }

    public int getRanking() {
        return ranking;
    }

    public int getJerseryNumber() {
        return jerseryNumber;
    }

    public String getPlayerType() {
        return playerType;
    }

    public String getBestScore() {
        return bestScore;
    }

    public void setPlayerName(String playerName) {
        PlayerName = playerName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setOriginPlace(String originPlace) {
        this.originPlace = originPlace;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLeagues(String leagues) {
        this.leagues = leagues;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public void setJerseryNumber(int jerseryNumber) {
        this.jerseryNumber = jerseryNumber;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public void setBestScore(String bestScore) {
        this.bestScore = bestScore;
    }
}
