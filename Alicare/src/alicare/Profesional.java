package alicare;

public class Profesional extends Persona {

    private String nombreTitulo;
    private String graduacion;
    private String paisTitulo;

    public Profesional() {
        this.setNombreTitulo("");
        this.setGraduacion("");
        this.setPaisTitulo("");
    }

    public Profesional(String unNombreTitulo, String unaGraduacion, String unPaisTitulo) {
        this.setNombreTitulo(unNombreTitulo);
        this.setGraduacion(unaGraduacion);
        this.setPaisTitulo(unPaisTitulo);
    }

    public String getNombreTitulo() {
        return nombreTitulo;
    }

    public void setNombreTitulo(String unNombreTitulo) {
        this.nombreTitulo = unNombreTitulo;
    }

    public String getGraduacion() {
        return graduacion;
    }

    public void setGraduacion(String unaGraduacion) {
        this.graduacion = unaGraduacion;
    }

    public String getPaisTitulo() {
        return paisTitulo;
    }

    public void setPaisTitulo(String unPaisTitulo) {
        this.paisTitulo = unPaisTitulo;
    }

   
    @Override
    public String toString() {
        return super.toString() + "\nNombre del Titulo: \n" + this.getNombreTitulo()
                + "\nFecha de graduación: \n" + this.getGraduacion() + "\nPais del titulo: \n" + this.getPaisTitulo();
    }
}
