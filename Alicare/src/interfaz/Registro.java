package interfaz;


public class Registro extends javax.swing.JFrame {

    public Registro() {
        initComponents();
        setLocationRelativeTo(null);
        panelRegistroProfesional.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonVolver = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        botonRegistro = new javax.swing.JButton();
        panelRegistroUsuario = new javax.swing.JPanel();
        botonFoto = new javax.swing.JButton();
        fotosDePerfil = new javax.swing.JLabel();
        radioGrasas = new javax.swing.JRadioButton();
        radioDulces = new javax.swing.JRadioButton();
        radioFrutas = new javax.swing.JRadioButton();
        radioLacteos = new javax.swing.JRadioButton();
        radioLegumbres = new javax.swing.JRadioButton();
        radioPescado = new javax.swing.JRadioButton();
        radioVerduras = new javax.swing.JRadioButton();
        radioCereales = new javax.swing.JRadioButton();
        radioCarne = new javax.swing.JRadioButton();
        radioAzucares = new javax.swing.JRadioButton();
        radioCarniboro = new javax.swing.JRadioButton();
        radioVegetariano = new javax.swing.JRadioButton();
        radioVegano = new javax.swing.JRadioButton();
        radioMacrobiotico = new javax.swing.JRadioButton();
        radioOrganico = new javax.swing.JRadioButton();
        textoNacionalidad = new javax.swing.JTextField();
        textoFecha = new javax.swing.JTextField();
        textoApellido = new javax.swing.JTextField();
        textName = new javax.swing.JTextField();
        fondoUsuario = new javax.swing.JLabel();
        panelRegistroProfesional = new javax.swing.JPanel();
        botonFotoP = new javax.swing.JButton();
        fotoDePerfilP = new javax.swing.JLabel();
        textoFechaGraduacionP1 = new javax.swing.JTextField();
        textoFechaGraduacionP = new javax.swing.JTextField();
        textNameTituloP = new javax.swing.JTextField();
        textoFechaNacimientoP = new javax.swing.JTextField();
        textApellidoP = new javax.swing.JTextField();
        textNameP = new javax.swing.JTextField();
        fondoProfesional = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 950));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver_normal.png"))); // NOI18N
        botonVolver.setContentAreaFilled(false);
        botonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVolver.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver_presionado.png"))); // NOI18N
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });
        getContentPane().add(botonVolver);
        botonVolver.setBounds(7, 910, 75, 35);

        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir_normal.png"))); // NOI18N
        botonSalir.setContentAreaFilled(false);
        botonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir_presionado.png"))); // NOI18N
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(botonSalir);
        botonSalir.setBounds(418, 910, 75, 35);

        botonRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrar_normal.png"))); // NOI18N
        botonRegistro.setContentAreaFilled(false);
        botonRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegistro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrar_presionado.png"))); // NOI18N
        botonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistro);
        botonRegistro.setBounds(207, 877, 91, 28);

        panelRegistroUsuario.setLayout(null);

        botonFoto.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        botonFoto.setForeground(new java.awt.Color(255, 255, 255));
        botonFoto.setText("Seleccionar foto");
        botonFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        botonFoto.setContentAreaFilled(false);
        botonFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFotoActionPerformed(evt);
            }
        });
        panelRegistroUsuario.add(botonFoto);
        botonFoto.setBounds(140, 800, 150, 19);
        panelRegistroUsuario.add(fotosDePerfil);
        fotosDePerfil.setBounds(33, 719, 100, 100);

        radioGrasas.setBackground(new java.awt.Color(39, 156, 19));
        radioGrasas.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        radioGrasas.setForeground(new java.awt.Color(255, 255, 255));
        radioGrasas.setText("Grasas y aceites");
        panelRegistroUsuario.add(radioGrasas);
        radioGrasas.setBounds(30, 650, 130, 25);

        radioDulces.setBackground(new java.awt.Color(39, 156, 19));
        radioDulces.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        radioDulces.setForeground(new java.awt.Color(255, 255, 255));
        radioDulces.setText("Dulces");
        panelRegistroUsuario.add(radioDulces);
        radioDulces.setBounds(30, 570, 69, 25);

        radioFrutas.setBackground(new java.awt.Color(39, 156, 19));
        radioFrutas.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        radioFrutas.setForeground(new java.awt.Color(255, 255, 255));
        radioFrutas.setText("Frutas");
        panelRegistroUsuario.add(radioFrutas);
        radioFrutas.setBounds(190, 570, 65, 25);

        radioLacteos.setBackground(new java.awt.Color(39, 156, 19));
        radioLacteos.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        radioLacteos.setForeground(new java.awt.Color(255, 255, 255));
        radioLacteos.setText("Lacteos");
        panelRegistroUsuario.add(radioLacteos);
        radioLacteos.setBounds(350, 570, 75, 25);

        radioLegumbres.setBackground(new java.awt.Color(39, 156, 19));
        radioLegumbres.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        radioLegumbres.setForeground(new java.awt.Color(255, 255, 255));
        radioLegumbres.setText("Legumbres");
        panelRegistroUsuario.add(radioLegumbres);
        radioLegumbres.setBounds(30, 610, 93, 25);

        radioPescado.setBackground(new java.awt.Color(39, 156, 19));
        radioPescado.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        radioPescado.setForeground(new java.awt.Color(255, 255, 255));
        radioPescado.setText("Pescado");
        panelRegistroUsuario.add(radioPescado);
        radioPescado.setBounds(190, 610, 79, 25);

        radioVerduras.setBackground(new java.awt.Color(39, 156, 19));
        radioVerduras.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        radioVerduras.setForeground(new java.awt.Color(255, 255, 255));
        radioVerduras.setText("Verduras");
        panelRegistroUsuario.add(radioVerduras);
        radioVerduras.setBounds(350, 610, 83, 25);

        radioCereales.setBackground(new java.awt.Color(39, 156, 19));
        radioCereales.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        radioCereales.setForeground(new java.awt.Color(255, 255, 255));
        radioCereales.setText("Cereales");
        panelRegistroUsuario.add(radioCereales);
        radioCereales.setBounds(350, 530, 81, 25);

        radioCarne.setBackground(new java.awt.Color(39, 156, 19));
        radioCarne.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        radioCarne.setForeground(new java.awt.Color(255, 255, 255));
        radioCarne.setText("Carnes");
        radioCarne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCarneActionPerformed(evt);
            }
        });
        panelRegistroUsuario.add(radioCarne);
        radioCarne.setBounds(190, 530, 71, 25);

        radioAzucares.setBackground(new java.awt.Color(39, 156, 19));
        radioAzucares.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        radioAzucares.setForeground(new java.awt.Color(255, 255, 255));
        radioAzucares.setText("Azucares");
        panelRegistroUsuario.add(radioAzucares);
        radioAzucares.setBounds(30, 530, 83, 25);

        radioCarniboro.setBackground(new java.awt.Color(39, 156, 19));
        radioCarniboro.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        radioCarniboro.setForeground(new java.awt.Color(255, 255, 255));
        radioCarniboro.setText("Carníboro");
        radioCarniboro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRegistroUsuario.add(radioCarniboro);
        radioCarniboro.setBounds(30, 370, 85, 25);

        radioVegetariano.setBackground(new java.awt.Color(39, 156, 19));
        radioVegetariano.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        radioVegetariano.setForeground(new java.awt.Color(255, 255, 255));
        radioVegetariano.setText("Vegetariano");
        radioVegetariano.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRegistroUsuario.add(radioVegetariano);
        radioVegetariano.setBounds(200, 400, 99, 25);

        radioVegano.setBackground(new java.awt.Color(39, 156, 19));
        radioVegano.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        radioVegano.setForeground(new java.awt.Color(255, 255, 255));
        radioVegano.setText("Vegano");
        radioVegano.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRegistroUsuario.add(radioVegano);
        radioVegano.setBounds(370, 370, 73, 25);

        radioMacrobiotico.setBackground(new java.awt.Color(39, 156, 19));
        radioMacrobiotico.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        radioMacrobiotico.setForeground(new java.awt.Color(255, 255, 255));
        radioMacrobiotico.setText("Macrobiótico");
        radioMacrobiotico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRegistroUsuario.add(radioMacrobiotico);
        radioMacrobiotico.setBounds(30, 430, 103, 25);

        radioOrganico.setBackground(new java.awt.Color(39, 156, 19));
        radioOrganico.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        radioOrganico.setForeground(new java.awt.Color(255, 255, 255));
        radioOrganico.setText("Orgánico");
        radioOrganico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRegistroUsuario.add(radioOrganico);
        radioOrganico.setBounds(370, 430, 81, 25);

        textoNacionalidad.setBackground(new java.awt.Color(39, 156, 19));
        textoNacionalidad.setForeground(new java.awt.Color(255, 255, 255));
        textoNacionalidad.setBorder(null);
        textoNacionalidad.setOpaque(false);
        textoNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNacionalidadActionPerformed(evt);
            }
        });
        panelRegistroUsuario.add(textoNacionalidad);
        textoNacionalidad.setBounds(127, 278, 154, 20);

        textoFecha.setBackground(new java.awt.Color(39, 156, 19));
        textoFecha.setForeground(new java.awt.Color(255, 255, 255));
        textoFecha.setBorder(null);
        textoFecha.setOpaque(false);
        textoFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoFechaActionPerformed(evt);
            }
        });
        panelRegistroUsuario.add(textoFecha);
        textoFecha.setBounds(178, 228, 154, 20);

        textoApellido.setBackground(new java.awt.Color(39, 156, 19));
        textoApellido.setForeground(new java.awt.Color(255, 255, 255));
        textoApellido.setBorder(null);
        textoApellido.setOpaque(false);
        textoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoApellidoActionPerformed(evt);
            }
        });
        panelRegistroUsuario.add(textoApellido);
        textoApellido.setBounds(104, 174, 266, 20);

        textName.setBackground(new java.awt.Color(39, 156, 19));
        textName.setForeground(new java.awt.Color(255, 255, 255));
        textName.setBorder(null);
        textName.setOpaque(false);
        panelRegistroUsuario.add(textName);
        textName.setBounds(98, 118, 266, 20);

        fondoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registroUsuario.png"))); // NOI18N
        panelRegistroUsuario.add(fondoUsuario);
        fondoUsuario.setBounds(0, 0, 1000, 950);

        getContentPane().add(panelRegistroUsuario);
        panelRegistroUsuario.setBounds(0, 0, 1000, 950);

        panelRegistroProfesional.setLayout(null);

        botonFotoP.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        botonFotoP.setForeground(new java.awt.Color(255, 255, 255));
        botonFotoP.setText("Seleccionar foto");
        botonFotoP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        botonFotoP.setContentAreaFilled(false);
        botonFotoP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRegistroProfesional.add(botonFotoP);
        botonFotoP.setBounds(140, 697, 150, 19);
        panelRegistroProfesional.add(fotoDePerfilP);
        fotoDePerfilP.setBounds(33, 614, 100, 100);

        textoFechaGraduacionP1.setBackground(new java.awt.Color(39, 156, 19));
        textoFechaGraduacionP1.setForeground(new java.awt.Color(255, 255, 255));
        textoFechaGraduacionP1.setBorder(null);
        textoFechaGraduacionP1.setOpaque(false);
        textoFechaGraduacionP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoFechaGraduacionP1ActionPerformed(evt);
            }
        });
        panelRegistroProfesional.add(textoFechaGraduacionP1);
        textoFechaGraduacionP1.setBounds(215, 427, 177, 20);

        textoFechaGraduacionP.setBackground(new java.awt.Color(39, 156, 19));
        textoFechaGraduacionP.setForeground(new java.awt.Color(255, 255, 255));
        textoFechaGraduacionP.setBorder(null);
        textoFechaGraduacionP.setOpaque(false);
        textoFechaGraduacionP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoFechaGraduacionPActionPerformed(evt);
            }
        });
        panelRegistroProfesional.add(textoFechaGraduacionP);
        textoFechaGraduacionP.setBounds(177, 374, 154, 20);

        textNameTituloP.setBackground(new java.awt.Color(39, 156, 19));
        textNameTituloP.setForeground(new java.awt.Color(255, 255, 255));
        textNameTituloP.setBorder(null);
        textNameTituloP.setOpaque(false);
        panelRegistroProfesional.add(textNameTituloP);
        textNameTituloP.setBounds(153, 318, 266, 20);

        textoFechaNacimientoP.setBackground(new java.awt.Color(39, 156, 19));
        textoFechaNacimientoP.setForeground(new java.awt.Color(255, 255, 255));
        textoFechaNacimientoP.setBorder(null);
        textoFechaNacimientoP.setOpaque(false);
        textoFechaNacimientoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoFechaNacimientoPActionPerformed(evt);
            }
        });
        panelRegistroProfesional.add(textoFechaNacimientoP);
        textoFechaNacimientoP.setBounds(177, 264, 154, 20);

        textApellidoP.setBackground(new java.awt.Color(39, 156, 19));
        textApellidoP.setForeground(new java.awt.Color(255, 255, 255));
        textApellidoP.setBorder(null);
        textApellidoP.setOpaque(false);
        panelRegistroProfesional.add(textApellidoP);
        textApellidoP.setBounds(104, 210, 266, 20);

        textNameP.setBackground(new java.awt.Color(39, 156, 19));
        textNameP.setForeground(new java.awt.Color(255, 255, 255));
        textNameP.setBorder(null);
        textNameP.setOpaque(false);
        panelRegistroProfesional.add(textNameP);
        textNameP.setBounds(98, 154, 266, 20);

        fondoProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registroProfesional.png"))); // NOI18N
        panelRegistroProfesional.add(fondoProfesional);
        fondoProfesional.setBounds(0, 0, 1000, 950);

        getContentPane().add(panelRegistroProfesional);
        panelRegistroProfesional.setBounds(0, 0, 1000, 950);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        Login lg = new Login ();
        dispose();
        lg.setVisible(true);
    }//GEN-LAST:event_botonVolverActionPerformed

    private void textoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoApellidoActionPerformed

    private void textoNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNacionalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNacionalidadActionPerformed

    private void textoFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoFechaActionPerformed

    private void textoFechaNacimientoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoFechaNacimientoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoFechaNacimientoPActionPerformed

    private void textoFechaGraduacionPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoFechaGraduacionPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoFechaGraduacionPActionPerformed

    private void textoFechaGraduacionP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoFechaGraduacionP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoFechaGraduacionP1ActionPerformed

    private void botonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegistroActionPerformed

    private void radioCarneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCarneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioCarneActionPerformed

    private void botonFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonFotoActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }
    
    //Muesta el panel del registro profesional y cierra el panel del registro de usuario
    
    public void panelProfesional(){
        if (panelRegistroUsuario.isVisible()) {
            panelRegistroUsuario.setVisible(false);
        }
        panelRegistroProfesional.setVisible(true);
    }
    
    //Muestra el panel del registro de usuario y cierra el panel de registro de profesional
    
    public void panelUsuario(){
        if (panelRegistroProfesional.isVisible()) {
            panelRegistroProfesional.setVisible(false);
        }
        panelRegistroUsuario.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonFoto;
    private javax.swing.JButton botonFotoP;
    private javax.swing.JButton botonRegistro;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel fondoProfesional;
    private javax.swing.JLabel fondoUsuario;
    private javax.swing.JLabel fotoDePerfilP;
    private javax.swing.JLabel fotosDePerfil;
    private javax.swing.JPanel panelRegistroProfesional;
    private javax.swing.JPanel panelRegistroUsuario;
    private javax.swing.JRadioButton radioAzucares;
    private javax.swing.JRadioButton radioCarne;
    private javax.swing.JRadioButton radioCarniboro;
    private javax.swing.JRadioButton radioCereales;
    private javax.swing.JRadioButton radioDulces;
    private javax.swing.JRadioButton radioFrutas;
    private javax.swing.JRadioButton radioGrasas;
    private javax.swing.JRadioButton radioLacteos;
    private javax.swing.JRadioButton radioLegumbres;
    private javax.swing.JRadioButton radioMacrobiotico;
    private javax.swing.JRadioButton radioOrganico;
    private javax.swing.JRadioButton radioPescado;
    private javax.swing.JRadioButton radioVegano;
    private javax.swing.JRadioButton radioVegetariano;
    private javax.swing.JRadioButton radioVerduras;
    private javax.swing.JTextField textApellidoP;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textNameP;
    private javax.swing.JTextField textNameTituloP;
    private javax.swing.JTextField textoApellido;
    private javax.swing.JTextField textoFecha;
    private javax.swing.JTextField textoFechaGraduacionP;
    private javax.swing.JTextField textoFechaGraduacionP1;
    private javax.swing.JTextField textoFechaNacimientoP;
    private javax.swing.JTextField textoNacionalidad;
    // End of variables declaration//GEN-END:variables
}
