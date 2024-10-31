package br.com.serda.southmap.models;

public class GameInfo {
    private String gameName;
    private String gameDescription;
    private int gameYearOfLaunch;
    private String gamePublisher;
    private String gamePlatforms;
    private double ratingSum;
    private int totalRating;

    public String getGameName() {
        return gameName;
    }

    public String getGameDescription() {
        return gameDescription;
    }

    public int getGameYearOfLaunch() {
        return gameYearOfLaunch;
    }

    public String getGamePublisher() {
        return gamePublisher;
    }

    public String getGamePlatforms() {
        return gamePlatforms;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public void setGameDescription(String gameDescription) {
        this.gameDescription = gameDescription;
    }

    public void setGameYearOfLaunch(int gameYearOfLaunch) {
        this.gameYearOfLaunch = gameYearOfLaunch;
    }

    public void setGamePublisher(String gamePublisher) {
        this.gamePublisher = gamePublisher;
    }

    public void setGamePlatforms(String gamePlatforms) {
        this.gamePlatforms = gamePlatforms;
    }

    public int getTotalRating(){
        return totalRating;
    }
    public void showInformation(){
        System.out.println("O nome do jogo é: " + gameName);
        System.out.println("A descrição do jogo é: " + gameDescription);
        System.out.println("O ano de lançamento é: " + gameYearOfLaunch);
    }

    public void rating(double rate){
        ratingSum += rate;
        totalRating++;
    }

    public double getAverage(){
       return ratingSum / totalRating;
    }



}

