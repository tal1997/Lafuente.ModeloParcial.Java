package Entidades;

import java.util.ArrayList;

/*
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class Tren {

    //ATRIBUTOS
    protected int cantidadMaximaPasajeros;
    protected String destino;
    protected boolean motorEncendido;
    
    
    //CONSTRUCTOR
    public Tren(int cantMaxPasajeros, String destino) {
        this.cantidadMaximaPasajeros = cantMaxPasajeros;
        this.destino = destino;
        this.motorEncendido = false;
    }


    //PROPIEDADES
    public int getCantidadMaximaPasajeros() {
        return this.cantidadMaximaPasajeros;
    }

    public boolean getMotorEncendido() {
        return this.motorEncendido;
    }

    public String getDestino() {
        return this.destino.toUpperCase();
    }

    public void setMotorEncendido(boolean setMotor) {
        this.motorEncendido = setMotor;
    }

    //METODOS
    public abstract ArrayList<Pasajero> getPasajeros();
    
    public static boolean sonIguales(Pasajero p, Tren t) {
        
        if (p == null || t == null)
        {
            return false;
        }
        
        for(Pasajero pTest : t.getPasajeros())
        {
            if (Pasajero.sonIguales(pTest, p))
            {
                return true;
            }
        }
        return false;
    }

    public void agregar(Pasajero p) {
        
        if (getPasajeros().size() >= this.cantidadMaximaPasajeros)
        {
            System.out.println("TREN COMPLETO, NO SUBE MAS NADIE!");
        }
        else if (Tren.sonIguales(p, this))
        {
            System.out.println("EL PASAJERO YA SE ENCUENTRA EN EL TREN.");
        }
        else{
            getPasajeros().add(p);
        }
    }

    @Override
    public String toString(){
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("\nCantidad Maxima Pasajeros: ").append(this.cantidadMaximaPasajeros);
        sb.append("\nDestino: ").append(this.destino);
        sb.append("\nMotor en marcha: ").append(this.motorEncendido);
        
        return sb.toString();
    }

}