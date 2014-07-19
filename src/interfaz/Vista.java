/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import bean.ContratoBean;
import com.sun.jmx.snmp.BerDecoder;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author toshiba
 */
public class Vista extends javax.swing.JFrame {
    ContratoBean contratoBean;
    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
        this.setTitle("Generador de contratos de arrendamiento");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtFechaInicio = new javax.swing.JTextField();
        txtLetraLocal = new javax.swing.JTextField();
        txtArrendador = new javax.swing.JTextField();
        txtArrendatario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDireccion = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtDuracionMeses = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFechaFin = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPrecioLetra = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtDiaPago = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtFiadorSolitario = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(480, 650, 80, 40);

        txtFechaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaInicioActionPerformed(evt);
            }
        });
        jPanel1.add(txtFechaInicio);
        txtFechaInicio.setBounds(130, 460, 270, 30);

        txtLetraLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLetraLocalActionPerformed(evt);
            }
        });
        jPanel1.add(txtLetraLocal);
        txtLetraLocal.setBounds(130, 390, 60, 30);

        txtArrendador.setText("Marcelino García Encarnación");
        txtArrendador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArrendadorActionPerformed(evt);
            }
        });
        jPanel1.add(txtArrendador);
        txtArrendador.setBounds(130, 190, 250, 30);

        txtArrendatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArrendatarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtArrendatario);
        txtArrendatario.setBounds(130, 110, 250, 30);

        jLabel1.setText("Arrendatario");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 120, 80, 14);

        jLabel2.setText("Arrendador");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 200, 90, 14);

        jLabel3.setText("Direccion");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 250, 60, 14);

        jLabel4.setText("Fecha inicio");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 470, 70, 14);

        jLabel5.setText("Duracion en meses");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(230, 400, 110, 14);

        txaDireccion.setColumns(20);
        txaDireccion.setRows(5);
        txaDireccion.setText("ENTRE LA AVENIDA CRISANTEMOS ESQUINA CON LA CALLE \nHUILCAMINA DE LA COLONIA UNIDAD MORELOS PRIMERA \nSECCION, PERTENECIENTE AL MUNICIPIO DE XOCHITEPEC, \nMORELOS");
        jScrollPane1.setViewportView(txaDireccion);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(130, 240, 420, 100);

        jLabel6.setText("Cláusulas");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 350, 60, 14);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(30, 90, 530, 10);

        jLabel7.setText("Declaraciones");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 70, 90, 14);

        txtDuracionMeses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuracionMesesActionPerformed(evt);
            }
        });
        jPanel1.add(txtDuracionMeses);
        txtDuracionMeses.setBounds(340, 390, 60, 30);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(30, 370, 530, 10);

        jLabel8.setText("Letra del Local");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 400, 90, 14);

        jLabel9.setText("Fecha fin");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 510, 70, 14);

        txtFechaFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaFinActionPerformed(evt);
            }
        });
        jPanel1.add(txtFechaFin);
        txtFechaFin.setBounds(130, 500, 270, 30);

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrecio);
        txtPrecio.setBounds(130, 540, 50, 30);

        jLabel10.setText("Precio");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 550, 70, 14);

        txtPrecioLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioLetraActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrecioLetra);
        txtPrecioLetra.setBounds(310, 540, 80, 30);

        jLabel11.setText("Precio en letra");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(230, 550, 90, 14);

        jLabel12.setText("Dia de pago");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(40, 590, 70, 14);

        txtDiaPago.setText("10");
        txtDiaPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaPagoActionPerformed(evt);
            }
        });
        jPanel1.add(txtDiaPago);
        txtDiaPago.setBounds(130, 580, 30, 30);

        jLabel13.setText("de cada mes");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(160, 590, 90, 14);

        txtFiadorSolitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiadorSolitarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtFiadorSolitario);
        txtFiadorSolitario.setBounds(130, 150, 250, 30);

        jLabel15.setText("Fiador Solitario");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(40, 160, 100, 14);

        jLabel14.setFont(new java.awt.Font("Latha", 1, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Generador de Contrato de arrendamiento");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(0, 30, 570, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String arrendatario = txtArrendatario.getText();
        String fiadorSolitario = txtFiadorSolitario.getText();
        String arrendador = txtArrendador.getText();
        String direccion = txaDireccion.getText();

        String letraLocal = txtLetraLocal.getText();
        String fechaInicio = txtFechaInicio.getText();
        String fechaFin = txtFechaFin.getText();
        String precioLetra = txtPrecioLetra.getText();
        String diaPago = txtDiaPago.getText();

        if (arrendatario.equals("")) {
            JOptionPane.showMessageDialog(this, "Falta llenar el campo de arrendatario");
        } else if (fiadorSolitario.equals("")) {
            JOptionPane.showMessageDialog(this, "Falta llenar el campo de fiador Solitario");
        } else if (arrendador.equals("")) {
            JOptionPane.showMessageDialog(this, "Falta llenar el campo de arrendador");
        } else if (direccion.equals("")) {
            JOptionPane.showMessageDialog(this, "Falta llenar el campo de direccion");
        } else if (letraLocal.equals("")) {
            JOptionPane.showMessageDialog(this, "Falta llenar el campo de letra del local");
        } else if (fechaInicio.equals("")) {
            JOptionPane.showMessageDialog(this, "Falta llenar el campo de fecha de inicio");
        } else if (fechaFin.equals("")) {
            JOptionPane.showMessageDialog(this, "Falta llenar el campo de fecha de fin");
        } else if (precioLetra.equals("")) {
            JOptionPane.showMessageDialog(this, "Falta llenar el campo de precio en letra");
        } else if (diaPago.equals("")) {
            JOptionPane.showMessageDialog(this, "Falta llenar el campo de diaPago");
        } else if (txtDuracionMeses.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Falta llenar el campo de duracion en meses");
        } else if (txtPrecio.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Falta llenar el campo de precio");
        } else {
            int cont=0;
            try {
                int precio = Integer.parseInt(txtPrecio.getText());
                cont=1;
                int duracionMeses = Integer.parseInt(txtDuracionMeses.getText());
                
                contratoBean=new ContratoBean();
                contratoBean.setArrendatario(arrendatario);
                contratoBean.setFiadorSolitario(fiadorSolitario);
                contratoBean.setArrendador(arrendador);
                contratoBean.setDireccion(direccion);
                contratoBean.setLetraLocal(letraLocal);
                contratoBean.setDuracionMeses(duracionMeses);
                contratoBean.setFechaInicio(fechaInicio);
                contratoBean.setFechaFin(fechaFin);
                contratoBean.setPrecio(precio);
                contratoBean.setPrecioLetra(precioLetra);
                contratoBean.setDiaPago(diaPago);
                
                RecibeNombreDoc recibeNombreDoc=new RecibeNombreDoc(this, true);
                recibeNombreDoc.setContratoBean(contratoBean);
                this.setVisible(false);
                recibeNombreDoc.setVisible(true);
//                JOptionPane.showMessageDialog(this, "comienza bloqe!!!!!!!!!11");
//                JOptionPane.showConfirmDialog(this, cont, diaPago, cont);
                
            } catch (NumberFormatException nfe) {
                if (cont==0) {
                    JOptionPane.showMessageDialog(this, "El campo Precio debe ser un numero entero");
                }else{
                    JOptionPane.showMessageDialog(this, "EL campo de duracion en meses debe ser un numero entero");
                }
            }

            
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtFechaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaInicioActionPerformed

    }//GEN-LAST:event_txtFechaInicioActionPerformed

    private void txtLetraLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLetraLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLetraLocalActionPerformed

    private void txtArrendadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArrendadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArrendadorActionPerformed

    private void txtArrendatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArrendatarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArrendatarioActionPerformed

    private void txtDuracionMesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuracionMesesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDuracionMesesActionPerformed

    private void txtFechaFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaFinActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtPrecioLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioLetraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioLetraActionPerformed

    private void txtDiaPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaPagoActionPerformed

    private void txtFiadorSolitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiadorSolitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiadorSolitarioActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea txaDireccion;
    private javax.swing.JTextField txtArrendador;
    private javax.swing.JTextField txtArrendatario;
    private javax.swing.JTextField txtDiaPago;
    private javax.swing.JTextField txtDuracionMeses;
    private javax.swing.JTextField txtFechaFin;
    private javax.swing.JTextField txtFechaInicio;
    private javax.swing.JTextField txtFiadorSolitario;
    private javax.swing.JTextField txtLetraLocal;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecioLetra;
    // End of variables declaration//GEN-END:variables
}