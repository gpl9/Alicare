package alicare;

import javax.swing.*;

public class Alimento {

    private String nombre;
    private String tipo;
    private String nutrientes;
    private double proporcion;
    private String anotaciones;
    private ImageIcon imagenAlimento;

    public Alimento() {
        this.setNombre("No especificado");
        this.setTipo("No especificado");
        this.setNutrientes("No especificado");
        this.setProporcion(0);
        this.setAnotaciones("No especificadas");
    }

    public Alimento(String unNombre, String unTipo, String unosNutrientes, double unaProporcion, String unasAnotaciones, ImageIcon unaImagenAlimento) {
        this.setNombre(unNombre);
        this.setTipo(unTipo);
        this.setNutrientes(unosNutrientes);
        this.setProporcion(unaProporcion);
        this.setAnotaciones(unasAnotaciones);
        this.setImagenAlimento(unaImagenAlimento);
    }

    public String getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(String unasAnotaciones) {
        this.anotaciones = unasAnotaciones;
    }

    public ImageIcon getImagenAlimento() {
        return imagenAlimento;
    }

    public void setImagenAlimento(ImageIcon unaImagenAlimento) {
        this.imagenAlimento = unaImagenAlimento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String unTipo) {
        this.tipo = unTipo;
    }

    public String getNutrientes() {
        return nutrientes;
    }

    public void setNutrientes(String unosNutrientes) {
        this.nutrientes = unosNutrientes;
    }

    public double getProporcion() {
        return proporcion;
    }

    public void setProporcion(double unaProporcion) {
        this.proporcion = unaProporcion;
    }

    @Override
    public String toString() {
        return "\nNombre: \n" + this.getNombre() + "\nTipo de alimento: \n" + this.getTipo()
                + "\nPrincipales nutrientes: \n" + this.getNutrientes() + "\nProporción: \n" + this.getProporcion();
    }
}
