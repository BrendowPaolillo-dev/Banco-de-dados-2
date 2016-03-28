package br.com.nakao.model;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @author Brendow
 */
public class Arquivo {
    private FileReader arq;
    private BufferedReader buff;
    

    public List<String> lerArquivo(String path){
        List<String> file;
        file = new ArrayList<>();
        try {
            arq = new FileReader (path);
            buff = new BufferedReader(arq);
            while (buff.ready()){
                file.add(buff.readLine());                
            }
            buff.close();
            return file;
        }catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao abrir arquivo");
            return file;
        }        
    }
    public void escreverArquivo(String path,String texto){
        try{
            FileWriter f = new FileWriter(path);
            PrintWriter gravarArq = new PrintWriter(f);
            gravarArq.print(texto);
            f.close();
        }catch(Exception e){
            System.out.println("Erro ao gerar arquivo");
            e.printStackTrace();
        }
    }
}
