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
public class Sala {
   private int numero = -1;
   private int capacidade = 30;
   private int salaID = -1;
/**
 * Contrutor da sala que receve todos os atributos
 * @param numero numero da sala
 * @param capacidade capacidade da sala
 * @param salaID id da sala
 */
    public Sala(int numero, int capacidade, int salaID) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.salaID = salaID;
    }

    public int getSalaID() {
        return salaID;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Sala{" + "numero=" + numero + ", capacidade=" + capacidade + ", salaID=" + salaID + '}';
    }
   
    
}
