package interfaz;

import alicare.*;
import java.awt.Image;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PantallaPrincipal extends javax.swing.JFrame {

    DefaultListModel modeloListaAlimentos;
    Sistema sistema;
    ImageIcon foto;

    public PantallaPrincipal(Sistema unSistema) {
        sistema = unSistema;
        initComponents();
        setLocationRelativeTo(null);
        panelChat.setVisible(false);
        panelListadoAlimentos.setVisible(false);
        modeloListaAlimentos = new DefaultListModel();
        listaAlimentos.setModel(modeloListaAlimentos);
        listaAlimentos.setCellRenderer(new ListaRender(sistema, false, false, panelListadoAlimentos.isVisible()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAlimentos = new javax.swing.JButton();
        botonRegistroAlimentos = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        bottonToggleChatList = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();
        panelChat = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        circuloFoto = new javax.swing.JLabel();
        fotoDePerfil = new javax.swing.JLabel();
        panelRegistroAlimentos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textoNombreAlimento = new javax.swing.JTextField();
        textoAlimento = new javax.swing.JTextField();
        textoNutrientes = new javax.swing.JTextField();
        textoProporcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        scrollAnotaciones = new javax.swing.JScrollPane();
        textoAnotaciones = new javax.swing.JTextArea();
        fotoDeAlimento = new javax.swing.JLabel();
        botonSeleccionarFoto = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        panelListadoAlimentos = new javax.swing.JPanel();
        scrollListadoAlimentos = new javax.swing.JScrollPane();
        listaAlimentos = new javax.swing.JList<>();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        botonAlimentos.setText("Alimentos");
        botonAlimentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAlimentos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/selectedButton.png"))); // NOI18N
        botonAlimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlimentosActionPerformed(evt);
            }
        });
        getContentPane().add(botonAlimentos);
        botonAlimentos.setBounds(216, 200, 209, 52);

        botonRegistroAlimentos.setText("Registro de Alimentos");
        botonRegistroAlimentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegistroAlimentos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/selectedButton.png"))); // NOI18N
        botonRegistroAlimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistroAlimentosActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistroAlimentos);
        botonRegistroAlimentos.setBounds(3, 200, 209, 52);

        jButton3.setText("Configuración");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton3);
        jButton3.setBounds(429, 200, 209, 52);

        jButton2.setText("jButton1");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton2);
        jButton2.setBounds(642, 200, 207, 52);

        bottonToggleChatList.setText("jButton5");
        bottonToggleChatList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bottonToggleChatList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottonToggleChatListActionPerformed(evt);
            }
        });
        getContentPane().add(bottonToggleChatList);
        bottonToggleChatList.setBounds(1886, 570, 34, 86);

        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir_p.png"))); // NOI18N
        botonSalir.setContentAreaFilled(false);
        botonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir_presionado.png"))); // NOI18N
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(botonSalir);
        botonSalir.setBounds(1840, 1040, 75, 35);

        botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver_p.png"))); // NOI18N
        botonVolver.setContentAreaFilled(false);
        botonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVolver.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver_presionado.png"))); // NOI18N
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });
        getContentPane().add(botonVolver);
        botonVolver.setBounds(10, 1040, 75, 35);

        panelChat.setLayout(null);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        panelChat.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 250, 770);

        getContentPane().add(panelChat);
        panelChat.setBounds(1670, 258, 250, 770);

        circuloFoto.setText("labelFotoCirculo");
        getContentPane().add(circuloFoto);
        circuloFoto.setBounds(1720, 20, 170, 165);

        fotoDePerfil.setText("labelFotoCirculo");
        getContentPane().add(fotoDePerfil);
        fotoDePerfil.setBounds(1720, 20, 170, 165);

        panelRegistroAlimentos.setOpaque(false);
        panelRegistroAlimentos.setLayout(null);

        jLabel1.setText("Nombre de Alimento:");
        panelRegistroAlimentos.add(jLabel1);
        jLabel1.setBounds(260, 70, 130, 30);

        jLabel2.setText("Tipo de Alimento:");
        panelRegistroAlimentos.add(jLabel2);
        jLabel2.setBounds(260, 130, 130, 30);

        jLabel3.setText("Principales Nutrientes:");
        panelRegistroAlimentos.add(jLabel3);
        jLabel3.setBounds(260, 200, 130, 20);

        jLabel4.setText("Proporción:");
        panelRegistroAlimentos.add(jLabel4);
        jLabel4.setBounds(260, 270, 130, 16);
        panelRegistroAlimentos.add(textoNombreAlimento);
        textoNombreAlimento.setBounds(390, 70, 270, 22);

        textoAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoAlimentoActionPerformed(evt);
            }
        });
        panelRegistroAlimentos.add(textoAlimento);
        textoAlimento.setBounds(370, 130, 290, 22);
        panelRegistroAlimentos.add(textoNutrientes);
        textoNutrientes.setBounds(400, 200, 260, 22);
        panelRegistroAlimentos.add(textoProporcion);
        textoProporcion.setBounds(340, 270, 210, 22);

        jLabel5.setText("Otras Anotaciones:");
        panelRegistroAlimentos.add(jLabel5);
        jLabel5.setBounds(260, 350, 120, 16);

        textoAnotaciones.setColumns(20);
        textoAnotaciones.setRows(5);
        scrollAnotaciones.setViewportView(textoAnotaciones);

        panelRegistroAlimentos.add(scrollAnotaciones);
        scrollAnotaciones.setBounds(380, 350, 290, 150);

        fotoDeAlimento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelRegistroAlimentos.add(fotoDeAlimento);
        fotoDeAlimento.setBounds(730, 70, 190, 110);

        botonSeleccionarFoto.setText("Seleccionar foto");
        botonSeleccionarFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSeleccionarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionarFotoActionPerformed(evt);
            }
        });
        panelRegistroAlimentos.add(botonSeleccionarFoto);
        botonSeleccionarFoto.setBounds(970, 150, 180, 25);

        jButton6.setText("Registrar Alimento");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        panelRegistroAlimentos.add(jButton6);
        jButton6.setBounds(630, 670, 230, 25);

        getContentPane().add(panelRegistroAlimentos);
        panelRegistroAlimentos.setBounds(0, 258, 1920, 822);

        panelListadoAlimentos.setOpaque(false);
        panelListadoAlimentos.setLayout(null);

        scrollListadoAlimentos.setBackground(new java.awt.Color(255, 255, 255));
        scrollListadoAlimentos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        scrollListadoAlimentos.setForeground(new java.awt.Color(255, 255, 255));

        listaAlimentos.setBackground(new java.awt.Color(254, 254, 254));
        listaAlimentos.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        listaAlimentos.setForeground(new java.awt.Color(39, 156, 19));
        listaAlimentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaAlimentos.setSelectionBackground(new java.awt.Color(39, 156, 19));
        listaAlimentos.setSelectionForeground(new java.awt.Color(254, 254, 254));
        scrollListadoAlimentos.setViewportView(listaAlimentos);

        panelListadoAlimentos.add(scrollListadoAlimentos);
        scrollListadoAlimentos.setBounds(20, 20, 1230, 750);

        getContentPane().add(panelListadoAlimentos);
        panelListadoAlimentos.setBounds(0, 258, 1920, 822);

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Alicare2.png"))); // NOI18N
        getContentPane().add(labelFondo);
        labelFondo.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        Login lg = new Login(sistema);
        dispose();
        lg.setVisible(true);
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void bottonToggleChatListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottonToggleChatListActionPerformed
        toggleVentaChat();
    }//GEN-LAST:event_bottonToggleChatListActionPerformed

    private void botonAlimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlimentosActionPerformed
        toggleVentanaAlimentos();
        modeloListaAlimentos.clear();
        agregarValoresListaAlimentos();
    }//GEN-LAST:event_botonAlimentosActionPerformed

    private void botonRegistroAlimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistroAlimentosActionPerformed
        toggleVentanaRegistroAlimentos();
    }//GEN-LAST:event_botonRegistroAlimentosActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String nombre = textoNombreAlimento.getText();
        String tipo = textoAlimento.getText();
        String nutrientes = textoNutrientes.getText();
        double proporcion = Double.parseDouble(textoProporcion.getText());
        String anotaciones = textoAnotaciones.getText();
        sistema.registroAnimatos(nombre, tipo, nutrientes, proporcion, anotaciones, foto);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void textoAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoAlimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoAlimentoActionPerformed

    private void botonSeleccionarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionarFotoActionPerformed
        importarFoto();
    }//GEN-LAST:event_botonSeleccionarFotoActionPerformed

    public void toggleVentanaAlimentos() {
        panelRegistroAlimentos.setVisible(false);
        if (!panelListadoAlimentos.isVisible()) {
            panelListadoAlimentos.setVisible(true);
        }
    }

    public void toggleVentanaRegistroAlimentos() {
        panelListadoAlimentos.setVisible(false);
        if (!panelRegistroAlimentos.isVisible()) {
            panelRegistroAlimentos.setVisible(true);
        }
    }

    public void toggleVentaChat() {
        if (panelChat.isVisible()) {
            panelChat.setVisible(false);
            bottonToggleChatList.setLocation(1886, 570);
        } else {
            panelChat.setVisible(true);
            bottonToggleChatList.setLocation(1640, 570);
        }
    }

    public void importarFoto() {
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        //filtra los archivos que puede elegir
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        //cuando el usuario apreta en guardar en el File Chooser
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            fotoDeAlimento.setIcon(modificarTamañoFoto(path));
        } //cuando el usuario apreta en guardar en el File Chooser
        else if (result == JFileChooser.CANCEL_OPTION) {
            System.out.println("No File Select");
        }
    }

    public ImageIcon modificarTamañoFoto(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(fotoDeAlimento.getWidth(), fotoDeAlimento.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        foto = image;
        return image;
    }

    public void agregarValoresListaAlimentos() {
        String nombre;
        for (Alimento alimentos : sistema.getListaAlimentos()) {
            nombre = alimentos.getNombre();
            modeloListaAlimentos.addElement(nombre);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAlimentos;
    private javax.swing.JButton botonRegistroAlimentos;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonSeleccionarFoto;
    private javax.swing.JButton botonVolver;
    private javax.swing.JButton bottonToggleChatList;
    private javax.swing.JLabel circuloFoto;
    private javax.swing.JLabel fotoDeAlimento;
    private javax.swing.JLabel fotoDePerfil;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JList<String> listaAlimentos;
    private javax.swing.JPanel panelChat;
    private javax.swing.JPanel panelListadoAlimentos;
    private javax.swing.JPanel panelRegistroAlimentos;
    private javax.swing.JScrollPane scrollAnotaciones;
    private javax.swing.JScrollPane scrollListadoAlimentos;
    private javax.swing.JTextField textoAlimento;
    private javax.swing.JTextArea textoAnotaciones;
    private javax.swing.JTextField textoNombreAlimento;
    private javax.swing.JTextField textoNutrientes;
    private javax.swing.JTextField textoProporcion;
    // End of variables declaration//GEN-END:variables
}
