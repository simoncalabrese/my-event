package my.event.service.dto;


import my.event.service.base.BaseDTO;

/**
 * Created by simon.calabrese on 29/08/2017.
 */
public class ClientDTO extends BaseDTO {
    private String nome;
    private String cognome;
    private String sesso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }
}
