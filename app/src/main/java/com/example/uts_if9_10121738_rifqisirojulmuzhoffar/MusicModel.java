package com.example.uts_if9_10121738_rifqisirojulmuzhoffar;

/*  Tanggal Pengerjaan  : 8 Juli 2023
    Nama                : Rifqi Sirojul Muzhoffar
    NIM                 : 10121738
    Kelas               : IF-9 */

public class MusicModel {

    int image;
    String title;
    String singer;

    public MusicModel(int image, String title, String singer) {
        this.image = image;
        this.title = title;
        this.singer = singer;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
}
