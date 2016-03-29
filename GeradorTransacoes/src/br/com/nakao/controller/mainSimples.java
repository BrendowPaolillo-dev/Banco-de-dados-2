/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nakao.controller;

import br.com.nakao.model.TokenReader;
import br.com.nakao.model.Operacao;
import java.util.List;

/**
 *
 * @author Nakao
 * Professor!!!! NÃO USE ESTE MAIN, USE O MainReal
 */
public class mainSimples {
    public static void main(String[] args) {
//        GeradorTransacoes g = new GeradorTransacoes(4, 3, 5,"src/br/com/nakao/files");
//        g.escreverTransacoesArquivo();
        System.out.println("Professor!!!! NÃO USE ESTE MAIN, USE O MainReal");
        TokenReader t = new TokenReader();
        List<Operacao> l = t.getListOperacoes("src/br/com/nakao/files/schedule.txt");
        for(Operacao o:l){
            System.out.println(o.getStringOp());
        }
//        GeradorSchedule g1 = new GeradorSchedule(t.getTransactions("src/br/com/nakao/files/transacoes.txt"),"src/br/com/nakao/files");
//        g1.writeScheduleOnDisk();        
    }
}
