package com.company;

public class ClientJuridic extends Client{
    String NumeFirma;
    int CUI;
    int NumarRegistru;
    String SediuProfesional;
    int CodActivitatePrincipala;

    public ClientJuridic(int id, String email, String telefon, String numeFirma, int CUI, int numarRegistru, String sediuProfesional, int codActivitatePrincipala) {
        super(id, email, telefon);
        NumeFirma = numeFirma;
        this.CUI = CUI;
        NumarRegistru = numarRegistru;
        SediuProfesional = sediuProfesional;
        CodActivitatePrincipala = codActivitatePrincipala;

    }

    public String getNumeFirma() {
        return NumeFirma;
    }

    public void setNumeFirma(String numeFirma) {
        NumeFirma = numeFirma;
    }

    public int getCUI() {
        return CUI;
    }

    public void setCUI(int CUI) {
        this.CUI = CUI;
    }

    public int getNumarRegistru() {
        return NumarRegistru;
    }

    public void setNumarRegistru(int numarRegistru) {
        NumarRegistru = numarRegistru;
    }

    public String getSediuProfesional() {
        return SediuProfesional;
    }

    public void setSediuProfesional(String sediuProfesional) {
        SediuProfesional = sediuProfesional;
    }

    public int getCodActivitatePrincipala() {
        return CodActivitatePrincipala;
    }

    public void setCodActivitatePrincipala(int codActivitatePrincipala) {
        CodActivitatePrincipala = codActivitatePrincipala;
    }
}
