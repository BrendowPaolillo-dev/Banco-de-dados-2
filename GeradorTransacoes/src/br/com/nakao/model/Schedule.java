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
    private List<Operacao> acoes;
    
    
    public Schedule(List<Operacao> s){
        acoes=s;
    }
    public Schedule(){
        acoes = new ArrayList<>();
    }

    public List<Operacao> getAcoes() {
        return acoes;
    }

    public void add(Operacao acao){
        acoes.add(acao);
    }
    public Operacao getAction(int pos){
        return acoes.get(pos);
    }
    public void setAcoes(List<Operacao> acoes) {
        this.acoes = acoes;
    }
    
}
