package proyectop2.igu;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private int edad;
    private String cedula;
    private int numeroUsuario;
    private Libro libro;
    private int numeroLibros;
    List<Libro> listaLibros = new ArrayList<>();
    public Cliente(){

    }

    public Cliente(String nombre, int edad, String cedula, int numeroUsuario, Libro libro, int numeroLibros, List<Libro> listaLibros) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.numeroUsuario = numeroUsuario;
        this.libro = libro;
        this.numeroLibros = numeroLibros;
        this.listaLibros = listaLibros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getNumeroUsuario() {
        return numeroUsuario;
    }

    public void setNumeroUsuario(int numeroUsuario) {
        this.numeroUsuario = numeroUsuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public int getNumeroLibros() {
        return numeroLibros;
    }

    public void setNumeroLibros(int numeroLibros) {
        this.numeroLibros = numeroLibros;
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }
}
