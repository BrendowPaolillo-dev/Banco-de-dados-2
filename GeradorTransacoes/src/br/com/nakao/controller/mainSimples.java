/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nakao.controller;

import br.com.nakao.model.GeradorSchedule;
import br.com.nakao.model.GeradorTransacoes;
import br.com.nakao.model.TokenReader;

/**
 *
 * @author Nakao
 */
public class mainSimples {
    public static void main(String[] args) {
        GeradorTransacoes g = new GeradorTransacoes(4, 3, 5,"src/br/com/nakao/files");
        g.escreverTransacoesArquivo();
        TokenReader t = new TokenReader();        
        GeradorSchedule g1 = new GeradorSchedule(t.getTransactions("src/br/com/nakao/files/transacoes.txt"),"src/br/com/nakao/files");
        g1.writeScheduleOnDisk();        
    }
}
