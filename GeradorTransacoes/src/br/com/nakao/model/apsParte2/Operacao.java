
package br.com.nakao.model.apsParte2;

/**
 *
 * @author Nakao
 */
public class Operacao {
    private char acao;//W,R,S ou E
    private int idTransacao;
    private char item;
    
    public Operacao(String op){
        this.acao=op.charAt(0);
        String tmp ="";
        tmp+=op.charAt(1);
        idTransacao=Integer.parseInt(tmp);
        if(acao=='W'||acao=='R'){
            item=op.charAt(3);
        }       
    }    
}
