/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nakao.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 *
 * @author Nakao
 */
public class Transacao {
    private int id;
    private List<Operacao> operacoes; //Reads e Writes somente
    private List<String> itens;
    private List<Operacao> schedule; //Reads e Writes + Si e Ei
    private int qtAcessos;
    
    
    public Transacao(int qtAcessos,List<String> itens,int id){
        operacoes = new ArrayList<>();
        this.qtAcessos=qtAcessos;
        this.itens=itens;
        this.id=id;
        gerarOperacoes();
        gerarSchedule();
    }  
    
    public Transacao(int id,int qtAcessos,List<Operacao> operacoes,List<Operacao> schedule,List<String> itens){
        this.id=id;
        this.qtAcessos=qtAcessos;
        this.operacoes=operacoes;
        this.schedule=schedule;
        this.itens=itens;
    }
    
    private void gerarSchedule(){
        schedule = new ArrayList<>();
        schedule.add(new Operacao("S"+this.id));
        for(int i=0;i<=operacoes.size()-1;i++){
            schedule.add(operacoes.get(i));
        }
        schedule.add(new Operacao("E"+this.id));         
    }
    
    public String getOperacoesW(){
        String out=("T"+this.id+": S"+this.id+"; ");
        for(int i=0;i<=operacoes.size()-1;i++){
            out+=operacoes.get(i).getStringOp()+"; ";
        }        
        out+="E"+this.id+";";
        return out;
    }
    
    private void gerarOperacoes(){
        Random gerador = new Random();
        int operacao;
        int item;
        String op="";
        for(int i=0;i<qtAcessos;i++){
            operacao=gerador.nextInt(2);
            if(operacao==0){
                op+="W"+this.id+"(";
            }else{
                op+="R"+this.id+"(";
            }
            item=gerador.nextInt(itens.size());
            for(int j=0;j<=Item.values().length-1;j++){
                if(Item.values()[j].valor==item){
                    op+=Item.values()[j].letra;
                    break;
                }
            }
            op+=")";            
            operacoes.add(new Operacao(op));
            op="";
        }
    }
    public List<Operacao> getSchedule() {
        return schedule;
    }    
}
