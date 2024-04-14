package br.com.alura.musicApp.Models;

public class myFavs {

    public void including(Audio audio){
        if(audio.getClassification() >= 9){
            System.out.println(audio.getTitle() + " é considerado um sucesso");
        } else {
            System.out.println(audio.getTitle() + " é uma bem avaliado");
        }
    }
}
