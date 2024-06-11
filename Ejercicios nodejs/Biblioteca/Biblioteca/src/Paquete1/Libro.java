package paquete1;

public class Libro extends Material {
    private String genero;
    private int numeroEdicion;

    public Libro(String titulo, String autor, int anoPublicacion, String genero, int numeroEdicion) {
        super(titulo, autor, anoPublicacion);
        this.genero = genero;
        this.numeroEdicion = numeroEdicion;
    }

    public String getGenero() {
        return genero;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Genero: " + genero);
        System.out.println("Numero de Edicion: " + numeroEdicion);
    }
}
