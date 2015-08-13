/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2_aula2;

import java.util.Date;
import javabeans.Filme;
import javabeans.Ingresso;
import javabeans.Sala;
import javabeans.Sessao;

/**
 *
 * @author 31381243
 */
public class CinemaController {

    public CinemaController() {
        Sala sala1 = new Sala(1, 10, 1);
        Filme filme1 = new Filme( "Titulo", "Diretor", 1);
        Ingresso i1 = new Ingresso(1, 1234);
        Sessao sessao1 = new Sessao(1, sala1, filme1, new Date());
        sessao1.addIngresso(i1);
        System.out.println(sala1.toString());
        System.out.println(filme1);
        System.out.println(i1);
        System.out.println(sessao1);
        
    }
    
}
