/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nakao.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nakao
 */
public class Schedule {
    private List<String> acoes;
    
    public Schedule(List<String> s){
        acoes=s;
    }
    public Schedule(){
        acoes = new ArrayList<>();
    }

    public List<String> getAcoes() {
        return acoes;
    }

    public void add(String acao){
        acoes.add(acao);
    }
    public String getAction(int pos){
        return acoes.get(pos);
    }
    public void setAcoes(List<String> acoes) {
        this.acoes = acoes;
    }
    
}
