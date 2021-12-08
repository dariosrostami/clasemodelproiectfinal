package com.company;

public class MasinaElectrica extends Masina{
    double CapacitateBaterie;
    double ConsumElectric;

    public MasinaElectrica(int id, String marca, String model, int anProductie, double pret, Culoare culoare, double capacitateBaterie, double consumElectric) {
        super(id, marca, model, anProductie, pret, culoare);
        CapacitateBaterie = capacitateBaterie;
        ConsumElectric = consumElectric;
    }

    public double getCapacitateBaterie() {
        return CapacitateBaterie;
    }

    public void setCapacitateBaterie(double capacitateBaterie) {
        CapacitateBaterie = capacitateBaterie;
    }

    public double getConsumElectric() {
        return ConsumElectric;
    }

    public void setConsumElectric(double consumElectric) {
        ConsumElectric = consumElectric;
    }
}
