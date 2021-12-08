package com.company;

public class ArticolComanda {
    Masina MasinaProdus;
    int Cantitate;

    public ArticolComanda(Masina masinaProdus, int cantitate) {
        MasinaProdus = masinaProdus;
        Cantitate = cantitate;
    }

    public Masina getMasinaProdus() {
        return MasinaProdus;
    }

    public void setMasinaProdus(Masina masinaProdus) {
        MasinaProdus = masinaProdus;
    }

    public int getCantitate() {
        return Cantitate;
    }

    public void setCantitate(int cantitate) {
        Cantitate = cantitate;
    }
}
