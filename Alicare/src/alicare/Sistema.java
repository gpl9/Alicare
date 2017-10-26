package alicare;

import java.util.*;

public class Sistema {

    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Profesional> listaProfesionales;
    private ArrayList<Alimento> listaAlimentos;

    public Sistema() {
        listaUsuarios = new ArrayList<>();
        listaProfesionales = new ArrayList<>();
        listaAlimentos = new ArrayList<>();
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public ArrayList<Profesional> getListaProfesionales() {
        return listaProfesionales;
    }

    public ArrayList<Alimento> getListaAlimentos() {
        return listaAlimentos;
    }

    public void agregarUsuario(Usuario unUsuario) {
        this.getListaUsuarios().add(unUsuario);
    }

    public void agregarSocio(Profesional unProfesional) {
        this.getListaProfesionales().add(unProfesional);
    }

    public void agregarSocio(Alimento unAlimento) {
        this.getListaAlimentos().add(unAlimento);
    }
}
