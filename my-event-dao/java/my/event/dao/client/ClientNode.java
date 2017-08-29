package my.event.dao.client;

import my.event.commons.annotations.NodeAnnotation;
import my.event.dao.base.Node;

/**
 * Created by simon.calabrese on 29/08/2017.
 */
@NodeAnnotation(baseAlias = "c",
                labelReferences = "Client")
public class ClientNode extends Node {
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
