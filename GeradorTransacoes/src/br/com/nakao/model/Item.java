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
    H(7,"H"),
    I(8,"I"),
    J(9,"J"),
    K(10,"K"),
    L(11,"L"),
    M(12,"M"),
    N(13,"N"),
    O(14,"O"),
    P(15,"P"),
    Q(16,"Q"),
    R(17,"R"),
    S(18,"S"),
    T(19,"T"),
    U(20,"U"),
    V(21,"V"),
    W(22,"W"),    
    X(23,"X"),
    Y(24,"Y"),
    Z(25,"Z");
    public int valor; 
    public String letra;
    
    Item(int valor,String letra) { 
        this.valor = valor;
        this.letra=letra;
    }

    
}
