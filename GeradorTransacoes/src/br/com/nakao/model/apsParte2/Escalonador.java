/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nakao.model.apsParte2;

import br.com.nakao.model.Schedule;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Nakao
 */
public class Escalonador {
    private Schedule principal;
    private HashMap<String,String> itensDados = new HashMap<>();
    private Stack espera;
    private Schedule escalonado;
    public Escalonador(Schedule p,List<String> itens){
        principal=p;
        for(String s:itens){
            itensDados.put(s, "U");
        }
        espera = new Stack();
    }
    
    private void escalonar(){
        for(String s:principal.getAcoes()){
            
            
        }
    }    
}
