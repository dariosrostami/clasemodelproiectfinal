package com.company;

public abstract class Masina {
    int Id;
    String Marca;
    String Model;
    int AnProductie;
    double Pret;
    Culoare culoare;

    public Masina(int id, String marca, String model, int anProductie, double pret, Culoare culoare) {
        Id = id;
        Marca = marca;
        Model = model;
        AnProductie = anProductie;
        Pret = pret;
        this.culoare = culoare;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getAnProductie() {
        return AnProductie;
    }

    public void setAnProductie(int anProductie) {
        AnProductie = anProductie;
    }

    public double getPret() {
        return Pret;
    }

    public void setPret(double pret) {
        Pret = pret;
    }

    public Culoare getCuloare() {
        return culoare;
    }

    public void setCuloare(Culoare culoare) {
        this.culoare = culoare;
    }
}

