
package br.com.nakao.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 *
 * @author Nakao
 */
public class GeradorSchedule {
    private List<Transacao> transacoes;
    private List<Schedule> schedules;
    private Schedule principal;
    private String path;
    
    public GeradorSchedule(List<Transacao> transacoes, String path){
        schedules = new ArrayList<>();
        this.transacoes=transacoes;
        for(Transacao t:transacoes){
            schedules.add(new Schedule(t.getSchedule()));
        }  
        this.path=path;
        gerarSchedulePrincipal();
    }
    
    public String getSchedulePrincipal(){
        String out="";
        for(String s:principal.getAcoes()){
            out+=s+"; ";
        }
        return out;
    }
    public void writeScheduleOnDisk(){
        Arquivo arq = new Arquivo();
        arq.escreverArquivo(path+"/schedule.txt", getSchedulePrincipal());
    }
    
    private void gerarSchedulePrincipal(){
        Random gerador = new Random();
        principal = new Schedule();
        for(int i = 0;i<=schedules.get(0).getAcoes().size()-1;i++){       
            List<String> temporarios = new ArrayList<>();
            for(Schedule s:schedules){
                temporarios.add(s.getAcoes().get(i));
            }
            while(temporarios.size()>0){
                int pos=gerador.nextInt(temporarios.size());
                principal.add(temporarios.get(pos));
                temporarios.remove(pos);
            }
        }
    }    
}
