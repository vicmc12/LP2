/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabeans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author 31381243
 */
public class Sessao {
    private int sessaoID;
    private Sala sala;
    private Filme filme;
    private Date data;
    private List<Ingresso> ingressos ;

    public Sessao(int sessaoID, Sala sala, Filme filme, Date data) {
        this.sessaoID = sessaoID;
        this.sala = sala;
        this.filme = filme;
        this.data = data;
        this.ingressos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Sessao{" + "sessaoID=" + sessaoID + ", sala=" + sala + ", filme=" + filme + ", data=" + data + ", ingressos=" + ingressos + '}';
    }
public void addIngresso(Ingresso ingresso){
    ingressos.add(ingresso);
}
    public int getSessaoID() {
        return sessaoID;
    }

    public void setSessaoID(int sessaoID) {
        this.sessaoID = sessaoID;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }
    
}
