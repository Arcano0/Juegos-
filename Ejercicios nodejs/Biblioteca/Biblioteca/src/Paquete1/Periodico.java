package paquete1;

public class Periodico extends Material {
    private String fecha;

    public Periodico(String titulo, String autor, int anoPublicacion, String fecha) {
        super(titulo, autor, anoPublicacion);
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Fecha: " + fecha);
    }
}
