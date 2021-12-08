package com.company;

import java.util.Date;
import java.util.List;

public class Comanda {
    Client Client;
    Date dataVanzare;
    List<Comanda> comenzi;

    public Comanda(com.company.Client client, Date dataVanzare, List<Comanda> comenzi) {
        Client = client;
        this.dataVanzare = dataVanzare;
        this.comenzi = comenzi;
    }

    public com.company.Client getClient() {
        return Client;
    }

    public void setClient(com.company.Client client) {
        Client = client;
    }

    public Date getDataVanzare() {
        return dataVanzare;
    }

    public void setDataVanzare(Date dataVanzare) {
        this.dataVanzare = dataVanzare;
    }

    public List<Comanda> getComenzi() {
        return comenzi;
    }

    public void setComenzi(List<Comanda> comenzi) {
        this.comenzi = comenzi;
    }
}
