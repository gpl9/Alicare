package alicare;

public class Alimento {

    private String nombre;
    private String tipo;
    private String nutrientes;
    private double proporcion;

    public Alimento() {
        this.setNombre("");
        this.setTipo("");
        this.setNutrientes("");
        this.setProporcion(0);
    }

    public Alimento(String unNombre, String unTipo, String unosNutrientes, double unaProporcion) {
        this.setNombre(unNombre);
        this.setTipo(unTipo);
        this.setNutrientes(unosNutrientes);
        this.setProporcion(unaProporcion);
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
