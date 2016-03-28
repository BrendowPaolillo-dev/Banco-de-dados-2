/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nakao.model;

/**
 *
 * @author Nakao
 */
public enum Item {
    A(0,"A"),
    B(1,"B"),
    C(2,"C"),
    D(3,"D"),
    E(4,"E"),
    F(5,"F"),
    G(6,"G"),
    H(7,"H");
    public int valor; 
    public String letra;
    
    Item(int valor,String letra) { 
        this.valor = valor;
        this.letra=letra;
    }

    
}
