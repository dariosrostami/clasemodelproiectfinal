package com.company;

public class ClientFizic extends Client {
    String Adresa;
    String Nume;
    String Prenume;

    public ClientFizic(int id, String email, String telefon, String adresa, String nume, String prenume) {
        super(id, email, telefon);
        Adresa = adresa;
        Nume = nume;
        Prenume = prenume;
    }

    public String getAdresa() {
        return Adresa;
    }

    public void setAdresa(String adresa) {
        Adresa = adresa;
    }

    public String getNume() {
        return Nume;
    }

    public void setNume(String nume) {
        Nume = nume;
    }

    public String getPrenume() {
        return Prenume;
    }

    public void setPrenume(String prenume) {
        Prenume = prenume;
    }
}
