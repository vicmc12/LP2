/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabeans;

/**
 *
 * @author 31381243
 */
public class Ingresso {
    private int numero = -1;
    private int tipo;
    private double valor = 10;
    private int ingressoID = -1;

    @Override
    public String toString() {
        return "Ingresso{" + "numero=" + numero + ", tipo=" + tipo + ", valor=" + valor + ", ingressoID=" + ingressoID + '}';
    }

  
 /**
 * Contrutor do ingresso que recebe todos os atributos
 * @param numero numero do ingressp
 * @param ingressoID identificador do ingresso
 */
        public Ingresso(int numero, int ingressoID) {
        this.numero = numero;
        this.tipo = 1;
        this.valor = 12.0;
        this.ingressoID = ingressoID;
    }   
/**
 * Contrutor do ingresso que recebe todos os atributos
 * @param numero numero do ingressp
 * @param tipo tipo do ingresso(meia, inteiro)
 * @param ingressoID identificador do ingresso
 */
        public Ingresso(int numero, int tipo,  int ingressoID) {
        this.numero = numero;
        this.tipo = tipo;
        this.valor = (tipo==1)?12.0:6.0;
        this.ingressoID = ingressoID;
    }
        
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getIngressoID() {
        return ingressoID;
    }



}
