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
    
    private String nome;

    private TipoAvaliacao(String nome) {
        this.nome = nome;
    }

    public static TipoAvaliacao getTRABALHO() {
        return TRABALHO;
    }

    public static TipoAvaliacao getPROVA() {
        return PROVA;
    }

    public static TipoAvaliacao getSEMINARIO() {
        return SEMINARIO;
    }

    public String getNome() {
        return nome;
    }
    
}
