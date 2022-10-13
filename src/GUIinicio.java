/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author NITRO 5
 */
public class GUIinicio extends javax.swing.JFrame {
    Juego juego= new Juego();
    /**
     * Creates new form GUIinicio
     */
    public GUIinicio() throws IOException {
        initComponents();
        juego.generarLista();
        respuestauser.setVisible(false);
        botonenviar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prueba = new javax.swing.JPanel();
        primergradopanel = new javax.swing.JPanel();
        primergradotxt = new javax.swing.JLabel();
        segundogradopanel = new javax.swing.JPanel();
        segundogradotxt = new javax.swing.JLabel();
        tercergradopanel = new javax.swing.JPanel();
        tercergradotxt = new javax.swing.JLabel();
        cuartogradopanel = new javax.swing.JPanel();
        cuartogradotxt = new javax.swing.JLabel();
        quintogradopanel = new javax.swing.JPanel();
        quintogradotxt = new javax.swing.JLabel();
        cabeza = new javax.swing.JLabel();
        respuestauser = new javax.swing.JTextField();
        botonenviar = new javax.swing.JPanel();
        enviartxt = new javax.swing.JLabel();
        panelizq = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prueba.setBackground(new java.awt.Color(255, 255, 255));
        prueba.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        primergradopanel.setBackground(new java.awt.Color(0, 143, 56));
        primergradopanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        primergradopanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        primergradopanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                primergradopanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                primergradopanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                primergradopanelMouseExited(evt);
            }
        });

        primergradotxt.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        primergradotxt.setForeground(new java.awt.Color(255, 255, 255));
        primergradotxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        primergradotxt.setText("Primer grado");

        javax.swing.GroupLayout primergradopanelLayout = new javax.swing.GroupLayout(primergradopanel);
        primergradopanel.setLayout(primergradopanelLayout);
        primergradopanelLayout.setHorizontalGroup(
            primergradopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 159, Short.MAX_VALUE)
            .addGroup(primergradopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(primergradopanelLayout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(primergradotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(37, Short.MAX_VALUE)))
        );
        primergradopanelLayout.setVerticalGroup(
            primergradopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
            .addGroup(primergradopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(primergradopanelLayout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(primergradotxt)
                    .addContainerGap(19, Short.MAX_VALUE)))
        );

        prueba.add(primergradopanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 163, -1, -1));

        segundogradopanel.setBackground(new java.awt.Color(0, 133, 56));
        segundogradopanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        segundogradopanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        segundogradopanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                segundogradopanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                segundogradopanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                segundogradopanelMouseExited(evt);
            }
        });

        segundogradotxt.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        segundogradotxt.setForeground(new java.awt.Color(255, 255, 255));
        segundogradotxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        segundogradotxt.setText("Segundo grado");

        javax.swing.GroupLayout segundogradopanelLayout = new javax.swing.GroupLayout(segundogradopanel);
        segundogradopanel.setLayout(segundogradopanelLayout);
        segundogradopanelLayout.setHorizontalGroup(
            segundogradopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, segundogradopanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(segundogradotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        segundogradopanelLayout.setVerticalGroup(
            segundogradopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(segundogradopanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(segundogradotxt)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        prueba.add(segundogradopanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 229, 161, -1));

        tercergradopanel.setBackground(new java.awt.Color(0, 120, 56));
        tercergradopanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tercergradopanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tercergradopanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tercergradopanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tercergradopanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tercergradopanelMouseExited(evt);
            }
        });

        tercergradotxt.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        tercergradotxt.setForeground(new java.awt.Color(255, 255, 255));
        tercergradotxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tercergradotxt.setText("Tercer grado");

        javax.swing.GroupLayout tercergradopanelLayout = new javax.swing.GroupLayout(tercergradopanel);
        tercergradopanel.setLayout(tercergradopanelLayout);
        tercergradopanelLayout.setHorizontalGroup(
            tercergradopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tercergradopanelLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(tercergradotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        tercergradopanelLayout.setVerticalGroup(
            tercergradopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tercergradopanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(tercergradotxt)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        prueba.add(tercergradopanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 301, -1, -1));

        cuartogradopanel.setBackground(new java.awt.Color(0, 110, 56));
        cuartogradopanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cuartogradopanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cuartogradopanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cuartogradopanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cuartogradopanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cuartogradopanelMouseExited(evt);
            }
        });

        cuartogradotxt.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        cuartogradotxt.setForeground(new java.awt.Color(255, 255, 255));
        cuartogradotxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuartogradotxt.setText("Cuarto grado");

        javax.swing.GroupLayout cuartogradopanelLayout = new javax.swing.GroupLayout(cuartogradopanel);
        cuartogradopanel.setLayout(cuartogradopanelLayout);
        cuartogradopanelLayout.setHorizontalGroup(
            cuartogradopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cuartogradopanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cuartogradotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        cuartogradopanelLayout.setVerticalGroup(
            cuartogradopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cuartogradopanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(cuartogradotxt)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        prueba.add(cuartogradopanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 367, 161, -1));

        quintogradopanel.setBackground(new java.awt.Color(0, 90, 56));
        quintogradopanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        quintogradopanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quintogradopanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quintogradopanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                quintogradopanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                quintogradopanelMouseExited(evt);
            }
        });

        quintogradotxt.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        quintogradotxt.setForeground(new java.awt.Color(255, 255, 255));
        quintogradotxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quintogradotxt.setText("Quinto grado");

        javax.swing.GroupLayout quintogradopanelLayout = new javax.swing.GroupLayout(quintogradopanel);
        quintogradopanel.setLayout(quintogradopanelLayout);
        quintogradopanelLayout.setHorizontalGroup(
            quintogradopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quintogradopanelLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(quintogradotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        quintogradopanelLayout.setVerticalGroup(
            quintogradopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quintogradopanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(quintogradotxt)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        prueba.add(quintogradopanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 441, -1, -1));

        cabeza.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        cabeza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cabeza.setText("Dificultad");
        prueba.add(cabeza, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 370, 50));

        respuestauser.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        respuestauser.setForeground(new java.awt.Color(204, 204, 204));
        respuestauser.setText("Ingrese su respuesta");
        respuestauser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                respuestauserMouseClicked(evt);
            }
        });
        prueba.add(respuestauser, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 210, -1));

        botonenviar.setBackground(new java.awt.Color(0, 0, 0));
        botonenviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonenviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonenviarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonenviarMouseExited(evt);
            }
        });
        botonenviar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enviartxt.setBackground(new java.awt.Color(255, 255, 255));
        enviartxt.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        enviartxt.setForeground(new java.awt.Color(255, 255, 255));
        enviartxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enviartxt.setText("Enviar");
        botonenviar.add(enviartxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, -1));

        prueba.add(botonenviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 100, 40));

        panelizq.setBackground(new java.awt.Color(0, 146, 53));

        javax.swing.GroupLayout panelizqLayout = new javax.swing.GroupLayout(panelizq);
        panelizq.setLayout(panelizqLayout);
        panelizqLayout.setHorizontalGroup(
            panelizqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        panelizqLayout.setVerticalGroup(
            panelizqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        prueba.add(panelizq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 500));

        getContentPane().add(prueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void primergradopanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primergradopanelMouseEntered
        primergradopanel.setBackground(new Color(0,166,56));
    }//GEN-LAST:event_primergradopanelMouseEntered

    private void primergradopanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primergradopanelMouseExited
        primergradopanel.setBackground(new Color(0,143,56));
    }//GEN-LAST:event_primergradopanelMouseExited

    private void segundogradopanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_segundogradopanelMouseEntered
        segundogradopanel.setBackground(new Color(0,153,56));
    }//GEN-LAST:event_segundogradopanelMouseEntered

    private void segundogradopanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_segundogradopanelMouseExited
        segundogradopanel.setBackground(new Color(0,133,56));
    }//GEN-LAST:event_segundogradopanelMouseExited

    private void tercergradopanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tercergradopanelMouseEntered
        tercergradopanel.setBackground(new Color(0,140,56));
    }//GEN-LAST:event_tercergradopanelMouseEntered

    private void tercergradopanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tercergradopanelMouseExited
        tercergradopanel.setBackground(new Color(0,120,56));
    }//GEN-LAST:event_tercergradopanelMouseExited

    private void cuartogradopanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuartogradopanelMouseEntered
        cuartogradopanel.setBackground(new Color(0,130,56));
    }//GEN-LAST:event_cuartogradopanelMouseEntered

    private void cuartogradopanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuartogradopanelMouseExited
        cuartogradopanel.setBackground(new Color(0,110,56));
    }//GEN-LAST:event_cuartogradopanelMouseExited

    private void quintogradopanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quintogradopanelMouseEntered
        quintogradopanel.setBackground(new Color(0,110,56));
    }//GEN-LAST:event_quintogradopanelMouseEntered

    private void quintogradopanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quintogradopanelMouseExited
        quintogradopanel.setBackground(new Color(0,90,56));
    }//GEN-LAST:event_quintogradopanelMouseExited

    private void primergradopanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primergradopanelMouseClicked
        juego.setDificultad(1);
        cabeza.setText("Dificultad: "+String.valueOf(juego.getDificultad()));
        primergradopanel.setVisible(false);
        segundogradopanel.setVisible(false);
        tercergradopanel.setVisible(false);
        cuartogradopanel.setVisible(false);
        quintogradopanel.setVisible(false);
        respuestauser.setVisible(true);
        cabeza.setText(juego.seleccionarProblema());
        botonenviar.setVisible(true);
    }//GEN-LAST:event_primergradopanelMouseClicked

    private void segundogradopanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_segundogradopanelMouseClicked
        juego.setDificultad(2);
        cabeza.setText("Dificultad: "+String.valueOf(juego.getDificultad()));
        primergradopanel.setVisible(false);
        segundogradopanel.setVisible(false);
        tercergradopanel.setVisible(false);
        cuartogradopanel.setVisible(false);
        quintogradopanel.setVisible(false);
        respuestauser.setVisible(true);
        cabeza.setText(juego.seleccionarProblema());
        botonenviar.setVisible(true);
    }//GEN-LAST:event_segundogradopanelMouseClicked

    private void tercergradopanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tercergradopanelMouseClicked
        juego.setDificultad(3);
        cabeza.setText("Dificultad: "+String.valueOf(juego.getDificultad()));
        primergradopanel.setVisible(false);
        segundogradopanel.setVisible(false);
        tercergradopanel.setVisible(false);
        cuartogradopanel.setVisible(false);
        quintogradopanel.setVisible(false);
        respuestauser.setVisible(true);
        cabeza.setText(juego.seleccionarProblema());
        botonenviar.setVisible(true);
    }//GEN-LAST:event_tercergradopanelMouseClicked

    private void cuartogradopanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuartogradopanelMouseClicked
        juego.setDificultad(4);
        cabeza.setText("Dificultad: "+String.valueOf(juego.getDificultad()));
        primergradopanel.setVisible(false);
        segundogradopanel.setVisible(false);
        tercergradopanel.setVisible(false);
        cuartogradopanel.setVisible(false);
        quintogradopanel.setVisible(false);
        respuestauser.setVisible(true);
        cabeza.setText(juego.seleccionarProblema());
        botonenviar.setVisible(true);
    }//GEN-LAST:event_cuartogradopanelMouseClicked

    private void quintogradopanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quintogradopanelMouseClicked
        juego.setDificultad(5);
        cabeza.setText("Dificultad: "+String.valueOf(juego.getDificultad()));
        primergradopanel.setVisible(false);
        segundogradopanel.setVisible(false);
        tercergradopanel.setVisible(false);
        cuartogradopanel.setVisible(false);
        quintogradopanel.setVisible(false);
        respuestauser.setVisible(true);
        cabeza.setText(juego.seleccionarProblema());
        botonenviar.setVisible(true);
    }//GEN-LAST:event_quintogradopanelMouseClicked

    private void respuestauserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_respuestauserMouseClicked
        if(respuestauser.getText().equals("Ingrese su respuesta")){
            respuestauser.setText("");
            respuestauser.setForeground(Color.black);
       }
    }//GEN-LAST:event_respuestauserMouseClicked

    private void botonenviarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonenviarMouseEntered
        botonenviar.setBackground(new Color(100,100,100));
    }//GEN-LAST:event_botonenviarMouseEntered

    private void botonenviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonenviarMouseExited
        botonenviar.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_botonenviarMouseExited

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
            java.util.logging.Logger.getLogger(GUIinicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIinicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIinicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIinicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GUIinicio().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(GUIinicio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonenviar;
    private javax.swing.JLabel cabeza;
    private javax.swing.JPanel cuartogradopanel;
    private javax.swing.JPanel cuartogradopanel1;
    private javax.swing.JLabel cuartogradotxt;
    private javax.swing.JLabel cuartogradotxt1;
    private javax.swing.JLabel enviartxt;
    private javax.swing.JPanel panelizq;
    private javax.swing.JPanel primergradopanel;
    private javax.swing.JLabel primergradotxt;
    private javax.swing.JPanel prueba;
    private javax.swing.JPanel quintogradopanel;
    private javax.swing.JLabel quintogradotxt;
    private javax.swing.JTextField respuestauser;
    private javax.swing.JPanel segundogradopanel;
    private javax.swing.JPanel segundogradopanel1;
    private javax.swing.JPanel segundogradopanel2;
    private javax.swing.JPanel segundogradopanel3;
    private javax.swing.JPanel segundogradopanel4;
    private javax.swing.JLabel segundogradotxt;
    private javax.swing.JLabel segundogradotxt1;
    private javax.swing.JLabel segundogradotxt2;
    private javax.swing.JLabel segundogradotxt3;
    private javax.swing.JLabel segundogradotxt4;
    private javax.swing.JPanel tercergradopanel;
    private javax.swing.JPanel tercergradopanel1;
    private javax.swing.JPanel tercergradopanel2;
    private javax.swing.JLabel tercergradotxt;
    private javax.swing.JLabel tercergradotxt1;
    private javax.swing.JLabel tercergradotxt2;
    // End of variables declaration//GEN-END:variables
}
