package com.cricket.tournament.cricket.Models;

public class CreatePlayerInformation {

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
