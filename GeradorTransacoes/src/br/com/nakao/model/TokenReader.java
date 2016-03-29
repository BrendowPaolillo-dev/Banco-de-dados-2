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
public class TokenReader {
    
    public List<Transacao> getTransactions(String path){
        Arquivo arq = new Arquivo();
        List<String> linhas=arq.lerArquivo(path);
        List<Transacao> transacoes = new ArrayList<>();
        List<String> scheduleL;
        List<String> operacoes;
        List<String> itens;
        int qtAcessos;
        int id;
        String doisPontos[];
        String schedule[];
        int cont = 0;
        for(String s:linhas){
            cont=0;            
            doisPontos = s.split(":");
            schedule = doisPontos[1].split(";");
            operacoes = new ArrayList<>();
            itens = new ArrayList<>();
            scheduleL = new ArrayList<>();
            for(int i = 0;i<=schedule.length-1;i++){
                scheduleL.add(schedule[i].trim());
                if(i!=0&&i!=schedule.length-1){
                    operacoes.add(schedule[i].trim());
                    if(!itens.contains(operacoes.get(cont).charAt(3)+"")){
                        itens.add(operacoes.get(cont).charAt(3)+"");
                    }             
                    cont++;
                }
            }
            qtAcessos = operacoes.size();
            id = Character.getNumericValue(operacoes.get(0).charAt(1));
            
            List<Operacao> operacoesL = new ArrayList<>();
            for(String s1:operacoes){
                Operacao tmp = new Operacao(s1.trim());
                operacoesL.add(tmp);                        
            }
            
            List<Operacao> scheduleL2 = new ArrayList<>();
            for(String s1:scheduleL){
                Operacao tmp = new Operacao(s1.trim());
                scheduleL2.add(tmp);                        
            }
            
            Transacao t = new Transacao(id,qtAcessos,operacoesL,scheduleL2,itens);
            transacoes.add(t);
        }      
        return transacoes;
    }
    public List<Operacao> getListOperacoes(String path){
        Arquivo arq = new Arquivo();
        String sched=arq.lerArquivo(path).get(0);
        String operacoes[] = sched.trim().split(";");
        List<Operacao> saida = new ArrayList<>();
        for(String s:operacoes){
                Operacao tmp = new Operacao(s.trim());
                saida.add(tmp);                        
        }   
        return saida;        
    }
    
}
