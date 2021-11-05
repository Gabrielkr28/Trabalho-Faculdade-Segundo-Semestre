/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import model.ControleDeValores;
import model.Despesa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import model.LeituraDeDados;
import model.Receita;
import model.TipoDeValores;
import model.ValoresDomesticos;

/**
 *
 * @author Gabriel Krzizanowski
 */
public class LeituraDeDadosTest {

    private LeituraDeDados leitura;

    @BeforeEach
    public void onInit() {
        leitura = new LeituraDeDados();
    }

    @Test
    public void verificarArquivoCriado() {

       Receita receita = new Receita();
       Despesa despesa = new Despesa();
       ControleDeValores controle = new ControleDeValores();
       ArrayList<ValoresDomesticos> valoresDomesticos = new ArrayList<>();
       receita.setDescricao("Salario");
       receita.setValor(1500.00);
       receita.setDia(LocalDate.of(2021, 10, 10));
       receita.setTdv(TipoDeValores.RECEITA);
        
       despesa.setDescricao("Conta");
       despesa.setValor(150.00);
       despesa.setDia(LocalDate.of(2021, 01, 10));
       despesa.setTdv(TipoDeValores.DESPESA);
       
       controle.adicionarValores(despesa);
       controle.adicionarValores(receita);
       
        valoresDomesticos.add(despesa);
        valoresDomesticos.add(receita);
       
        assertEquals(receita.getValor(), leitura.receitasFile().get(0).getValor()); 
        assertEquals(despesa.getValor(), leitura.despesasFile().get(0).getValor());
        assertEquals(valoresDomesticos.get(1).calcularValor(), leitura.extratoFile().get(1).calcularValor());
        assertEquals(valoresDomesticos.get(1).calcularValor(), leitura.extratoFile().get(0).calcularValor());
    
    }

}
