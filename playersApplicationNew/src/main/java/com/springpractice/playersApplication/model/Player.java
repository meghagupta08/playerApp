package com.springpractice.playersApplication.model;
import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Player {

    @Id

    private String playerId;

    private String birthYear;
    private String brithMonth;
    private String birthDay;
    private String birthCountry;
    private String birthState;
    private String birthCity;
    private String deathYear;
    private String deathMonth;
    private String deathDay;
    private String deathCountry;
    private String deathState;
    private String deathCity;
    private String nameFirst;
    private String nameLast;
    private String nameGiven;
    private String weight;
    private String height;
    private String bats;
    private String throwCount;
    private String debut;
    private String finalGame;
    private String retroId;
    private String bbrefId;


    public Player(){

    }

    public Player(String playerId, String birthYear, String brithMonth, String birthDay, String birthCountry, String birthState, String birthCity, String deathYear, String deathMonth, String deathDay, String deathCountry, String deathState, String deathCity, String nameFirst, String nameLast, String nameGiven, String weight, String height, String bats, String throwCount, String debut, String finalGame, String retroId, String bbrefId) {
        this.playerId = playerId;
        this.birthYear = birthYear;
        this.brithMonth = brithMonth;
        this.birthDay = birthDay;
        this.birthCountry = birthCountry;
        this.birthState = birthState;
        this.birthCity = birthCity;
        this.deathYear = deathYear;
        this.deathMonth = deathMonth;
        this.deathDay = deathDay;
        this.deathCountry = deathCountry;
        this.deathState = deathState;
        this.deathCity = deathCity;
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
        this.nameGiven = nameGiven;
        this.weight = weight;
        this.height = height;
        this.bats = bats;
        this.throwCount = throwCount;
        this.debut = debut;
        this.finalGame = finalGame;
        this.retroId = retroId;
        this.bbrefId = bbrefId;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getBrithMonth() {
        return brithMonth;
    }

    public void setBrithMonth(String brithMonth) {
        this.brithMonth = brithMonth;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    public String getBirthState() {
        return birthState;
    }

    public void setBirthState(String birthState) {
        this.birthState = birthState;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public String getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(String deathYear) {
        this.deathYear = deathYear;
    }

    public String getDeathMonth() {
        return deathMonth;
    }

    public void setDeathMonth(String deathMonth) {
        this.deathMonth = deathMonth;
    }

    public String getDeathDay() {
        return deathDay;
    }

    public void setDeathDay(String deathDay) {
        this.deathDay = deathDay;
    }

    public String getDeathCountry() {
        return deathCountry;
    }

    public void setDeathCountry(String deathCountry) {
        this.deathCountry = deathCountry;
    }

    public String getDeathState() {
        return deathState;
    }

    public void setDeathState(String deathState) {
        this.deathState = deathState;
    }

    public String getDeathCity() {
        return deathCity;
    }

    public void setDeathCity(String deathCity) {
        this.deathCity = deathCity;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public String getNameLast() {
        return nameLast;
    }

    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    public String getNameGiven() {
        return nameGiven;
    }

    public void setNameGiven(String nameGiven) {
        this.nameGiven = nameGiven;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getBats() {
        return bats;
    }

    public void setBats(String bats) {
        this.bats = bats;
    }

    public String getThrowCount() {
        return throwCount;
    }

    public void setThrowCount(String throwCount) {
        this.throwCount = throwCount;
    }

    public String getDebut() {
        return debut;
    }

    public void setDebut(String debut) {
        this.debut = debut;
    }

    public String getFinalGame() {
        return finalGame;
    }

    public void setFinalGame(String finalGame) {
        this.finalGame = finalGame;
    }

    public String getRetroId() {
        return retroId;
    }

    public void setRetroId(String retroId) {
        this.retroId = retroId;
    }

    public String getBbrefId() {
        return bbrefId;
    }

    public void setBbrefId(String bbrefId) {
        this.bbrefId = bbrefId;
    }
}
