/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Gabriel Krzizanowski
 */
public class ControleDeValores {

    private PrintWriter escrever;
    private File file;
    private FileOutputStream fileOutputStream;
    private Path path = Paths.get("C:\\ValoresDomesticos.csv");

    public ControleDeValores() {
        criarArquivo();
    }

    public void adicionarValores(ValoresDomesticos valor) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        if (valor instanceof Receita) {
            Receita receita = (Receita) valor;
            String hojeFormatado = receita.getDia().format(formatter);
            escreverArquivo(receita.getTdv() + ";" + receita.getDescricao() + ";" + receita.getValor() + ";" + hojeFormatado);

        } else {
            Despesa despesa = (Despesa) valor;
            String hojeFormatado = despesa.getDia().format(formatter);
            escreverArquivo(despesa.getTdv() + ";" + despesa.getDescricao() + ";" + despesa.getValor() + ";" + hojeFormatado);

        }

    }

    private void criarArquivo() {
        if (!Files.exists(path)) {
            this.file = new File("C:\\ValoresDomesticos.csv");
        }
        try {
            this.fileOutputStream = new FileOutputStream(path.toFile(), true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ControleDeValores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void escreverArquivo(String valor) {
        try {
            this.fileOutputStream.write(valor.concat("\n").getBytes());
        } catch (IOException ex) {
            Logger.getLogger(ControleDeValores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
