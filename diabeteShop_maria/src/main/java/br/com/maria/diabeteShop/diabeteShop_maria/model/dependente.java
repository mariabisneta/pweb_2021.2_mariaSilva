package br.com.maria.diabeteShop.diabeteShop_maria.model;

import java.util.Calendar;

public class dependente {

    private Long idDependente;
	private String nome;
    public Long getIdDependente() {
        return idDependente;
    }
    public void setIdDependente(Long idDependente) {
        this.idDependente = idDependente;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Calendar getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(Calendar dataNasc) {
        this.dataNasc = dataNasc;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    private Calendar dataNasc;
    private String genero;

}