package Entidades;

import java.util.ArrayList;

/*
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class TrenBala extends Tren {

    //ATRIBUTOS
    protected int cantidadElectroimanes;
    protected ArrayList<Pasajero> pasajeros;
    
    
    //CONSTRUCTOR
    public TrenBala(int cantMaxPasajeros, String destino, int cantElectroimanes) {
        super(cantMaxPasajeros, destino);
        this.cantidadElectroimanes = cantElectroimanes;
        this.pasajeros = new ArrayList<>();
    }
    
    
    //PROPIEDADES
    @Override
    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    //METODOS
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("\n--- Tren Bala ---");
        sb.append("Cantidad Electroimanes: ").append(this.cantidadElectroimanes);
        sb.append(super.toString());
        
        return sb.toString();
    }

}