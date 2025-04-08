package org.example;

public class Artista {

    private int id;
    private String nombre;
    private String genero;
    private String discoMasVendido;
    private int ventasTotales;

    public Artista(int id, String nombre, String genero, String discoMasVendido, int ventasTotales) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.discoMasVendido = discoMasVendido;
        this.ventasTotales = ventasTotales;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiscoMasVendido() {
        return discoMasVendido;
    }

    public void setDiscoMasVendido(String discoMasVendido) {
        this.discoMasVendido = discoMasVendido;
    }

    public int getVentasTotales() {
        return ventasTotales;
    }

    public void setVentasTotales(int ventasTotales) {
        this.ventasTotales = ventasTotales;
    }

    public void sumarVentas(int cantidad){
        this.ventasTotales += cantidad;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", discoMasVendido='" + discoMasVendido + '\'' +
                ", ventasTotales='" + ventasTotales + '\'' +
                '}';
    }


}
