/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nakao.controller;
import br.com.nakao.model.GeradorSchedule;
import br.com.nakao.model.GeradorTransacoes;
import br.com.nakao.model.TokenReader;
import java.util.Scanner;

/**
 * Created by Guilherme on 28/03/2016.
 */
public class mainExecutavelForaProjeto {
    public static void main(String[] args) {

        while (true) {
            System.out.println("1 - Gerar Transacoes");
            System.out.println("2 - Gerar Schedule");
            System.out.println("3 - Escalonar Transacoes");

            Scanner scanner = new Scanner(System.in);
            int op = Integer.parseInt(scanner.nextLine());

            if (op == 1) {
                System.out.println("Quantos itens de dados devem ser criados?");
                int itens = Integer.parseInt(scanner.nextLine());
                System.out.println("Quantas transacoes?");
                int transacoes = Integer.parseInt(scanner.nextLine());
                System.out.println("Quantos acessos por transacao?");
                int acessos = Integer.parseInt(scanner.nextLine());                
                System.out.println("Digite o caminho");
                String arquivo = scanner.nextLine();
                GeradorTransacoes g = new GeradorTransacoes(itens, transacoes, acessos,arquivo);
                g.escreverTransacoesArquivo();
                System.out.println("Transacoes geradas em "+arquivo+"/transacoes.txt");
                
            }
            else if (op == 2) {
                String caminhoTransacao;
                String caminhoSchedule;
                System.out.println("Digite o caminho da transacao");
                caminhoTransacao=scanner.nextLine();
                System.out.println("Digite o caminho em que deseja salvar o schedule");
                caminhoSchedule=scanner.nextLine();
                System.out.println("Gerando Schedule:");
                TokenReader t = new TokenReader();        
                GeradorSchedule g1 = new GeradorSchedule(t.getTransactions(caminhoTransacao),caminhoSchedule);
                g1.writeScheduleOnDisk();
                System.out.println("Schedule gerado com sucesso em "+caminhoSchedule+"/schedule.txt");
                
            }
            else if (op == 3) {
                System.out.println("\nAinda não implementado");                
                System.out.println("\n");
            }
        }
    }
}
