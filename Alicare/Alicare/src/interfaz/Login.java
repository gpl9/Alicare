package interfaz;

import alicare.Sistema;
import javax.swing.*;

public class Login extends javax.swing.JFrame {

    DefaultListModel listaModeloU;
    DefaultListModel listaModeloP;

    Sistema sistema;

    public Login(Sistema unSistema) {
        sistema = unSistema;
        initComponents();
        listaModeloU = new DefaultListModel();
        listaModeloP = new DefaultListModel();
        listaUsuarios.setModel(listaModeloU);
        listaProfesional.setModel(listaModeloP);
        listaUsuarios.setCellRenderer(new ListaRender(sistema, panelSeleccionarUsuario.isVisible(), panelSeleccionarProfesional.isVisible(), false));
        listaProfesional.setCellRenderer(new ListaRender(sistema, panelSeleccionarUsuario.isVisible(), panelSeleccionarProfesional.isVisible(), false));
        setLocationRelativeTo(null);
        panelSeleccionarUsuario.setVisible(false);
        panelSeleccionarProfesional.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonInvitado = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        panelProfesional = new javax.swing.JPanel();
        botonRP = new javax.swing.JButton();
        botonSP = new javax.swing.JButton();
        panelUsuario = new javax.swing.JPanel();
        botonRU = new javax.swing.JButton();
        botonSU = new javax.swing.JButton();
        panelSeleccionarProfesional = new javax.swing.JPanel();
        botonVolverP = new javax.swing.JButton();
        ingresarProfesional = new javax.swing.JButton();
        scrollProfesional = new javax.swing.JScrollPane();
        listaProfesional = new javax.swing.JList<>();
        panelSeleccionarUsuario = new javax.swing.JPanel();
        botonVolverU = new javax.swing.JButton();
        ingresarUsuario = new javax.swing.JButton();
        scrollUsuarios = new javax.swing.JScrollPane();
        listaUsuarios = new javax.swing.JList<>();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 950));
        setMinimumSize(new java.awt.Dimension(1000, 950));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        botonInvitado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/invitado_normal.png"))); // NOI18N
        botonInvitado.setContentAreaFilled(false);
        botonInvitado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonInvitado.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/invitado_presionado.png"))); // NOI18N
        botonInvitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInvitadoActionPerformed(evt);
            }
        });
        getContentPane().add(botonInvitado);
        botonInvitado.setBounds(440, 910, 120, 15);

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
        botonSalir.setBounds(922, 912, 75, 35);

        panelProfesional.setOpaque(false);
        panelProfesional.setLayout(null);

        botonRP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registro_profesional_normal.png"))); // NOI18N
        botonRP.setContentAreaFilled(false);
        botonRP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRP.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registro_profesional_rollover.png"))); // NOI18N
        botonRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRPActionPerformed(evt);
            }
        });
        panelProfesional.add(botonRP);
        botonRP.setBounds(90, 10, 291, 291);

        botonSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/seleccion_profesional_normal.png"))); // NOI18N
        botonSP.setContentAreaFilled(false);
        botonSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSP.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/seleccion_profesional_presionado.png"))); // NOI18N
        botonSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSPActionPerformed(evt);
            }
        });
        panelProfesional.add(botonSP);
        botonSP.setBounds(90, 640, 291, 34);

        getContentPane().add(panelProfesional);
        panelProfesional.setBounds(520, 210, 450, 680);

        panelUsuario.setOpaque(false);
        panelUsuario.setLayout(null);

        botonRU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registro_usuario_normal.png"))); // NOI18N
        botonRU.setContentAreaFilled(false);
        botonRU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRU.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registro_usuario_rollover.png"))); // NOI18N
        botonRU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRUActionPerformed(evt);
            }
        });
        panelUsuario.add(botonRU);
        botonRU.setBounds(70, 10, 291, 291);

        botonSU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/seleccion_usuario_normal.png"))); // NOI18N
        botonSU.setContentAreaFilled(false);
        botonSU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSU.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/seleccion_usuario_presionado.png"))); // NOI18N
        botonSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSUActionPerformed(evt);
            }
        });
        panelUsuario.add(botonSU);
        botonSU.setBounds(70, 640, 291, 34);

        getContentPane().add(panelUsuario);
        panelUsuario.setBounds(30, 210, 450, 680);

        panelSeleccionarProfesional.setOpaque(false);
        panelSeleccionarProfesional.setLayout(null);

        botonVolverP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver_normal.png"))); // NOI18N
        botonVolverP.setContentAreaFilled(false);
        botonVolverP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVolverP.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver_presionado.png"))); // NOI18N
        botonVolverP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverPActionPerformed(evt);
            }
        });
        panelSeleccionarProfesional.add(botonVolverP);
        botonVolverP.setBounds(5, 640, 75, 35);

        ingresarProfesional.setText("Ingresar");
        panelSeleccionarProfesional.add(ingresarProfesional);
        ingresarProfesional.setBounds(180, 490, 90, 23);

        scrollProfesional.setBorder(null);
        scrollProfesional.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        listaProfesional.setBackground(new java.awt.Color(39, 156, 19));
        listaProfesional.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        listaProfesional.setForeground(new java.awt.Color(255, 255, 255));
        listaProfesional.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaProfesional.setSelectionBackground(new java.awt.Color(255, 255, 255));
        listaProfesional.setSelectionForeground(new java.awt.Color(39, 156, 19));
        scrollProfesional.setViewportView(listaProfesional);

        panelSeleccionarProfesional.add(scrollProfesional);
        scrollProfesional.setBounds(0, 0, 450, 470);

        getContentPane().add(panelSeleccionarProfesional);
        panelSeleccionarProfesional.setBounds(520, 210, 450, 680);

        panelSeleccionarUsuario.setOpaque(false);
        panelSeleccionarUsuario.setLayout(null);

        botonVolverU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver_normal.png"))); // NOI18N
        botonVolverU.setContentAreaFilled(false);
        botonVolverU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVolverU.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver_presionado.png"))); // NOI18N
        botonVolverU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverUActionPerformed(evt);
            }
        });
        panelSeleccionarUsuario.add(botonVolverU);
        botonVolverU.setBounds(5, 640, 75, 35);

        ingresarUsuario.setText("Ingresar");
        panelSeleccionarUsuario.add(ingresarUsuario);
        ingresarUsuario.setBounds(180, 490, 90, 23);

        scrollUsuarios.setBorder(null);
        scrollUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        listaUsuarios.setBackground(new java.awt.Color(39, 156, 19));
        listaUsuarios.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        listaUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        listaUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaUsuarios.setSelectionBackground(new java.awt.Color(255, 255, 255));
        listaUsuarios.setSelectionForeground(new java.awt.Color(39, 156, 19));
        listaUsuarios.setVerifyInputWhenFocusTarget(false);
        scrollUsuarios.setViewportView(listaUsuarios);

        panelSeleccionarUsuario.add(scrollUsuarios);
        scrollUsuarios.setBounds(0, 0, 450, 470);

        getContentPane().add(panelSeleccionarUsuario);
        panelSeleccionarUsuario.setBounds(30, 210, 450, 680);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alicare.png"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 1000, 950);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonRUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRUActionPerformed
        Registro rg = new Registro(sistema);
        rg.panelUsuario();
        dispose();
        rg.setVisible(true);
    }//GEN-LAST:event_botonRUActionPerformed

    private void botonRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRPActionPerformed
        Registro rg = new Registro(sistema);
        rg.panelProfesional();
        dispose();
        rg.setVisible(true);
    }//GEN-LAST:event_botonRPActionPerformed

    private void botonSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSUActionPerformed
        toggleSeleccionDeUsuario();
        listaModeloU.clear();
        agregarValoresListas();
    }//GEN-LAST:event_botonSUActionPerformed

    private void botonSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSPActionPerformed
        toggleSeleccionDeProfesional();
        listaModeloP.clear();
        agregarValoresListas();
    }//GEN-LAST:event_botonSPActionPerformed

    private void botonVolverUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverUActionPerformed
        toggleSeleccionDeUsuario();
    }//GEN-LAST:event_botonVolverUActionPerformed

    private void botonVolverPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverPActionPerformed
        toggleSeleccionDeProfesional();
    }//GEN-LAST:event_botonVolverPActionPerformed

    private void botonInvitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInvitadoActionPerformed
        PantallaPrincipal pp = new PantallaPrincipal(sistema);
        dispose();
        pp.setVisible(true);
    }//GEN-LAST:event_botonInvitadoActionPerformed

    public void toggleSeleccionDeUsuario() {
        if (panelSeleccionarUsuario.isVisible()) {
            panelSeleccionarUsuario.setVisible(false);
            panelUsuario.setVisible(true);
        } else {
            panelSeleccionarUsuario.setVisible(true);
            panelUsuario.setVisible(false);
        }
    }

    public void toggleSeleccionDeProfesional() {
        if (panelSeleccionarProfesional.isVisible()) {
            panelSeleccionarProfesional.setVisible(false);
            panelProfesional.setVisible(true);
        } else {
            panelSeleccionarProfesional.setVisible(true);
            panelProfesional.setVisible(false);
        }
    }

    public void agregarValoresListas() {
        String nombre;
        if (panelSeleccionarUsuario.isVisible()) {
            for (int i = 0; i < sistema.getListaUsuarios().size(); i++) {
                nombre = sistema.getListaUsuarios().get(i).getNombre();
                listaModeloU.addElement(nombre);
            }
        } else {
            for (int i = 0; i < sistema.getListaProfesionales().size(); i++) {
                nombre = sistema.getListaProfesionales().get(i).getNombre();
                listaModeloP.addElement(nombre);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInvitado;
    private javax.swing.JButton botonRP;
    private javax.swing.JButton botonRU;
    private javax.swing.JButton botonSP;
    private javax.swing.JButton botonSU;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonVolverP;
    private javax.swing.JButton botonVolverU;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton ingresarProfesional;
    private javax.swing.JButton ingresarUsuario;
    private javax.swing.JList<String> listaProfesional;
    private javax.swing.JList<String> listaUsuarios;
    private javax.swing.JPanel panelProfesional;
    private javax.swing.JPanel panelSeleccionarProfesional;
    private javax.swing.JPanel panelSeleccionarUsuario;
    private javax.swing.JPanel panelUsuario;
    private javax.swing.JScrollPane scrollProfesional;
    private javax.swing.JScrollPane scrollUsuarios;
    // End of variables declaration//GEN-END:variables
}
