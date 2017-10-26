package alicare;

public class Usuario extends Persona {

    private String nacionalidad;
    private String preferencias;
    private String restricciones;

    public Usuario() {
        this.setNacionalidad("");
        this.setPreferencias("");
        this.setRestricciones("");
    }

    public Usuario(String unaNacionalidad, String unaPreferencias, String unaRestricciones) {
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

    public String getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(String unaPreferencias) {
        this.preferencias = unaPreferencias;
    }

    public String getRestricciones() {
        return restricciones;
    }

    public void setRestricciones(String unaRestricciones) {
        this.restricciones = unaRestricciones;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNacionalidad: \n" + this.getNacionalidad()
                + "\nPreferencias: \n" + this.getPreferencias() + "\nRestricciones: \n" + this.getRestricciones();
    }
}
