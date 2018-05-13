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
public class Nota {
    private String nomeDisciplina;
    private TipoAvaliacao TipoAvaliacao;
    private float nota;

    public Nota(String nomeDisciplina, TipoAvaliacao TipoAvaliacao, float nota) {
        this.nomeDisciplina = nomeDisciplina;
        this.TipoAvaliacao = TipoAvaliacao;
        this.nota = nota;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    
}
