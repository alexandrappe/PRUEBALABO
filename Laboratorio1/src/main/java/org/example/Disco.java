package org.example;

public class Disco {
private Artista artista;
private String titulo;
private String generoMusical;
private int ventasTotales;

    public Disco(Artista artista, String titulo, String generoMusical, int ventasTotales) {
        this.artista = artista;
        this.titulo = titulo;
        this.generoMusical = generoMusical;
        this.ventasTotales = ventasTotales;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public int getVentasTotales() {
        return ventasTotales;
    }

    public void setVentasTotales(int ventasTotales) {
        this.ventasTotales = ventasTotales;
    }

    public void registrarVentaDisco(int cantidad){
        ventasTotales += cantidad;
        artista.sumarVentas(cantidad);

        if(ventasTotales > artista.getVentasTotales()){
            artista.setDiscoMasVendido(titulo);
        }
    }

        private int VentasDiscoMasVendido(){
        return ventasTotales;
        }

    @Override
    public String toString() {
        return "Disco{" +
                "artista=" + artista +
                ", titulo='" + titulo + '\'' +
                ", generoMusical='" + generoMusical + '\'' +
                ", ventasTotales=" + ventasTotales +
                '}';
    }
}
