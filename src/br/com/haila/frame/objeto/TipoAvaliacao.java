/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.haila.frame.objeto;

/**
 *
 * @author SATC
 */
public enum TipoAvaliacao {
    
    TRABALHO("TRABALHO"),
    PROVA("PROVA"),
    SEMINARIO("SEMINÁRIO");
    
    private String nomeAvaliacao;
    
    public String getNomeAvaliacao(){
        return nomeAvaliacao;
    }
    private TipoAvaliacao(String nome){
        
    }
    

   
    
}
