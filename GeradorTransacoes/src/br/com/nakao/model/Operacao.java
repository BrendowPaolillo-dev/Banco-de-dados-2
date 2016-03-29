
package br.com.nakao.model;

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
        String tmp;
        tmp=op.charAt(1)+"";
        idTransacao=Integer.parseInt(tmp);
        if(acao=='W'||acao=='R'){
            item=op.trim().charAt(3);
        }        
    }
    
    public String getStringOp(){
        if(this.acao=='W'||this.acao=='R'){
            return this.acao+""+this.idTransacao+"("+item+")";
        }
        return this.acao+""+this.idTransacao;
    }

    public char getAcao() {
        return acao;
    }

    public void setAcao(char acao) {
        this.acao = acao;
    }

    public int getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(int idTransacao) {
        this.idTransacao = idTransacao;
    }

    public char getItem() {
        return item;
    }

    public void setItem(char item) {
        this.item = item;
    }
    
}
