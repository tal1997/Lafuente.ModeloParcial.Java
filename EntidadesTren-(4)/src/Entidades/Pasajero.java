package Entidades;

import java.util.Objects;


public class Pasajero {

    //ATRIBUTOS
    private String apellido;
    private String nombre;
    private Rangos rango;
    
//CONSTRUCTOR
    public Pasajero() {
        this.apellido = "SIN APELLIDO";
        this.nombre = "SIN NOMBRE";
        this.rango = Rangos.CLIENTE;
    }

    public Pasajero(String apellido) {
        this();
        this.apellido = apellido;
    }

    public Pasajero(String apellido, String nombre) {
        this(apellido);
        this.nombre = nombre;
    }

    public Pasajero(String apellido, String nombre, Rangos rango) {
        this(apellido, nombre);
        this.rango = rango;
    }

    
    //PROPIEDADES
    public String getApellido() {
        return this.apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Rangos getRango() {
        return this.rango;
    }

    
    //METODOS
    public static boolean sonIguales(Pasajero p1, Pasajero p2) {
        
        if (p1 == null || p2 == null)
        {
            return false;
        }
        
        return (p1.equals(p2) && p1.rango == p2.rango);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n--- PASAJERO ---");
        sb.append("\nNOMBRE: ").append(this.getNombre());
        sb.append("\nAPELLIDO: ").append(this.getApellido());
        sb.append("\nRANGO: ").append(this.getRango().toString());  
        
        return sb.toString();
    }

    @Override
    public boolean equals(Object pasajero) {
        
        if (pasajero == null || this.getClass() != pasajero.getClass())
        {
            return false;
        }
        
        Pasajero castPasajero = (Pasajero)pasajero;
        
        return (this.nombre.equals(castPasajero.nombre) && 
                this.apellido.equals(castPasajero.apellido));
        
    }

    @Override
    public int hashCode() {
        
        return Objects.hashCode(this.toString());
    }

}