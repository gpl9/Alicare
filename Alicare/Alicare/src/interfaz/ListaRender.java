package interfaz;

import alicare.*;
import java.awt.*;
import javax.swing.*;

public class ListaRender extends JLabel implements ListCellRenderer {

    boolean panelUsuario;
    boolean panelProfesional;
    boolean panelAlimentos;
    Sistema sistema;

    public ListaRender(Sistema unSistema, boolean unPanelDeUsuario, boolean unPanelProfesional, boolean unPanelAlimento) {
        this.sistema = unSistema;
        this.panelUsuario = unPanelDeUsuario;
        this.panelProfesional = unPanelProfesional;
        this.panelAlimentos = unPanelAlimento;
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object valor, int i, boolean isSelected, boolean bln1) {
        ImageIcon foto = new ImageIcon();
        Image imagen;
        if (panelUsuario) {

            for (Usuario listaUsuario : sistema.getListaUsuarios()) {
                foto = listaUsuario.getFotoPerfil();
                imagen = foto.getImage();
                foto.setImage(imagen.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
            }
        } else if (panelProfesional) {
            for (Profesional listaProfesionales : sistema.getListaProfesionales()) {
                foto = listaProfesionales.getFotoPerfil();
                imagen = foto.getImage();
                foto.setImage(imagen.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
            }
        } else {
            for (Alimento listaAlimentos : sistema.getListaAlimentos()) {
                foto = listaAlimentos.getImagenAlimento();
                imagen = foto.getImage();
                foto.setImage(imagen.getScaledInstance(250, 150, Image.SCALE_SMOOTH));
            }
        }
        String nombre = valor.toString();
        setText(nombre);
        if (!nombre.equals("")) {
            setIcon(foto);
        }
        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        setEnabled(list.isEnabled());
        setFont(list.getFont());
        setOpaque(true);
        return this;
    }

}
