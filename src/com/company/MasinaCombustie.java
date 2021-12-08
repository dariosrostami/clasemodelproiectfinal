package com.company;

public class MasinaCombustie extends Masina{
    Carburant TipCarburant;
    int CapacitateCilindrica;
    float Consum;

    public MasinaCombustie(int id, String marca, String model, int anProductie, double pret, Culoare culoare, Carburant tipCarburant, int capacitateCilindrica, float consum) {
        super(id, marca, model, anProductie, pret, culoare);
        TipCarburant = tipCarburant;
        CapacitateCilindrica = capacitateCilindrica;
        Consum = consum;
    }

    public Carburant getTipCarburant() {
        return TipCarburant;
    }

    public void setTipCarburant(Carburant tipCarburant) {
        TipCarburant = tipCarburant;
    }

    public int getCapacitateCilindrica() {
        return CapacitateCilindrica;
    }

    public void setCapacitateCilindrica(int capacitateCilindrica) {
        CapacitateCilindrica = capacitateCilindrica;
    }

    public float getConsum() {
        return Consum;
    }

    public void setConsum(float consum) {
        Consum = consum;
    }
}
