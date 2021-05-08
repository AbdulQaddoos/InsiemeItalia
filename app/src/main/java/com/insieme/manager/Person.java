package com.insieme.manager;

public class Person {
    private String nome;
    private String codice_fiscale;
    private String stato_domanda;
    private String protocollo_INPS;


    public Person(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodice_fiscale() {
        return codice_fiscale;
    }

    public void setCodice_fiscale(String codice_fiscale) {
        this.codice_fiscale = codice_fiscale;
    }

    public String getStato_domanda() {
        return stato_domanda;
    }

    public void setStato_domanda(String stato_domanda) {
        this.stato_domanda = stato_domanda;
    }

    public String getProtocollo_INPS() {
        return protocollo_INPS;
    }

    public void setProtocollo_INPS(String protocollo_INPS) {
        this.protocollo_INPS = protocollo_INPS;
    }

    public Person(String nome, String codice_fiscale, String stato_domanda, String protocollo_INPS){
        this.nome = nome;
        this.codice_fiscale = codice_fiscale;
        this.stato_domanda = stato_domanda;
        this.protocollo_INPS = protocollo_INPS;

    }

    @Override
    public String toString() {
        return  "Cognome e Nome:\n" + nome + "\n\n" +
                "Codice Fiscale:\n" + codice_fiscale + "\n\n" +
                "Stato Domanda:\n" + stato_domanda + "\n\n" +
                "Protocollo (INPS):\n" + protocollo_INPS + "\n\n" ;
    }
}
