package alicare;

import javax.swing.*;

public abstract class Persona {

    private String nombre;
    private String apellido;
    private String nacimiento;
    private ImageIcon fotoPerfil;

    public Persona() {
        this.setNombre("");
        this.setApellido("");
        this.setNacimiento("");
    }

    public Persona(String unNombre, String unApellido, String unNacimiento, ImageIcon unaFotoPerfil) {
        this.setNombre(unNombre);
        this.setApellido(unApellido);
        this.setNacimiento(unNacimiento);
        this.setFotoPerfil(unaFotoPerfil);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String unApellido) {
        this.apellido = unApellido;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String unNacimiento) {
        this.nacimiento = unNacimiento;
    }

    public ImageIcon getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(ImageIcon unaFotoPerfil) {
        this.fotoPerfil = unaFotoPerfil;
    }

    @Override
    public String toString() {
        return "\nNombre: \n" + this.getNombre() + "\nApellido: \n" + this.getApellido()
                + "\nFecha de nacimiento: \n" + this.getNacimiento();
    }

}
