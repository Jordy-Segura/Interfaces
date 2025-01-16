/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espoch.interfaces;

/**
 *
 * @author jordy
 */
public class Interfaz1 extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz1
     */
    public Interfaz1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnG = new javax.swing.ButtonGroup();
        lbTitulo = new javax.swing.JLabel();
        lbNumero1 = new javax.swing.JLabel();
        lbNumero2 = new javax.swing.JLabel();
        txt3 = new java.awt.TextField();
        cuadrotext1 = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        btnResultado = new javax.swing.JButton();
        cuadrotext2 = new java.awt.TextField();
        lbOperacion = new javax.swing.JLabel();
        CbxOperacion = new javax.swing.JComboBox<>();
        raButtonSuma = new javax.swing.JRadioButton();
        raButtonresta = new javax.swing.JRadioButton();
        raButtonresta1 = new javax.swing.JRadioButton();
        raButtonresta2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitulo.setText("Programar la suma de dos números");

        lbNumero1.setText("Ingrese el primer numero: ");

        lbNumero2.setText("Ingrese el segundo numero: ");

        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });

        cuadrotext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadrotext1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Resultado:");

        btnResultado.setText("Calcular");
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });

        cuadrotext2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadrotext2ActionPerformed(evt);
            }
        });

        lbOperacion.setText("Seleccione una operacion:");

        CbxOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sumar", "Restar", "Multiplicar", "Dividir" }));

        btnG.add(raButtonSuma);
        raButtonSuma.setText("Sumar");
        raButtonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raButtonSumaActionPerformed(evt);
            }
        });

        btnG.add(raButtonresta);
        raButtonresta.setText("Multiplicar");
        raButtonresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raButtonrestaActionPerformed(evt);
            }
        });

        btnG.add(raButtonresta1);
        raButtonresta1.setText("Restar");
        raButtonresta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raButtonresta1ActionPerformed(evt);
            }
        });

        btnG.add(raButtonresta2);
        raButtonresta2.setText("Dividir");
        raButtonresta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raButtonresta2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(btnResultado))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNumero2)
                                    .addComponent(lbNumero1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel1))
                                    .addComponent(lbOperacion))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cuadrotext2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cuadrotext1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CbxOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lbTitulo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(raButtonSuma)
                        .addGap(32, 32, 32)
                        .addComponent(raButtonresta1)
                        .addGap(35, 35, 35)
                        .addComponent(raButtonresta)
                        .addGap(44, 44, 44)
                        .addComponent(raButtonresta2)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(raButtonSuma)
                    .addComponent(raButtonresta)
                    .addComponent(raButtonresta1)
                    .addComponent(raButtonresta2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbOperacion)
                    .addComponent(CbxOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cuadrotext1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNumero1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNumero2)
                    .addComponent(cuadrotext2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnResultado)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3ActionPerformed

    private void cuadrotext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadrotext1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuadrotext1ActionPerformed

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        // TODO add your handling code here:
        int num1 = Integer.parseInt(cuadrotext1.getText());
        int num2 = Integer.parseInt(cuadrotext2.getText());
        boolean suma = raButtonSuma.isSelected();
        boolean resta = raButtonSuma.isSelected();
        boolean multiplicar = raButtonSuma.isSelected();
        boolean dividir = raButtonSuma.isSelected();
        
        if (suma) {
            Integer restSuma = num1 + num2;
            txt3.setText(restSuma.toString());
        } else if (resta){
            Integer restResta = num1 - num2;
            txt3.setText(restResta.toString());
        }
         else if (multiplicar){
            Integer restResta = num1 * num2;
            txt3.setText(restResta.toString());
        } else{
            if(num2!=0){
                    Integer division = num1 / num2;
                    txt3.setText(division.toString());                   
                    
                }else{
                    txt3.setText("No se puede para 0");
                }
         }
        /*String opcion = (String) CbxOperacion.getSelectedItem();

        switch (opcion) {
            case "Sumar":
                Integer suma = num1 + num2;
                txt3.setText(suma.toString());

                break;
            case "Restar":
                Integer resta = num1 - num2;
                txt3.setText(resta.toString());

                break;
            case "Multiplicar":
                Integer multi = num1 * num2;
                txt3.setText(multi.toString());


                break;
            case "Dividir":
                
                
               
                if(num2!=0){
                    Integer division = num1 / num2;
                    txt3.setText(division.toString());                   
                    break;
                }else{
                    txt3.setText("No se puede para 0");
                }
                break;                    
            default:
                txt3.setText("Error");

        }*/
    }//GEN-LAST:event_btnResultadoActionPerformed

    private void cuadrotext2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadrotext2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuadrotext2ActionPerformed

    private void raButtonrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raButtonrestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raButtonrestaActionPerformed

    private void raButtonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raButtonSumaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raButtonSumaActionPerformed

    private void raButtonresta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raButtonresta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raButtonresta1ActionPerformed

    private void raButtonresta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raButtonresta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raButtonresta2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbxOperacion;
    private javax.swing.ButtonGroup btnG;
    private javax.swing.JButton btnResultado;
    private java.awt.TextField cuadrotext1;
    private java.awt.TextField cuadrotext2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbNumero1;
    private javax.swing.JLabel lbNumero2;
    private javax.swing.JLabel lbOperacion;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JRadioButton raButtonSuma;
    private javax.swing.JRadioButton raButtonresta;
    private javax.swing.JRadioButton raButtonresta1;
    private javax.swing.JRadioButton raButtonresta2;
    private java.awt.TextField txt3;
    // End of variables declaration//GEN-END:variables
}
