package alicare;

import java.util.*;
import javax.swing.*;

public class Sistema {

    private Alimento alimento;
    private Persona profesional;
    private Persona usuario;
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Profesional> listaProfesionales;
    private ArrayList<Alimento> listaAlimentos;

    public Sistema() {
        usuario = (Persona) new Usuario();
        profesional = (Persona) new Profesional();
        alimento = new Alimento();
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

    public void agregarProfesional(Profesional unProfesional) {
        this.getListaProfesionales().add(unProfesional);
    }

    public void agregarAlimentos(Alimento unAlimento) {
        this.getListaAlimentos().add(unAlimento);
    }

    public void registroUsuario(String nombre, String apellido, String fechaNacimiento, String nacionalidad, ImageIcon unaFotoPerfil) {
        Usuario usuarios = new Usuario();
        usuarios.setNombre(nombre);
        usuarios.setApellido(apellido);
        usuarios.setNacimiento(fechaNacimiento);
        usuarios.setNacionalidad(nacionalidad);
        usuarios.setFotoPerfil(unaFotoPerfil);
        agregarUsuario(usuarios);
    }

    public void registroProfesional(String nombre, String apellido, String nacimiento, String nombreTitulo, String graduacion, String paisTitulo, ImageIcon fotoPerfil) {
        Profesional profesionales = new Profesional();
        profesionales.setNombre(nombre);
        profesionales.setApellido(apellido);
        profesionales.setNacimiento(nacimiento);
        profesionales.setNombreTitulo(nombreTitulo);
        profesionales.setGraduacion(graduacion);
        profesionales.setPaisTitulo(paisTitulo);
        profesionales.setFotoPerfil(fotoPerfil);
        agregarProfesional(profesionales);
    }

}
