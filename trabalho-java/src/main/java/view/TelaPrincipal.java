/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ControleDeValores;
import model.Despesa;
import model.Receita;
import model.TipoDeValores;
import model.ValoresDomesticos;

/**
 *
 * @author Gabriel Krzizanowski
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     *
     * Creates new form TelaPrincipal
     */
    ControleDeValores valores = new ControleDeValores();

    public TelaPrincipal() {
        initComponents();

        cbTipoDeGasto.removeAllItems();
        cbTipoDeGasto.addItem("Despesa");
        cbTipoDeGasto.addItem("Receita");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        cbTipoDeGasto = new javax.swing.JComboBox<>();
        tfNomeDaEntrada = new javax.swing.JTextField();
        lbTipoDeGasto = new javax.swing.JLabel();
        lbCaracteristicas = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfData = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btMostrarDespesas = new javax.swing.JButton();
        btMostrarReceitas = new javax.swing.JButton();
        btMostrarExtrato = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbTipoDeGasto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbTipoDeGasto.setToolTipText("");
        cbTipoDeGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoDeGastoActionPerformed(evt);
            }
        });

        lbTipoDeGasto.setText("Escolha o tipo de gasto:");

        lbCaracteristicas.setText("Informe o nome da despesa/receita:");

        jLabel2.setText("Informe o valor da receita/despesa:");

        jLabel3.setText("Informar a data:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNomeDaEntrada)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbTipoDeGasto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbTipoDeGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbCaracteristicas)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfData))))
                        .addGap(0, 28, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipoDeGasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTipoDeGasto))
                .addGap(29, 29, 29)
                .addComponent(lbCaracteristicas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNomeDaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btSalvar.setText("Salvar Dados");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btMostrarDespesas.setText("Mostrar Despesas");
        btMostrarDespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMostrarDespesasActionPerformed(evt);
            }
        });

        btMostrarReceitas.setText("Mostrar Receitas");
        btMostrarReceitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMostrarReceitasActionPerformed(evt);
            }
        });

        btMostrarExtrato.setText("Mostrar Extrato");
        btMostrarExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMostrarExtratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btMostrarExtrato)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btMostrarDespesas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btMostrarReceitas)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btMostrarDespesas)
                    .addComponent(btMostrarReceitas))
                .addGap(36, 36, 36)
                .addComponent(btMostrarExtrato)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbTipoDeGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoDeGastoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoDeGastoActionPerformed

    private void btMostrarDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMostrarDespesasActionPerformed
        // TODO add your handling code here:

        MostrarDespesas mostrarDespesas = new MostrarDespesas(this, true);

        mostrarDespesas.setVisible(true);

    }//GEN-LAST:event_btMostrarDespesasActionPerformed

    private void btMostrarReceitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMostrarReceitasActionPerformed
        // TODO add your handling code here:

        MostrarReceitas mostrarReceitas = new MostrarReceitas(this, true);


        mostrarReceitas.setVisible(true);
    }//GEN-LAST:event_btMostrarReceitasActionPerformed

    private void btMostrarExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMostrarExtratoActionPerformed
        // TODO add your handling code here:

        Extrato extrato = new Extrato(this, true);

       
        extrato.setVisible(true);
        
    }//GEN-LAST:event_btMostrarExtratoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        // TODO add your handling code here:

        Despesa despesa = new Despesa();
        Receita receita = new Receita();

        tfNomeDaEntrada.setText(tfNomeDaEntrada.getText().replaceAll(";", ""));  
        
        if (tfNomeDaEntrada.getText().isEmpty() || tfValor.getText().isEmpty() || tfData.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Nenhum campo pode ser vazio para efetuar a gravação!");
        } else {

            if (cbTipoDeGasto.getSelectedIndex() == 0) {

                despesa.setTdv(TipoDeValores.DESPESA);
                
                despesa.setDescricao(tfNomeDaEntrada.getText());

                despesa.setValor(Double.parseDouble(tfValor.getText()));

                int year = Integer.parseInt(tfData.getText().substring(6, 10));
                int month = Integer.parseInt(tfData.getText().substring(3, 5));
                int day = Integer.parseInt(tfData.getText().substring(0, 2));
                LocalDate data = LocalDate.of(year, month, day);

                despesa.setDia(data);

                valores.adicionarValores(despesa);

            } else if (cbTipoDeGasto.getSelectedIndex() == 1) {

                receita.setTdv(TipoDeValores.RECEITA);

                receita.setDescricao(tfNomeDaEntrada.getText());

                receita.setValor(Double.parseDouble(tfValor.getText()));

                int year = Integer.parseInt(tfData.getText().substring(6, 10));
                int month = Integer.parseInt(tfData.getText().substring(3, 5));
                int day = Integer.parseInt(tfData.getText().substring(0, 2));
                LocalDate data = LocalDate.of(year, month, day);

                receita.setDia(data);

                valores.adicionarValores(receita);
            }
        }

    }//GEN-LAST:event_btSalvarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btMostrarDespesas;
    private javax.swing.JButton btMostrarExtrato;
    private javax.swing.JButton btMostrarReceitas;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<String> cbTipoDeGasto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbCaracteristicas;
    private javax.swing.JLabel lbTipoDeGasto;
    private javax.swing.JTextField tfData;
    private javax.swing.JTextField tfNomeDaEntrada;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
