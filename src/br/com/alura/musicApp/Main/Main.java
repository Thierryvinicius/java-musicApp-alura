package br.com.alura.musicApp.Main;

import br.com.alura.musicApp.Models.Audio;
import br.com.alura.musicApp.Models.Podcast;
import br.com.alura.musicApp.Models.myFavs;

public class Main {
    public static void main(String[] args) {
        Audio audio = new Audio();
        audio.setTitle("Sweet Child of Mine");
        audio.setTitle("Guns N Roses");

        for(int i=0;i < 1000; i++){
            audio.viewed();
        }
        for(int i=0;i < 50; i++){
            audio.liked();
        }

        Podcast podcast = new Podcast();
        podcast.setTitle("PodPah");
        podcast.setTitle("Igão e Mitico");

        for (int i = 0; i < 5000; i++) {
            podcast.viewed();
        }
        for (int i = 0; i < 1000; i++) {
            podcast.liked();
        }

        myFavs favs = new myFavs();
        favs.including(podcast);
        favs.including(audio);
    }
}