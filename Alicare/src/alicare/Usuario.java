package alicare;

public class Usuario extends Persona {

    private String nacionalidad;
    private boolean[] preferencias;
    private boolean[] restricciones;

    public Usuario() {
        this.setNacionalidad("");
        this.setPreferencias(null);
        this.setRestricciones(null);
    }

    public Usuario(String unaNacionalidad, boolean[] unaPreferencias, boolean[] unaRestricciones) {
        this.setNacionalidad(unaNacionalidad);
        this.setPreferencias(unaPreferencias);
        this.setRestricciones(unaRestricciones);
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String unaNacionalidad) {
        this.nacionalidad = unaNacionalidad;
    }

    public boolean[] getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(boolean[] unaPreferencias) {
        this.preferencias = unaPreferencias;
    }

    public boolean[] getRestricciones() {
        return restricciones;
    }

    public void setRestricciones(boolean[] unaRestricciones) {
        this.restricciones = unaRestricciones;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNacionalidad: \n" + this.getNacionalidad()
                + "\nPreferencias: \n" + this.getPreferencias() + "\nRestricciones: \n" + this.getRestricciones();
    }
}
