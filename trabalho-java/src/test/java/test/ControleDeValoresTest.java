/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.time.LocalDate;
import java.time.Month;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import model.ControleDeValores;
import model.Despesa;
import model.Receita;
import model.TipoDeValores;

/**
 *
 * @author Gabriel Krzizanowski
 */
public class ControleDeValoresTest {

    private ControleDeValores controle;

    @BeforeEach
    public void onInit() {
        controle = new ControleDeValores();
    }

    @Test
    public void adcionarValoresTeste() {
        Despesa despesa = new Despesa();
        Receita receita = new Receita();
        
        despesa.setValor(1450.00);
        despesa.setDescricao("Conta");
        despesa.setDia(LocalDate.of(2021, 10, 10));
        despesa.setTdv(TipoDeValores.RECEITA);
        controle.adicionarValores(despesa);
            

    }
    

}
