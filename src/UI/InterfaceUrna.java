package UI;

import dev.*;
import javax.swing.*;

public class InterfaceUrna extends javax.swing.JPanel {

    int contadorCampos = 0;
    int totalVotos = 0;
    int votosBranco = 0;
    int votosNulo = 0;
    
    
    JLabel[] campos = new JLabel[5];
    StringBuilder voto = new StringBuilder();     
    
    Metodos metodos = new Metodos();
    Partido[] partidos = new Metodos().criaPartidos();

    public InterfaceUrna() {
        initComponents();
        campos[0] = lblCampo0;
        campos[1] = lblCampo1;
        campos[2] = lblCampo2;
        campos[3] = lblCampo3;
        campos[4] = lblCampo4;
        zeraCampos();
       
        imgUrna.setIcon(new javax.swing.ImageIcon(getClass().getResource("fotoUrna.png")));
    }

    public void clicaBotao(int contador, String nBotao) {
        campos[contador].setText(nBotao);
        contadorCampos++;
    }

    public void zeraCampos() {
        for (int i = 0; i <= 4; i++) {
            campos[i].setText("");
            contadorCampos = 0;
            voto = new StringBuilder();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCampos = new javax.swing.JPanel();
        lblCampo0 = new javax.swing.JLabel();
        lblCampo1 = new javax.swing.JLabel();
        lblCampo2 = new javax.swing.JLabel();
        lblCampo3 = new javax.swing.JLabel();
        lblCampo4 = new javax.swing.JLabel();
        pnlLegenda = new javax.swing.JPanel();
        pnlBotoes = new javax.swing.JPanel();
        btnCorrige = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnConfirma = new javax.swing.JButton();
        btnBranco = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        pnlImg = new javax.swing.JPanel();
        imgUrna = new javax.swing.JLabel();

        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setMaximumSize(new java.awt.Dimension(936, 413));
        setMinimumSize(new java.awt.Dimension(934, 413));
        setPreferredSize(new java.awt.Dimension(936, 413));

        pnlCampos.setOpaque(false);

        lblCampo0.setText("campo1");

        lblCampo1.setText("campo2");

        lblCampo2.setText("campo3");

        lblCampo3.setText("campo4");

        lblCampo4.setText("campo5");

        javax.swing.GroupLayout pnlLegendaLayout = new javax.swing.GroupLayout(pnlLegenda);
        pnlLegenda.setLayout(pnlLegendaLayout);
        pnlLegendaLayout.setHorizontalGroup(
            pnlLegendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlLegendaLayout.setVerticalGroup(
            pnlLegendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlCamposLayout = new javax.swing.GroupLayout(pnlCampos);
        pnlCampos.setLayout(pnlCamposLayout);
        pnlCamposLayout.setHorizontalGroup(
            pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCamposLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblCampo0)
                .addGap(18, 18, 18)
                .addComponent(lblCampo1)
                .addGap(68, 68, 68)
                .addComponent(lblCampo2)
                .addGap(18, 18, 18)
                .addComponent(lblCampo3)
                .addGap(18, 18, 18)
                .addComponent(lblCampo4))
        );
        pnlCamposLayout.setVerticalGroup(
            pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCamposLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCampo0)
                    .addComponent(lblCampo1)
                    .addComponent(lblCampo2)
                    .addComponent(lblCampo3)
                    .addComponent(lblCampo4)))
        );

        pnlBotoes.setOpaque(false);
        pnlBotoes.setLayout(null);

        btnCorrige.setText("corrige");
        btnCorrige.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorrigeActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnCorrige);
        btnCorrige.setBounds(85, 190, 65, 23);

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        pnlBotoes.add(btn6);
        btn6.setBounds(156, 45, 39, 23);

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        pnlBotoes.add(btn7);
        btn7.setBounds(66, 79, 39, 23);

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        pnlBotoes.add(btn4);
        btn4.setBounds(66, 45, 39, 23);

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        pnlBotoes.add(btn9);
        btn9.setBounds(156, 79, 39, 23);

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        pnlBotoes.add(btn3);
        btn3.setBounds(156, 11, 39, 23);

        btnConfirma.setText("confirma");
        btnConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmaActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnConfirma);
        btnConfirma.setBounds(156, 190, 73, 23);

        btnBranco.setText("branco");
        btnBranco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrancoActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnBranco);
        btnBranco.setBounds(10, 190, 65, 23);

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        pnlBotoes.add(btn5);
        btn5.setBounds(111, 45, 39, 23);

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        pnlBotoes.add(btn1);
        btn1.setBounds(66, 11, 39, 23);

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        pnlBotoes.add(btn2);
        btn2.setBounds(111, 11, 39, 23);

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        pnlBotoes.add(btn8);
        btn8.setBounds(111, 79, 39, 23);

        imgUrna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/fotoUrna.png"))); // NOI18N
        imgUrna.setAlignmentY(0.0F);
        imgUrna.setOpaque(true);

        javax.swing.GroupLayout pnlImgLayout = new javax.swing.GroupLayout(pnlImg);
        pnlImg.setLayout(pnlImgLayout);
        pnlImgLayout.setHorizontalGroup(
            pnlImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImgLayout.createSequentialGroup()
                .addComponent(imgUrna)
                .addGap(0, 163, Short.MAX_VALUE))
        );
        pnlImgLayout.setVerticalGroup(
            pnlImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImgLayout.createSequentialGroup()
                .addComponent(imgUrna)
                .addGap(0, 25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(pnlCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(337, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(549, 549, 549)
                    .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(386, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(pnlCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(218, 218, 218)
                    .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(219, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        clicaBotao(contadorCampos, "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        clicaBotao(contadorCampos, "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        clicaBotao(contadorCampos, "1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        clicaBotao(contadorCampos, "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btnBrancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrancoActionPerformed
        int input = JOptionPane.showConfirmDialog(null, "Deseja mesmo votar em branco?");
        if (input == 0) {
            votosBranco++;
            totalVotos++;
        }        
    }//GEN-LAST:event_btnBrancoActionPerformed

    private void btnConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmaActionPerformed
        for (int i = 0; i <= 4; i++) {
            voto.append(campos[i].getText());
        }

        if (metodos.votar(voto, partidos) == true) {
            JOptionPane.showMessageDialog(null, "Voto confirmado!");
            zeraCampos();
            totalVotos++;
        } else {
            int input = JOptionPane.showConfirmDialog(null, "Voto Inválido! Deseja votar NULO?");
            if (input == 0){
                votosNulo++;
                totalVotos++;
            }
            else if ((input == 1) || (input == 2)){
                zeraCampos();
            }
            zeraCampos();
        }
    }//GEN-LAST:event_btnConfirmaActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        clicaBotao(contadorCampos, "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        clicaBotao(contadorCampos, "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        clicaBotao(contadorCampos, "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        clicaBotao(contadorCampos, "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        clicaBotao(contadorCampos, "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btnCorrigeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorrigeActionPerformed
        zeraCampos();
    }//GEN-LAST:event_btnCorrigeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBranco;
    private javax.swing.JButton btnConfirma;
    private javax.swing.JButton btnCorrige;
    private javax.swing.JLabel imgUrna;
    private javax.swing.JLabel lblCampo0;
    private javax.swing.JLabel lblCampo1;
    private javax.swing.JLabel lblCampo2;
    private javax.swing.JLabel lblCampo3;
    private javax.swing.JLabel lblCampo4;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlCampos;
    private javax.swing.JPanel pnlImg;
    private javax.swing.JPanel pnlLegenda;
    // End of variables declaration//GEN-END:variables

}
