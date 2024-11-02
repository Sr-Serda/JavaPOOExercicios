package br.com.serda.southmap.models;

public class Title {
    private String name;
    private String description;
    private int yearOfLaunch;
    private String publisher;
    private double hoursToBeat;
    private double ratingSum;
    private int totalRating;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getYearOfLaunch() {
        return yearOfLaunch;
    }

    public String getPublisher() {
        return publisher;
    }

    public double getHoursToBeat() {
        return hoursToBeat;
    }

    public void setHoursToBeat(double hoursToBeat) {
        this.hoursToBeat = hoursToBeat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setYearOfLaunch(int yearOfLaunch) {
        this.yearOfLaunch = yearOfLaunch;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }



    public int getTotalRating(){
        return totalRating;
    }
    public void showInformation(){
        System.out.println("O nome do jogo é: " + name);
        System.out.println("A descrição do jogo é: " + description);
        System.out.println("O ano de lançamento é: " + yearOfLaunch);
    }

    public void rating(double rate){
        ratingSum += rate;
        totalRating++;
    }

    public double getAverage(){
        return ratingSum / totalRating;
    }
}
