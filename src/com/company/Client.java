package com.company;

public abstract class Client {
    int Id;
    String Email;
    String Telefon;

    public Client(int id, String email, String telefon) {
        Id = id;
        Email = email;
        Telefon = telefon;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTelefon() {
        return Telefon;
    }

    public void setTelefon(String telefon) {
        Telefon = telefon;
    }
}
