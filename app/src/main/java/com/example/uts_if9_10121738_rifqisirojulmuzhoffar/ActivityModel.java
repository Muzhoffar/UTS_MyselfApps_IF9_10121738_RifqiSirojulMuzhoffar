package com.example.uts_if9_10121738_rifqisirojulmuzhoffar;

/*  Tanggal Pengerjaan  : 29 Mei 2023
    Nama                : Rifqi Sirojul Muzhoffar
    NIM                 : 10121738
    Kelas               : IF-9 */

public class ActivityModel {

    int image;
    String title;
    String desc;

    public ActivityModel(int image, String title, String desc) {
        this.image = image;
        this.title = title;
        this.desc = desc;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
