package br.com.alura.musicApp.Models;

public class Music extends Audio{
    private String album;
    private String artista;
    private String gender;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int getClassification() {
        if (this.getTotalPlays() > 2000){
            return 10;
        } else {
            return 7;
        }
    }
}
