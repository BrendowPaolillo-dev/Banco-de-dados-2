
package br.com.nakao.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nakao
 */
public class GeradorTransacoes {
    private String caminho;
    private int qtItensDados;    
    private int qtTransacoes;
    private int qtAcessos;
    private List<String> itensDados;
    private List<Transacao> transacoes;
    private int contadorTransacoes=0;
    
    public GeradorTransacoes(int qtItens,int qtTransacoes,int qtAcess, String caminho){
        this.qtItensDados=qtItens;
        this.qtAcessos=qtAcess;
        this.qtTransacoes=qtTransacoes;
        this.caminho=caminho;
        gerarItens();   
        gerarTransacoes();
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }
    
    public void printarTransacoes(){
        for(Transacao t:transacoes){
            System.out.println(t.getOperacoesW());
        }
    }
    public void escreverTransacoesArquivo(){
        String bloco="";
        for(Transacao t:transacoes){
            bloco+=(t.getOperacoesW()+"\n");
        }
        Arquivo arq = new Arquivo();
        arq.escreverArquivo(caminho+"/transacoes.txt", bloco);
    }
    
    private void gerarTransacoes(){
        transacoes = new ArrayList<>();
        for(int i=0;i<=qtTransacoes-1;i++){
            transacoes.add(gerarTransacao());
        }
    }
    
    private Transacao gerarTransacao(){
        Transacao t = new Transacao(qtAcessos,itensDados,contadorTransacoes);
        
        contadorTransacoes++;
        return t;
    }
    
    private void gerarItens(){
        itensDados = new ArrayList<>();
        for(int i = 0; i<=qtItensDados-1; i++){
            for(int j = 0; j<=Item.values().length-1;j++){
                if(i==Item.values()[j].valor){
                    itensDados.add(Item.values()[j].letra);
                }
            }
        }
    }
    
    public int getQtItensDados() {
        return qtItensDados;
    }

    public void setQtItensDados(int qtItensDados) {
        this.qtItensDados = qtItensDados;
    }

    public int getQtTransacoes() {
        return qtTransacoes;
    }

    public void setQtTransacoes(int qtTransacoes) {
        this.qtTransacoes = qtTransacoes;
    }

    public int getQtAcessos() {
        return qtAcessos;
    }

    public void setQtAcessos(int qtAcessos) {
        this.qtAcessos = qtAcessos;
    }
    
}
