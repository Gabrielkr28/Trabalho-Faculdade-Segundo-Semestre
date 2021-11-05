/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gabriel Krzizanowski
 */
public class LeituraDeDados {

    private Path path = Paths.get("C:\\ValoresDomesticos.csv");

    private ArrayList<String> lerArquivo() {
        String umaVez = "";
        ArrayList<String> linhas = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(this.path.toFile());
            BufferedReader lerArq = new BufferedReader(fileReader);

            while (umaVez != null) {
                umaVez = lerArq.readLine();
                if (umaVez != null) {
                    linhas.add(umaVez);
                }

            }
            return linhas;

        } catch (Exception ex) {
            Logger.getLogger(ControleDeValores.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private TipoDeValores conversaoTipoValor(String valorString) {
        if (valorString.equals("RECEITA")) {
            return TipoDeValores.RECEITA;
        }
        return TipoDeValores.DESPESA;
    }

    private LocalDate converteData(String data) {
        int year = Integer.parseInt(data.substring(6, 10));
        int month = Integer.parseInt(data.substring(3, 5));
        int day = Integer.parseInt(data.substring(0, 2));
        return LocalDate.of(year, month, day);
    }

    public ArrayList<Receita> receitasFile() {
        ArrayList<Receita> receitas = new ArrayList<>();
        for (String linha : lerArquivo()) {
            String[] dados = linha.split(";");
            if (TipoDeValores.RECEITA.equals(conversaoTipoValor(dados[0]))) {
                Receita receita = new Receita();
                receita.setTdv(conversaoTipoValor(dados[0]));
                receita.setDescricao(dados[1]);
                receita.setValor(Double.parseDouble(dados[2]));
                receita.setDia(converteData(dados[3]));
                receitas.add(receita);
            }
        }
        return receitas;
    }

    public ArrayList<Despesa> despesasFile() {
        ArrayList<Despesa> despesas = new ArrayList<>();
        for (String linha : lerArquivo()) {
            String[] dados = linha.split(";");
            if (TipoDeValores.DESPESA.equals(conversaoTipoValor(dados[0]))) {
                Despesa despesa = new Despesa();
                despesa.setTdv(conversaoTipoValor(dados[0]));
                despesa.setDescricao(dados[1]);
                despesa.setValor(Double.parseDouble(dados[2]));
                despesa.setDia(converteData(dados[3]));
                despesas.add(despesa);
            }
        }
        return despesas;
    }

    public ArrayList<ValoresDomesticos> extratoFile() {
        ArrayList<ValoresDomesticos> valoresDomesticos = new ArrayList<>();
        for (Receita receita : receitasFile()) {
            valoresDomesticos.add(receita);

        }

        for (Despesa despesa : despesasFile()) {
            valoresDomesticos.add(despesa);

        }
        return valoresDomesticos;
    }
}
