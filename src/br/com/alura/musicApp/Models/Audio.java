package br.com.alura.musicApp.Models;

public class Audio {
    private String title;
    private int durationInMinutes;
    private int totalPlays;
    private int likes;
    private int classification;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getTotalPlays() {
        return totalPlays;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public int getLikes() {
        return likes;
    }

    public int getClassification() {
        return classification;
    }

    public void liked(){
        this.likes++;
    }
    public void viewed(){
        this.totalPlays++;
    }
}
