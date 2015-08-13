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

public class Filme {
 private String nome;
 private  String diretor;  
 private int filmeID;
 
 
    public Filme(String nome, String diretor, int filmeID) {
        this.nome = nome;
        this.diretor = diretor;
        this.filmeID = filmeID;
    }

    public int getFilmeID() {
        return filmeID;
    }

    @Override
    public String toString() {
        return "Filme{" + "nome=" + nome + ", diretor=" + diretor + ", filmeID=" + filmeID + '}';
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }


}
