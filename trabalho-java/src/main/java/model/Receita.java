/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author Gabriel Krzizanowski
 */
public class Receita implements ValoresDomesticos {
    
    private Double valor;
    private String descricao;
    private TipoDeValores tdv;
    private LocalDate dia;

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public double calcularValor() {
        return getValor();
    }

    public TipoDeValores getTdv() {
        return tdv;
    }

    public void setTdv(TipoDeValores tdv) {
        this.tdv = tdv;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }  
}
